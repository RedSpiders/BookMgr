package com.book.model;

/**
 * ”√ªß
 * @author liang
 *
 */
public class User {

	private String user_Id;
	private String user_Name;
	private String user_Pwd;
	private String user_Sex;
	private String user_Cls;
	private String user_Iden;
	public String getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(String user_Id) {
		this.user_Id = user_Id;
	}
	public String getUser_Name() {
		return user_Name;
	}
	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}
	public String getUser_Pwd() {
		return user_Pwd;
	}
	public void setUser_Pwd(String user_Pwd) {
		this.user_Pwd = user_Pwd;
	}
	public String getUser_Sex() {
		return user_Sex;
	}
	public void setUser_Sex(String user_Sex) {
		this.user_Sex = user_Sex;
	}
	public String getUser_Cls() {
		return user_Cls;
	}
	public void setUser_Cls(String user_Cls) {
		this.user_Cls = user_Cls;
	}
	public String getUser_Iden() {
		return user_Iden;
	}
	public void setUser_Iden(String user_Iden) {
		this.user_Iden = user_Iden;
	}
	@Override
	public String toString() {
		return "User [user_Id=" + user_Id + ", user_Name=" + user_Name
				+ ", user_Pwd=" + user_Pwd + ", user_Sex=" + user_Sex
				+ ", user_Cls=" + user_Cls + ", user_Iden=" + user_Iden + "]";
	}
	
	
	
	
}
