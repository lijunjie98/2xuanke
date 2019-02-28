package com.jun.dao;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jun.bean.admin;
import com.jun.bean.kebiao;
import com.jun.bean.kecheng;
import com.jun.bean.laoshi;
import com.jun.bean.xuesheng;

public interface AdminDao {
	public admin userLogin(@Param("userName")String userName,@Param("userPw")String userPw);//��¼
	public boolean adminPw(@Param("userName")String userName,@Param("userPw")String userPw);//�޸�����
	public List<admin> seladmin();//��ѯ���й���Ա
	public boolean adminAdd(admin ad);//����û�
	public boolean adminDel(int userId);//ɾ������Ա
	public List<kecheng> selkecheng();//��ѯ���пγ�
	public boolean kechengDel(int id);//ɾ���γ�
	public boolean kechengAdd(kecheng kc);//��ӿγ�
	public List<laoshi> sellaoshi();//����������ʦ
	public boolean laoshiDel(int id);//ɾ����ʦ
	public boolean laoshiAdd(laoshi ls);//�����ʦ
	public List<kebiao> selkebiao();//�α���Ϣ
	public boolean kebiaoDel(int id);//ɾ����ʦ
	public boolean kebiaoAdd(kebiao kb);//��ӿα�
	public List<xuesheng> selxuesheng();//����������ʦ��Ϣ
	public boolean xueshengDel(int id);//ɾ��ѧ��
	public boolean xueshengAdd(xuesheng xs);//���ѧ��
	
		
}
