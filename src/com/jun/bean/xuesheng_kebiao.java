package com.jun.bean;

public class xuesheng_kebiao {
	private int id;
	private int xuesheng_id;
	private int kebiao_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getXuesheng_id() {
		return xuesheng_id;
	}
	public void setXuesheng_id(int xuesheng_id) {
		this.xuesheng_id = xuesheng_id;
	}
	public int getKebiao_id() {
		return kebiao_id;
	}
	public void setKebiao_id(int kebiao_id) {
		this.kebiao_id = kebiao_id;
	}
	@Override
	public String toString() {
		return "xuesheng_kebiao [id=" + id + ", xuesheng_id=" + xuesheng_id
				+ ", kebiao_id=" + kebiao_id + "]";
	}
	
}
