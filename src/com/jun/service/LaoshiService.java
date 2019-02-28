package com.jun.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jun.bean.kebiao;
import com.jun.bean.laoshi;

public interface LaoshiService {
	public laoshi laoshiLogin(@Param("loginName")String loginName,@Param("loginPw")String loginPw);//登录
	public List<laoshi> selxinxi(String loginName);//老师信息
    public List<kebiao> sel();
}
