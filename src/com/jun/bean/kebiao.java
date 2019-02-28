package com.jun.bean;

public class kebiao {
	private int id;
	private int kecheng_id;
	private laoshi laoshi;
	private kecheng kecheng;
	private String shijian;
	private String jieci;
	private String jiaoshi;
	private int  laoshi_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getKecheng_id() {
		return kecheng_id;
	}
	public void setKecheng_id(int kecheng_id) {
		this.kecheng_id = kecheng_id;
	}
	public laoshi getLaoshi() {
		return laoshi;
	}
	public void setLaoshi(laoshi laoshi) {
		this.laoshi = laoshi;
	}
	public kecheng getKecheng() {
		return kecheng;
	}
	public void setKecheng(kecheng kecheng) {
		this.kecheng = kecheng;
	}
	public String getShijian() {
		return shijian;
	}
	public void setShijian(String shijian) {
		this.shijian = shijian;
	}
	public String getJieci() {
		return jieci;
	}
	public void setJieci(String jieci) {
		this.jieci = jieci;
	}
	public String getJiaoshi() {
		return jiaoshi;
	}
	public void setJiaoshi(String jiaoshi) {
		this.jiaoshi = jiaoshi;
	}
	public int getLaoshi_id() {
		return laoshi_id;
	}
	public void setLaoshi_id(int laoshi_id) {
		this.laoshi_id = laoshi_id;
	}
	@Override
	public String toString() {
		return "kebiao [id=" + id + ", kecheng_id=" + kecheng_id + ", laoshi="
				+ laoshi + ", kecheng=" + kecheng + ", shijian=" + shijian
				+ ", jieci=" + jieci + ", jiaoshi=" + jiaoshi + ", laoshi_id="
				+ laoshi_id + "]";
	}
	
	
	
	
}
