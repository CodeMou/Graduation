/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.cqwu.graduation.controller;

import com.cqwu.graduation.bean.*;
import com.cqwu.graduation.biz.*;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.server.PathParam;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @author Administrator (Administrator@yiji.com)
 * @version 1.0
 * @filename com.cqwu.graduation.controller
 * @since 2019/2/15
 */
@Controller
public class BackstageController {

	@Autowired
	private TicketManager ticketManager;
	@Autowired
	private UserManager userManager;
	@Autowired
	private TrainManager trainManager;
	@Autowired
	private MatchManager matchManager;
	@Autowired
	private FieldManager fieldManager;

	/**
	 * 获取所有普通用户的信息（主页）
	 *
	 * @param PageNum
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/BackstageUserNormal", produces = "text/html;charset=UTF-8")
	public String selectUserNO(@RequestParam(value = "PageNum", defaultValue = "1") Integer PageNum, Model model) {
		PageInfo<User> p = userManager.selectAll(PageNum);
		model.addAttribute("users", p.getList());
		model.addAttribute("page",p);
		model.addAttribute("ad", "普通用户");
		return "BackstageIndex";
	}

	/**
	 * 获取所有管理员用户的信息（主页）
	 *
	 * @param PageNum
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/BackstageUserAd", produces = "text/html;charset=UTF-8")
	public String selectUserAd(@RequestParam(value = "PageNum", defaultValue = "1") Integer PageNum, Model model) {
		PageInfo<User> p = userManager.selectAllAd(PageNum);
		model.addAttribute("users", p.getList());
		model.addAttribute("page",p);
		model.addAttribute("ad", "管理员");
		return "BackstageIndex";
	}

	/**
	 * 删除用户的信息（主页）
	 *
	 * @param username 用户名
	 * @return
	 */
	@ResponseBody
	@GetMapping(value = "/DeleteUser/{username}", produces = "text/html;charset=UTF-8")
	public String DeleteUser(@PathVariable("username") String username) {
		Integer deleteResult = userManager.deleteUser(username);
		try{
			String path = ResourceUtils.getURL("classpath:").getPath();
			File file = new File(path+"static/img/"+username);
			if (file.exists()){
				userManager.delFile(file);
			}
		}catch (FileNotFoundException ex){
			ex.printStackTrace();
		}
		if (deleteResult > 0) {
			return "删除成功！";
		} else {
			return "删除失败";
		}
	}

	/**
	 * 批量删除用户的信息（主页）
	 *
	 * @return
	 */
	@ResponseBody
	@GetMapping(value = "/DeleteUsers/{users}", produces = "text/html;charset=UTF-8")
	public String DeleteUsers(@PathVariable("users") List<String> users) {
		for (String user : users) {
			try{
				Integer deleteResult = userManager.deleteUser(user);
				String path = ResourceUtils.getURL("classpath:").getPath();
				File file = new File(path+"static/img/"+user);
				if (file.exists()){
					userManager.delFile(file);
				}else if (deleteResult < 0){
					return "删除失败，失败账户:"+user;
				}
			}catch (FileNotFoundException ex){
				ex.printStackTrace();
			}
		}
		return "删除成功！";
	}

	/**
	 * 获取单个用户的用户信息（主页）
	 *
	 * @return
	 */
	@GetMapping(value = "/selectOneUser")
	public String selectOneUser(HttpServletRequest request,Model model) {
		String username = request.getParameter("username");
		if (username !=null && !username.equals("")){
			User selectResult = userManager.login(username);
			model.addAttribute("username",username);
			model.addAttribute("situation", "selectOne");
			model.addAttribute("users",selectResult);
		}else{
			return "redirect:/BackstageUserNormal";
		}
		return "BackstageIndex";
	}

	/**
	 * 获取修改的单个用户的用户信息（主页）
	 *
	 * @return
	 */
	@ResponseBody
	@GetMapping(value = "/selectUser/{username}")
	public User selectUser(@PathVariable("username")String username) {
		User selectResult = userManager.login(username);
		return selectResult;
	}

	/**
	 * 更新单个用户的用户信息（主页）
	 *
	 * @param user 用户信息
	 * @return
	 */
	@ResponseBody
	@PutMapping(value = "/updateUser")
	public String updateUser(User user) {
		Integer integer = userManager.updateUser(user);
		if (integer > 0) {
			return "更新成功！";
		} else {
			return "更新失败";
		}
	}

	/**
	 * 管理员新增用户的信息（主页）
	 *
	 * @return
	 */
	@ResponseBody
	@PostMapping(value = "/AddUserBoss", produces = "text/html;charset=UTF-8")
	public String AddUserBoss(User user) {
		Integer register = userManager.addUser(user);
		//注册的同时创建和以用户名为名的文件夹
		try{
			String path = ResourceUtils.getURL("classpath:").getPath();
			File file = new File(path+"static/img/"+user.getUsername());
			if (!file.exists()){
				file.mkdir();
			}
		}catch (FileNotFoundException ex){
			ex.printStackTrace();
			return "新增失败，文件夹创建失败！";
		}
		if (register > 0) {
			return "新增成功！";
		} else {
			return "新增失败";
		}
	}

