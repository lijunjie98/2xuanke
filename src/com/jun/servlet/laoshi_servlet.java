package com.jun.servlet;

import java.io.IOException;
import java.util.List;

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
import com.jun.service.LaoshiService;

@Controller
public class laoshi_servlet {
	@Autowired
	private LaoshiService us;
	@RequestMapping("/laoshilogin")
	public void  laoshilogin(HttpServletRequest request,HttpSession session,HttpServletResponse response) throws IOException{	
		String loginName=request.getParameter("userName");
		String loginPw=request.getParameter("userPw");
		String userType=request.getParameter("userType");
		session.setAttribute("userType", userType);
		session.setAttribute("laoshiuserName", loginName);
		session.setAttribute("laoshiuserPw", loginPw);
		laoshi ls=us.laoshiLogin(loginName, loginPw);
		if(ls!=null){
			System.out.println("有对象!");
			response.sendRedirect("loginSuccess.jsp");
		}else{
			System.out.println("无对象");
		}

	}
	@RequestMapping("/laoshixinxi")
	public void  laoshixinxi(HttpServletRequest request,HttpSession session,HttpServletResponse response) throws IOException{	
		String loginName=(String) session.getAttribute("laoshiuserName");
		List<laoshi> list=us.selxinxi(loginName);
		session.setAttribute("laoshi", list);
		System.out.println(list);
		response.sendRedirect("alaoshi/myxinxi.jsp");
	}
	@RequestMapping("/kebiaoxinxi")
	public void  kebiaoxinxi(HttpServletRequest request,HttpSession session,HttpServletResponse response) throws IOException{	
		
		System.out.println("老师的课表信息");
		List<kebiao> list=us.sel();
		System.out.println("pppppppppp"+list);
		session.setAttribute("xuesheng_kebiao_list", list);
		System.out.println(list);
		response.sendRedirect("axuesheng/kebiao/kebiao_mana_stu.jsp");
	}
}
