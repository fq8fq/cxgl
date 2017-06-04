package com.cx.entity;

public class Priv {
	
	private int userId;
	private String userName;
	private int privId;
	private String privName;
	private String url;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getPrivId() {
		return privId;
	}
	public void setPrivId(int privId) {
		this.privId = privId;
	}
	public String getPrivName() {
		return privName;
	}
	public void setPrivName(String privName) {
		this.privName = privName;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
}
