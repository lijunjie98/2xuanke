package com.jun.service;




import java.util.List;




import com.jun.bean.kebiao;
import com.jun.bean.xuesheng;
import com.jun.bean.xuesheng_kebiao;

public interface XueshengService {
	public xuesheng xueshengLogin(String loginName,String loginPw);//��¼
	public xuesheng xueshengselxinxi(String loginName);//ѧ����Ϣ
	public List<kebiao> sel();//�α���Ϣ
	public List<kebiao> selx(int id);//ѧ��ѡ��
	public boolean insertxuanke(xuesheng_kebiao xk);//ѧ��ѡ��

}
