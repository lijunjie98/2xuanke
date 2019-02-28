package com.jun.bean;

public class xuesheng {
	 private int id;
	 private String xuehao;
	 private String xingming;
	 private String xingbie;
	 private String nianling;
	 private String banji;
	 private String loginname;
	 private String loginpw;
	 private String del;
	 
	public String getXingbie() {
		return xingbie;
	}
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getXuehao() {
		return xuehao;
	}
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	public String getXingming() {
		return xingming;
	}
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	public String getNianling() {
		return nianling;
	}
	public void setNianling(String nianling) {
		this.nianling = nianling;
	}
	public String getBanji() {
		return banji;
	}
	public void setBanji(String banji) {
		this.banji = banji;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getLoginpw() {
		return loginpw;
	}
	public void setLoginpw(String loginpw) {
		this.loginpw = loginpw;
	}
	public String getDel() {
		return del;
	}
	public void setDel(String del) {
		this.del = del;
	}
	@Override
	public String toString() {
		return "xuesheng [id=" + id + ", xuehao=" + xuehao + ", xingming="
				+ xingming + ", xingbie=" + xingbie + ", nianling=" + nianling
				+ ", banji=" + banji + ", loginname=" + loginname
				+ ", loginpw=" + loginpw + ", del=" + del + "]";
	}
	
	 
}
