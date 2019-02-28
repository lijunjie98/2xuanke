package com.jun.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;









import com.jun.bean.kebiao;
import com.jun.bean.laoshi;
import com.jun.bean.xuesheng;
import com.jun.bean.xuesheng_kebiao;
import com.jun.service.LaoshiService;
import com.jun.service.XueshengService;
@Controller
public class xuesheng_servlet {
	@Autowired
	private XueshengService us;
	@RequestMapping("/xueshenglogin")
	public void  xueshenglogin(HttpServletRequest request,HttpSession session,HttpServletResponse response) throws IOException{	
		String loginName=request.getParameter("userName");
		String loginPw=request.getParameter("userPw");
		String userType=request.getParameter("userType");
		session.setAttribute("userType", userType);
		session.setAttribute("xueshenguserName", loginName);
		session.setAttribute("xueshenguserPw", loginPw);
		xuesheng xs=us.xueshengLogin(loginName, loginPw);
		session.setAttribute("xuesheng", xs);
		int a=xs.getId();
		session.setAttribute("aa",a);
		if(xs!=null){
			System.out.println("有对象!");
			response.sendRedirect("loginSuccess.jsp");
		}else{
			System.out.println("无对象");
		}

	}
/*	@RequestMapping("/xueshengxinxi")
	public void  laoshixinxi(HttpServletRequest request,HttpSession session,HttpServletResponse response) throws IOException, ServletException{	
		String loginName=(String) session.getAttribute("xueshenguserName");
		xuesheng list =us.xueshengselxinxi(loginName);
		System.out.println(list);
		session.setAttribute("xueshengxinxi", list);
		int a=list.getId();
		System.out.println("jfdiojfidojgidfjg"+a);
		session.setAttribute("aa", a);
		System.out.println(list);
		request.getRequestDispatcher("axuesheng/myxinxi.jsp").forward(request, response);
	}*/
	@RequestMapping("/kebiaoxinxi1")
	public void  kebiaoxinxi1(HttpServletRequest request,HttpSession session,HttpServletResponse response) throws IOException{	
		System.out.println("老师的课表信息");
		List<kebiao> list=us.sel();
		System.out.println("pppppppppp"+list);
		session.setAttribute("kebiaoList111", list);
		response.sendRedirect("axuesheng/kebiao/kebiaoAll1.jsp");
	}
	@RequestMapping("/kebiaoxinxi2")
	public void  kebiaoxinxi2(HttpServletRequest request,HttpSession session,HttpServletResponse response) throws IOException{	
		int id=(int) session.getAttribute("aa");
		System.out.println(id);
		System.out.println("ididididiididi"+id);
		List<kebiao> list=us.selx(id);
		System.out.println("kdoosdkokdokodko"+list);
		session.setAttribute("xuesheng_kebiao_list",list);
		System.out.println(list);
		response.sendRedirect("axuesheng/kebiao/kebiao_mana_stu.jsp");
	}
	@RequestMapping("/insertxuanke")
	public void  insertxuanke(HttpServletRequest request,HttpSession session,HttpServletResponse response) throws IOException, ServletException{	
		String idss=request.getParameter("kebiao_id");
		int kebiao_id=Integer.parseInt(idss);
		int xuesheng_id=(int) session.getAttribute("aa");		
		xuesheng_kebiao xk=new xuesheng_kebiao();
		xk.setKebiao_id(kebiao_id);
		xk.setXuesheng_id(xuesheng_id);
		boolean flog=us.insertxuanke(xk);
		System.out.println(flog);
		if(flog==true){
			request.getRequestDispatcher("kebiaoxinxi2").forward(request, response);
		}
		
	}
}
