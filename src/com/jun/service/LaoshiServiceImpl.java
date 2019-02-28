package com.jun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jun.bean.kebiao;
import com.jun.bean.laoshi;
import com.jun.dao.LaoshiDao;
@Service
public class LaoshiServiceImpl implements LaoshiService {
	@Autowired
	private LaoshiDao ld;
	@Override
	public List<laoshi> selxinxi(String loginName) {
		return ld.selxinxi(loginName);
	}
	@Override
	public List<kebiao> sel() {
		return ld.sel();
	}
	@Override
	public laoshi laoshiLogin(String loginName, String loginPw) {
		laoshi ls=ld.laoshiLogin(loginName, loginPw);
		return ls;
	}

}
