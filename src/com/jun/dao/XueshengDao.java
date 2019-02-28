package com.jun.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;





import com.jun.bean.kebiao;
import com.jun.bean.laoshi;
import com.jun.bean.xuesheng;
import com.jun.bean.xuesheng_kebiao;

public interface XueshengDao {
	public xuesheng xueshengLogin(@Param("loginName")String loginName,@Param("loginPw")String loginPw);//登录
	public xuesheng xueshengselxinxi(String loginName);//学生信息
	public List<kebiao> sel();//课程信息
	public List<kebiao> selx(int id);//学生选课信息
	public boolean insertxuanke(xuesheng_kebiao xk);//学生选课
}
