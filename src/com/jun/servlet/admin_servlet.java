package com.jun.servlet;


import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jun.bean.admin;
import com.jun.bean.kebiao;
import com.jun.bean.kecheng;
import com.jun.bean.laoshi;
import com.jun.bean.xuesheng;
import com.jun.service.AdminService;

@Controller
public class admin_servlet {
     @Resource
	private AdminService us;
	@RequestMapping(value="/adminlogin",method=RequestMethod.POST)
	public void  adminlogin(HttpServletRequest request,HttpSession session,HttpServletResponse response,
			@RequestParam String userName,@RequestParam String userType,@RequestParam String userPw
			) throws IOException{	
		session.setAttribute("userType", userType);
		session.setAttribute("adminuserName", userName);
		session.setAttribute("adminuserPw", userPw);
		admin a=us.userLogin(userName,userPw);
		if(a!=null){
			System.out.println("有对象!");
			response.sendRedirect("loginSuccess.jsp");
		}else{
			System.out.println("无对象");
		}

	}
	@RequestMapping("/adminPw")
	public void adminpw(HttpServletRequest request,HttpSession session,HttpServletResponse response) throws IOException
	{
		String userName=(String) session.getAttribute("adminuserName");
		String userPw=request.getParameter("userPw1");
		boolean a=us.adminPw(userName,userPw);
		if(a==true){
			System.out.println("kgodkod");
			response.sendRedirect("");
		}
		
	}
	