	/**
	 * 获取所有票的信息（购票）
	 *
	 * @param PageNum
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/BackstageTicket", produces = "text/html;charset=UTF-8")
	public String select(@RequestParam(value = "PageNum", defaultValue = "1") Integer PageNum,
						 Model model,@RequestParam(value = "type")String type,@RequestParam(value = "subtype")String subtype) {
		PageInfo<Ticket> p = ticketManager.ticketSelectAll(PageNum,type,subtype,null);
		model.addAttribute("page", p);
		model.addAttribute("type", type);
		model.addAttribute("subtype", subtype);
		model.addAttribute("Tickets", p.getList());
		return "BackstageTicket";
	}

	/**
	 * 根据id获取某一场演出的相关信息（购票）
	 * @return
	 */
	@ResponseBody
	@GetMapping(value = "/ticket/{id}")
	public Ticket ticketById(@PathVariable(value = "id") Integer id) {
		PageInfo<Ticket> ticketPageInfo = ticketManager.ticketSelectAll(1, null, null, id);
		Ticket ticket = ticketPageInfo.getList().get(0);
		return ticket;
	}

	/**
	 * 修改票信息（购票）
	 * @return
	 */
	@ResponseBody
	@PutMapping(value = "/ticket")
	public String ticket(Ticket ticket,String Title,String Address,String DetailedAddress) {
		ticket.setAddress(Address);
		ticket.setTitle(Title);
		ticket.setDetailedAddress(DetailedAddress);
		Integer integer = ticketManager.ticketUpdate(ticket);
		if (integer > 0 ){
			return "修改成功！";
		}else {
			return "修改失败！";
		}
	}

	/**
	 * 按照id删除演出信息（购票）
	 * @param id
	 * @return
	 */
	@ResponseBody
	@DeleteMapping("/ticket/{id}")
	public String delete(@PathVariable("id")Integer id){
		Integer integer = ticketManager.ticketDelete(id);
		if (integer > 0){
			return "删除成功！";
		}else {
			return "删除失败!";
		}
	}

	/**
	 * 批量删除演出信息（购票）
	 * @return
	 */
	@ResponseBody
	@DeleteMapping("/tickets/{ids}")
	public String delete(@PathVariable("ids")List<Integer> ids){
		for (Integer id : ids) {
			Integer integer = ticketManager.ticketDelete(id);
			if (integer == 0){
				PageInfo<Ticket> ticketPageInfo = ticketManager.ticketSelectAll(1, null, null, id);
				Ticket ticket = ticketPageInfo.getList().get(0);
				return "标题"+ticket.getTitle()+"删除失败！";
			}
		}
		return "删除成功！";
	}

	/**
	 * 批量开始售票（购票）
	 * @return
	 */
	@ResponseBody
	@PutMapping("/tickets/{ids}")
	public String start6(@PathVariable("ids")List<Integer> ids){
		for (Integer id : ids) {
			Integer integer = ticketManager.ticketUpdateState("Ticketing",id);
			if (integer == 0){
				PageInfo<Ticket> ticketPageInfo = ticketManager.ticketSelectAll(1, null, null, id);
				Ticket ticket = ticketPageInfo.getList().get(0);
				return "标题"+ticket.getTitle()+"开启售票失败！";
			}
		}
		return "开启成功！";
	}

	/**
	 * 插入演出信息（购票）
	 * @return
	 */
	@ResponseBody
	@PostMapping("/ticket")
	public String insert(MultipartFile file,Ticket ticket,String Title,String Address,String DetailedAddress){
		if(!file.isEmpty()) {
			// 上传文件路径
			try {
				//换名字
				String oldFileName = file.getOriginalFilename();
				String newFileName = UUID.randomUUID() + oldFileName.substring(oldFileName.lastIndexOf("."));
				//获取到路径
				String path = ResourceUtils.getURL("classpath:").getPath();
				File newFile = new File(path + "\\static\\img\\showPicture\\" + newFileName);
				file.transferTo(newFile);
				ticket.setAddress(Address);
				ticket.setTitle(Title);
				ticket.setDetailedAddress(DetailedAddress);
				ticket.setPoster(path + "\\static\\img\\showPicture\\" + newFileName);
			}catch (FileNotFoundException ex){
				ex.printStackTrace();
			}catch (IOException e){
				e.printStackTrace();
			}
		}
		Integer integer = ticketManager.ticketAdd(ticket);
		if (integer > 0){
			return "插入成功！";
		}else {
			return "插入失败!";
		}
	}

