package com.jun.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;





import com.jun.bean.kebiao;
import com.jun.bean.laoshi;
import com.jun.bean.xuesheng;
import com.jun.bean.xuesheng_kebiao;

public interface XueshengDao {
	public xuesheng xueshengLogin(@Param("loginName")String loginName,@Param("loginPw")String loginPw);//��¼
	public xuesheng xueshengselxinxi(String loginName);//ѧ����Ϣ
	public List<kebiao> sel();//�γ���Ϣ
	public List<kebiao> selx(int id);//ѧ��ѡ����Ϣ
	public boolean insertxuanke(xuesheng_kebiao xk);//ѧ��ѡ��
}
