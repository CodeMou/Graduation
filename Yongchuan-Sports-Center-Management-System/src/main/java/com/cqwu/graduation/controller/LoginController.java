package com.cqwu.graduation.controller;

import com.cqwu.graduation.bean.AccountType;
import com.cqwu.graduation.bean.User;
import com.cqwu.graduation.biz.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.server.PathParam;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
public class LoginController {

	@Autowired
	private UserManager userManager;

	@Value("${cbs.imagesPath}")
	private String ImagesPath;
	/**
	 * 登录验证
	 * @param map 错误信息
	 * @param session session
	 * @return
	 */
	@RequestMapping("/login")
	public String login(HttpServletRequest request, Map<String,Object> map, HttpSession session){
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = userManager.login(username);
		map.put("username",username);
		if (user == null){
			map.put("error","用户名不存在！");
			return "login";
		}else if (user.getPassword().equals(password)){
			session.setAttribute("username",username);
			session.setAttribute("user",user);
			if (user.getAccountType().equals(AccountType.ADMINISTRATORS)){
				return "redirect:/BackstageUserNormal";
			}else {
				return "redirect:/navigation?page=ticket";
			}
		}else {
			map.put("error","用户名或密码错误！请重新输入");
			return "login";
		}
	}

	/**
	 * 注册
	 * @param user
	 * @param map
	 * @return
	 */
	@RequestMapping("/register")
	public String register(@PathParam("user")User user,Map<String,Object> map){
		Integer register = userManager.register(user);
		//注册的同时创建和以用户名为名的文件夹
			File file = new File(ImagesPath+user.getUsername());
			if (!file.exists()){
				file.mkdirs();
			}
		if (register > 0){
			map.put("error","注册成功！");
			return "login";
		}else {
			return "fail";
		}

	}
	/**
	 * 防止表单重复提交
	 * @return
	 */
	@RequestMapping("/toLogout")
	public String toLogout(){
		return "redirect: /logout";
	}

	/**
	 * 注销
	 * @param model
	 * @return
	 */
	@RequestMapping("/logout")
	public String logout(Model model){
		model.addAttribute("logout","您已注销");
		return "login";
	}

	@RequestMapping("/registerUploadFile")
	@ResponseBody
	public Map<String, Object> uploadFile(MultipartFile file) throws IllegalStateException, IOException {
		// 原始名称
		String oldFileName = file.getOriginalFilename(); // 获取上传文件的原名

		String path = ResourceUtils.getURL("classpath:").getPath();
		// 上传图片
		if (file != null && oldFileName != null && oldFileName.length() > 0) {
			// 新的图片名称
			String newFileName = UUID.randomUUID() + oldFileName.substring(oldFileName.lastIndexOf("."));
			// 新图片
			File newFile = new File(path + "\\static\\img\\" + newFileName);
			// 将内存中的数据写入磁盘
			file.transferTo(newFile);

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