	/**
	 * 获取所有培训的信息（培训）
	 *
	 * @param PageNum
	 * @return
	 */
	@RequestMapping(value = "/train", produces = "text/html;charset=UTF-8")
	public String select(@RequestParam(value = "PageNum", defaultValue = "1") Integer PageNum,@RequestParam("subject")String subject,Model model) {
		PageInfo<Train> trainPageInfo = trainManager.selectBySubject(subject, PageNum);
		model.addAttribute("page", trainPageInfo);
		model.addAttribute("subject", subject);
		model.addAttribute("trains",trainPageInfo.getList());
		return "/BackstageTrain";
	}

	/**
	 * 删除指定id的信息（培训）
	 *
	 * @return
	 */
	@ResponseBody
	@DeleteMapping(value = "/train/{id}", produces = "text/html;charset=UTF-8")
	public String select1(@PathVariable("id")Integer id) {
		int i = trainManager.deleteById(id);
		if (i > 0){
			return "删除成功！";
		}else {
			return "删除失败！";
		}
	}

	/**
	 * 根据id获取某一场培训的相关信息（培训）
	 * @return
	 */
	@ResponseBody
	@GetMapping(value = "/train/{id}")
	public Train select(@PathVariable(value = "id") Integer id) {
		Train train = trainManager.selectById(id, 1);
		return train;
	}

	/**
	 * 修改票信息（培训）
	 * @return
	 */
	@ResponseBody
	@PutMapping(value = "/train")
	public String select(Train train) {
		Integer integer = trainManager.updateByExampleSelective(train);
		if (integer > 0 ){
			return "修改成功！";
		}else {
			return "修改失败！";
		}
	}

	/**
	 * 批量删除培训信息（培训）
	 * @return
	 */
	@ResponseBody
	@DeleteMapping("/trains/{ids}")
	public String start5(@PathVariable("ids")List<Integer> ids){
		for (Integer id : ids) {
			Integer integer = trainManager.deleteById(id);
			if (integer == 0){
				return "id:"+id+"删除失败！";
			}
		}
		return "删除成功！";
	}

	/**
	 * 开始报名（培训）
	 * @return
	 */
	@ResponseBody
	@PutMapping("/trains/{ids}")
	public String start1(@PathVariable("ids")List<Integer> ids){
		for (Integer id : ids) {
			Train train = new Train();
			train.setId(id);
			train.setState("Enrolment");
			Integer integer = trainManager.updateByExampleSelective(train);
			if (integer == 0){
				return "id:"+id+"报名失败！";
			}
		}
		return "开启报名成功！";
	}

	/**
	 * 插入演出信息（培训）
	 * @return
	 */
	@ResponseBody
	@PostMapping("/train")
	public String insert1(Train train){
		int i = trainManager.insert(train);
		if (i > 0){
			return "插入成功！";
		}else {
			return "插入失败!";
		}
	}


	/**
	 * 获取所有比赛的信息（比赛）
	 *
	 * @return
	 */
	@RequestMapping(value = "/match", produces = "text/html;charset=UTF-8")
	public String select1(@RequestParam(value = "PageNum", defaultValue = "1") Integer pageNum,@RequestParam("subject")String subject,@RequestParam("category")String category,Model model) {
		PageInfo<Match> matchPageInfo = matchManager.selectByExample(null, subject, category, pageNum);
		model.addAttribute("matchs",matchPageInfo.getList());
		model.addAttribute("page",matchPageInfo);
		model.addAttribute("category",category);
		model.addAttribute("subject",subject);
		return "/BackstageMatch";
	}

	/**
	 * 删除指定id的比赛信息（比赛）
	 *
	 * @return
	 */
	@ResponseBody
	@DeleteMapping(value = "/match/{id}", produces = "text/html;charset=UTF-8")
	public String delete1(@PathVariable("id")Integer id) {
		int i = matchManager.deleteByExample(id);
		if (i > 0){
			return "删除成功！";
		}else {
			return "删除失败！";
		}
	}

	/**
	 * 根据id获取某一场比赛的相关信息（比赛）
	 * @return
	 */
	@ResponseBody
	@GetMapping(value = "/match/{id}")
	public Match select3(@PathVariable(value = "id") Integer id) {
		PageInfo<Match> matchPageInfo = matchManager.selectByExample(id, null, null, 1);
		Match match = matchPageInfo.getList().get(0);
		return match;
	}

	/**
	 * 修改比赛信息（比赛）
	 * @return
	 */
	@ResponseBody
	@PutMapping(value = "/match")
	public String select4(Match match) {
		Integer integer = matchManager.updateByExampleSelective(match);
		if (integer > 0 ){
			return "修改成功！";
		}else {
			return "修改失败！";
		}
	}

