package com.jun.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jun.bean.kebiao;
import com.jun.bean.laoshi;

public interface LaoshiDao {
	public laoshi laoshiLogin(@Param("loginName")String loginName,@Param("loginPw")String loginPw);//��¼
	public List<laoshi> selxinxi(String loginName);//��ʦ��Ϣ
	public List<kebiao> sel();//�α���Ϣ
}