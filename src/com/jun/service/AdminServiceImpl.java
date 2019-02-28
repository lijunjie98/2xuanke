   package com.jun.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jun.bean.admin;
import com.jun.bean.kebiao;
import com.jun.bean.kecheng;
import com.jun.bean.laoshi;
import com.jun.bean.xuesheng;
import com.jun.dao.AdminDao;
@Service
public class AdminServiceImpl implements AdminService{
@Autowired
private AdminDao add;
	public admin userLogin(String userName,String userPw) {
		admin a=add.userLogin(userName, userPw);
		return a;
	}
	public boolean adminPw(String userName, String userPw) {
		boolean flog=add.adminPw(userName, userPw);
		return flog;
	}
	@Override
	public boolean adminAdd(admin ad) {
		boolean flog=add.adminAdd(ad);
		return flog;
	}
	@Override
	public List<kecheng> selkecheng() {
		List<kecheng> list=add.selkecheng();
		return list;
	}
	@Override
	public boolean kechengDel(int id) {
		boolean flog=add.kechengDel(id);
		return flog;
	}
	@Override
	public boolean kechengAdd(kecheng kc) {
		boolean flog=add.kechengAdd(kc);
		return flog;
	}
	@Override
	public List<laoshi> sellaoshi() {
		List<laoshi> list=add.sellaoshi();
		return list;
	}
	@Override
	public boolean laoshiDel(int id) {
		boolean flog=add.laoshiDel(id);
		return flog;
	}
	@Override
	public boolean laoshiAdd(laoshi ls) {
		boolean flog=add.laoshiAdd(ls);
		return flog;
	}
	@Override
	public List<kebiao> selkebiao() {
		List<kebiao> list=add.selkebiao();
		return list;
	}
	@Override
	public boolean kebiaoDel(int id) {
		boolean flog=add.kebiaoDel(id);
		return flog;
	}
	@Override
	public boolean kebiaoAdd(kebiao kb) {
		boolean flog=add.kebiaoAdd(kb);
		return flog;
	}
	@Override
	public List<xuesheng> selxuesheng() {
		List<xuesheng> list=add.selxuesheng();
		return list;
	}
	@Override
	public boolean xueshengDel(int id) {
		boolean flog=add.xueshengDel(id);
		return flog;
	}
	@Override
	public boolean xueshengAdd(xuesheng xs) {
		boolean flog=add.xueshengAdd(xs);
		return flog;
	}
	@Override
	public List<admin> seladmin() {
		List<admin> list=add.seladmin();
		return list;
	}
	@Override
	public boolean adminDel(int userId) {
		boolean flog=add.adminDel(userId);
		return flog;
	}

}
