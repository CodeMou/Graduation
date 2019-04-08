package com.cqwu.graduation.bean;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	/* 主键，自增 */
	private Integer id;
	/* 用户名 */
	private String username;
	/* 密码 */
	private String password;
	/* 头像url地址 */
	private String headPortrait;
	/* 身份证号码 */
	private String idNumber;
	/* 手机号码 */
	private BigInteger mobileNo;
	/* 账户类型 */
	private AccountType accountType;
	/* 新增时间 */
	private Date rawAddTime;
	/* 修改时间 */
	private Date rawUpdateTime;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public BigInteger getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(BigInteger mobileNo) {
		this.mobileNo = mobileNo;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public Date getRawAddTime() {
		return rawAddTime;
	}

	public void setRawAddTime(Date rawAddTime) {
		this.rawAddTime = rawAddTime;
	}

	public Date getRawUpdateTime() {
		return rawUpdateTime;
	}

	public void setRawUpdateTime(Date rawUpdateTime) {
		this.rawUpdateTime = rawUpdateTime;
	}

	public String getHeadPortrait() {
		return headPortrait;
	}

	public void setHeadPortrait(String headPortrait) {
		this.headPortrait = headPortrait;
	}
}