	/**
	 * 批量删除比赛信息（比赛）
	 * @return
	 */
	@ResponseBody
	@DeleteMapping("/matchs/{ids}")
	public String delete2(@PathVariable("ids")List<Integer> ids){
		for (Integer id : ids) {
			Integer integer = matchManager.deleteByExample(id);
			if (integer == 0){
				return "id:"+id+"删除失败！";
			}
		}
		return "删除成功！";
	}

	/**
	 * 报名比赛（比赛）
	 * @return
	 */
	@ResponseBody
	@PutMapping("/matchs/{ids}")
	public String start3(@PathVariable("ids")List<Integer> ids){
		for (Integer id : ids) {
			Match match = new Match();
			match.setId(id);
			match.setState("Enrolment");
			Integer integer = matchManager.updateByExampleSelective(match);
			if (integer == 0){
				return "id:"+id+"报名失败！";
			}
		}
		return "开启报名成功！";
	}

	/**
	 * 插入比赛信息（比赛）
	 * @return
	 */
	@ResponseBody
	@PostMapping("/match")
	public String insert2(Match match){
		int i = matchManager.insert(match);
		if (i > 0){
			return "插入成功！";
		}else {
			return "插入失败!";
		}
	}



	/**
	 * 获取所有场馆的信息（场地）
	 *
	 * @return
	 */
	@RequestMapping(value = "/field", produces = "text/html;charset=UTF-8")
	public String select2(Model model) {
		PageInfo<Field> fieldPageInfo = fieldManager.selectByExample(null);
		model.addAttribute("page",fieldPageInfo);
		model.addAttribute("fields",fieldPageInfo.getList());
		return "/BackstageField";
	}

	/**
	 * 删除指定id的场地信息（场地）
	 *
	 * @return
	 */
	@ResponseBody
	@DeleteMapping(value = "/field/{id}", produces = "text/html;charset=UTF-8")
	public String delete2(@PathVariable("id")Integer id) {
		int i = fieldManager.deleteByExample(id);
		if (i > 0){
			return "删除成功！";
		}else {
			return "删除失败！";
		}
	}

	/**
	 * 根据id获取某一场地的相关信息（场地）
	 * @return
	 */
	@ResponseBody
	@GetMapping(value = "/field/{id}")
	public Field select4(@PathVariable(value = "id") Integer id) {
		PageInfo<Field> fieldPageInfo = fieldManager.selectByExample(id);
		Field field = fieldPageInfo.getList().get(0);
		return field;
	}

	/**
	 * 修改场地信息（场地）
	 * @return
	 */
	@ResponseBody
	@PutMapping(value = "/field")
	public String select5(Field field) {
		int i = fieldManager.updateByExampleSelective(field);
		if (i > 0 ){
			return "修改成功！";
		}else {
			return "修改失败！";
		}
	}

	/**
	 * 插入场地信息（场地）
	 * @return
	 */
	@ResponseBody
	@PostMapping("/field")
	public String insert3(Field field){
		String openTimeEnd = field.getOpenTimeEnd();
		String openTimeStart = field.getOpenTimeStart();
		openTimeEnd = openTimeEnd.replace(":","");
		openTimeStart = openTimeStart.replace(":","");
		field.setOpenTimeStart(openTimeStart);
		field.setOpenTimeEnd(openTimeEnd);
		int insert = fieldManager.insert(field);
		if (insert > 0){
			return "插入成功！";
		}else {
			return "插入失败!";
		}
	}

	/**
	 * 图片上传（个人信息）
	 *
	 * @param myfile
	 * @return
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	@RequestMapping("/uploadFile")
	@ResponseBody
	public Map<String, Object> uploadFile(MultipartFile myfile, HttpSession session)
			throws IllegalStateException, IOException {
		// 原始名称
		String oldFileName = myfile.getOriginalFilename(); // 获取上传文件的原名
		//      System.out.println(oldFileName);
		String path = ResourceUtils.getURL("classpath:").getPath();
		//获取该用户
		User user = (User) session.getAttribute("user");
		// 上传图片
		if (myfile != null && oldFileName != null && oldFileName.length() > 0) {
			// 新的图片名称
			String newFileName = UUID.randomUUID() + oldFileName.substring(oldFileName.lastIndexOf("."));
			// 新图片
			File newFile = new File(path + "\\static\\img\\"+user.getUsername()+"\\" + newFileName);
			// 将内存中的数据写入磁盘
			myfile.transferTo(newFile);
			//改变数据库中的信息
			user.setHeadPortrait("http://localhost:8080/img/"+user.getUsername()+"/" + newFileName);
			Integer integer = userManager.updateUser(user);
			session.setAttribute("user", user);
			// 将新图片名称返回到前端
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("success", "成功啦");
			map.put("url", newFileName);
			return map;
		} else {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("error", "图片不合法");
			return map;
		}
	}
}
