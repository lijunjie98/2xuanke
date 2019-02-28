package com.jun.service;




import java.util.List;




import com.jun.bean.kebiao;
import com.jun.bean.xuesheng;
import com.jun.bean.xuesheng_kebiao;

public interface XueshengService {
	public xuesheng xueshengLogin(String loginName,String loginPw);//登录
	public xuesheng xueshengselxinxi(String loginName);//学生信息
	public List<kebiao> sel();//课表信息
	public List<kebiao> selx(int id);//学生选课
	public boolean insertxuanke(xuesheng_kebiao xk);//学生选课

}
