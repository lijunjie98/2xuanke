package com.jun.service;

import java.util.List;

import com.jun.bean.admin;
import com.jun.bean.kebiao;
import com.jun.bean.kecheng;
import com.jun.bean.laoshi;
import com.jun.bean.xuesheng;

public interface AdminService {
	public admin userLogin(String userName,String userPw);//管理员登陆
	public boolean adminPw(String userName,String userPw);//管理员修改密码
	public List<admin> seladmin();//查询所有管理员
	public boolean adminAdd(admin ad);//添加用户
	public boolean adminDel(int userId);//删除管理员
	public List<kecheng> selkecheng();//查询所有课程
	public boolean kechengDel(int id);//删除课程
	public boolean kechengAdd(kecheng kc);//添加课程
	public List<laoshi> sellaoshi();//查询所有老师
	public boolean laoshiDel(int id);//删除老师
	public boolean laoshiAdd(laoshi ls);//添加老师
	public List<kebiao> selkebiao();//课程信息
	public boolean kebiaoDel(int id);//删除老师
	public boolean kebiaoAdd(kebiao kb);//添加课表
	public List<xuesheng> selxuesheng();//查找所有老师信息
	public boolean xueshengDel(int id);//删除学生
	public boolean xueshengAdd(xuesheng xs);//添加学生
}
