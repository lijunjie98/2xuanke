package com.jun.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jun.bean.kebiao;
import com.jun.bean.laoshi;

public interface LaoshiService {
	public laoshi laoshiLogin(@Param("loginName")String loginName,@Param("loginPw")String loginPw);//��¼
	public List<laoshi> selxinxi(String loginName);//��ʦ��Ϣ
    public List<kebiao> sel();
}
