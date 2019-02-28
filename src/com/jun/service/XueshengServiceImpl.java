package com.jun.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jun.bean.kebiao;
import com.jun.bean.xuesheng;
import com.jun.bean.xuesheng_kebiao;
import com.jun.dao.XueshengDao;
@Service
public class XueshengServiceImpl implements XueshengService {
@Autowired
private XueshengDao xd;
	@Override
	public xuesheng xueshengLogin(String loginName, String loginPw) {
		xuesheng xs=xd.xueshengLogin(loginName, loginPw);
		return xs;
	}
	@Override
	public xuesheng xueshengselxinxi(String loginName) {
		xuesheng list=xd.xueshengselxinxi(loginName);
		return list;
	}
	@Override
	public List<kebiao> sel() {
		List<kebiao> list=xd.sel();
		return list;
	}
	@Override
	public List<kebiao> selx(int id) {
		List<kebiao> list=xd.selx(id);
		return list;
	}
	@Override
	public boolean insertxuanke(xuesheng_kebiao xk) {
		boolean flog=xd.insertxuanke(xk);
		return flog;
	}


}