	@RequestMapping(value="/denglupanduan",method=RequestMethod.POST)
	public void denglupanduan(HttpSession session,HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		String userType=request.getParameter("userType");
		if(userType.equals("0")){
			request.getRequestDispatcher("adminlogin").forward(request, response);
		}else if(userType.equals("1")){
			request.getRequestDispatcher("laoshilogin").forward(request, response);
		}else{
			request.getRequestDispatcher("xueshenglogin").forward(request, response);
		}
	}
	@RequestMapping(value="/seladmin",method=RequestMethod.GET)
	public void seladmin(HttpSession session,HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		
		List<admin> list=us.seladmin();
		System.out.println(list);
		request.setAttribute("adminList",list);
		request.getRequestDispatcher("admin/admin/adminMana.jsp").forward(request, response);

	}
	@RequestMapping(value="/admintianjia",method=RequestMethod.POST)
	public void admintianjia(HttpSession session,HttpServletRequest request,HttpServletResponse response){
		
		String userName=request.getParameter("userName");
		String userPw=request.getParameter("userPw");
		admin ad=new admin();
		ad.setUserName(userName);
		ad.setUserPw(userPw);
		boolean flog=us.adminAdd(ad);
		if(flog==true){
			request.getRequestDispatcher("admin/admin/adminAdd.jsp");
		}
	}
	@RequestMapping(value="/adminDel",method=RequestMethod.GET)
	public void adminDel(HttpServletResponse response,HttpServletRequest request,@RequestParam String userId) throws ServletException, IOException{
		int id=Integer.parseInt(userId);
		boolean a=us.adminDel(id);
		if(a==true){
			request.getRequestDispatcher("/seladmin").forward(request, response);
		}
	}
	@RequestMapping("/selkecheng")
	public void  selkecheng(HttpServletRequest request,HttpSession session,HttpServletResponse response) throws IOException, ServletException{	
		
		System.out.println("老师的课表信息");
		List<kecheng> list=us.selkecheng();
		session.setAttribute("kechengList",list);
		System.out.println(list);
		request.getRequestDispatcher("admin/kecheng/kechengMana.jsp").forward(request, response);
	}
	@RequestMapping(value="/kechengDel",method=RequestMethod.GET)
	public void kechengDel(HttpSession session,HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		
		String ids=request.getParameter("id");
		int id=Integer.parseInt(ids);
		boolean a=us.kechengDel(id);
		if(a==true){
			request.getRequestDispatcher("/selkecheng").forward(request, response);
		}
		
	}
	@RequestMapping(value="/kechengAdd",method=RequestMethod.POST)
	public void kechengAdd(HttpSession session,HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		
		String bianhao=request.getParameter("bianhao");
		String mingcheng=request.getParameter("mingcheng");
		String keshi=request.getParameter("keshi");
		kecheng kc=new kecheng();
		kc.setBianhao(bianhao);
		kc.setMingcheng(mingcheng);
		kc.setKeshi(keshi);
		boolean flog=us.kechengAdd(kc);
		if(flog==true){
			request.getRequestDispatcher("/selkecheng").forward(request, response);
		}
		
	}
	@RequestMapping(value="/laoshiall",method=RequestMethod.GET)
	public void laoshiall(HttpSession session,HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
	
		List<laoshi> list=us.sellaoshi();
		request.setAttribute("laoshiList", list);
		request.getRequestDispatcher("/admin/laoshi/laoshiMana.jsp").forward(request, response);
	}
	@RequestMapping(value="/laoshiDel",method=RequestMethod.GET)
	public void laoshiDel(HttpSession session,HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		
		String ids=request.getParameter("id");
		int id=Integer.parseInt(ids);
		boolean a=us.laoshiDel(id);
		if(a==true){
			request.getRequestDispatcher("/laoshiall").forward(request, response);
		}
		
	}
	@RequestMapping(value="/laoshiAdd")
	public void laoshiAdd(HttpSession session,HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		
		String bianhao=request.getParameter("bianhao");
		String xingming=request.getParameter("xingming");
		String xingbie=request.getParameter("xingbie");
		String nianling=request.getParameter("nianling");
		String zhicheng=request.getParameter("zhicheng");
		String loginname=request.getParameter("loginname");
		String loginpw=request.getParameter("loginpw");
		laoshi ls=new laoshi();
		ls.setBianhao(bianhao);
		ls.setXingming(xingming);
		ls.setXingbie(xingbie);
		ls.setNianling(nianling);
		ls.setZhicheng(zhicheng);
		ls.setLoginname(loginname);
		ls.setLoginpw(loginpw);
		System.out.println(ls);
		boolean flog=us.laoshiAdd(ls);		
		if(flog==true){
			request.getRequestDispatcher("/laoshiall").forward(request, response);
		}
		
	}
	
	
	@RequestMapping(value="/selkebiao")
	public void selkebiao(
			HttpSession session,HttpServletRequest request,HttpServletResponse response,
			@RequestParam("type") String type01
			) throws ServletException, IOException{
	
		List<kebiao> list=us.selkebiao();
		request.setAttribute("kebiaoList", list);
		
			request.getRequestDispatcher("admin/kebiao/kebiaoMana.jsp").forward(request, response);

		
	}
	@RequestMapping(value="/kebiaoDel",method=RequestMethod.GET)
	public void kebiaoDel(HttpSession session,HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		
		String ids=request.getParameter("id");
		int id=Integer.parseInt(ids);
		boolean flog=us.kebiaoDel(id);
		System.out.println(flog);
		if(flog==true){
			System.out.println("删除成功");
			request.getRequestDispatcher("/selkebiao").forward(request, response);
		}
		
	}
	@RequestMapping(value="/kebiaoAdd",method=RequestMethod.POST)
	public void kebiaoAdd(HttpSession session,HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		
		String id=request.getParameter("kecheng_id");
		int ids=Integer.parseInt(id);
		String shijian=request.getParameter("shijian");
		String jieci=request.getParameter("jieci");
		String jiaoshi=request.getParameter("jiaoshi");
		String laoshiid=request.getParameter("laoshi_id");
		int laoshi_id=Integer.parseInt(laoshiid);
		kebiao kb=new kebiao();
		kb.setKecheng_id(ids);
		kb.setShijian(shijian);
		kb.setJieci(jieci);
		kb.setJiaoshi(jiaoshi);
		kb.setLaoshi_id(laoshi_id);		
		boolean flog=us.kebiaoAdd(kb);
		if(flog==true){
			request.getRequestDispatcher("/selkebiao").forward(request, response);
		}
		
	}
	
	
	@RequestMapping(value="/selxuesheng")
	public void selxuesheng(HttpSession session,HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		
		List<xuesheng> list=us.selxuesheng();
		request.setAttribute("xueshengList", list);
		request.getRequestDispatcher("admin/xuesheng/xueshengMana.jsp").forward(request, response);
	}
	@RequestMapping(value="/xueshengDel",method=RequestMethod.GET)
	public void xueshengDel(HttpSession session,HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
	
		String ids=request.getParameter("id");
		int id=Integer.parseInt(ids);
		boolean a=us.xueshengDel(id);
		if(a==true){
			request.getRequestDispatcher("/selxuesheng").forward(request, response);
		}
		
	}
	@RequestMapping(value="/xueshengAdd",method=RequestMethod.POST)
	public void xueshengAdd(HttpSession session,HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		
		/*String id=request.getParameter("kecheng_id");
		int ids=Integer.parseInt(id);*/
		String xuehao=request.getParameter("xuehao");
		String xingming=request.getParameter("xingming");
		String xingbie=request.getParameter("xingbie");
		String nianling=request.getParameter("nianling");
		String banji=request.getParameter("banji");
		String loginname=request.getParameter("loginname");
		String loginpw=request.getParameter("loginpw");
		xuesheng xs=new xuesheng();
		xs.setXuehao(xuehao);
		xs.setXingming(xingming);
		xs.setXingbie(xingbie);
		xs.setNianling(nianling);
		xs.setBanji(banji);
		xs.setLoginname(loginname);
		xs.setLoginpw(loginpw);	
		System.out.println(xs);
		boolean flog=us.xueshengAdd(xs);
		if(flog==true){
			request.getRequestDispatcher("/selxuesheng").forward(request, response);
		}
		
	}
	@RequestMapping("/selkecheng1")
	public void  selkecheng1(HttpServletRequest request,HttpSession session,HttpServletResponse response) throws IOException, ServletException{	
		
		System.out.println("老师的课表信息");
		List<kecheng> list=us.selkecheng();
		session.setAttribute("kechengList",list);
		System.out.println(list);
		request.getRequestDispatcher("admin/kecheng/kechengAll.jsp").forward(request, response);
	}
	@RequestMapping(value="/sellaoshi",method=RequestMethod.GET)
	public void sellaoshi(HttpSession session,HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		
		List<laoshi> list=us.sellaoshi();
		request.setAttribute("laoshiList", list);
		request.getRequestDispatcher("/admin/laoshi/laoshiAll.jsp").forward(request, response);
	}
	
}
