package com.ttp.controller.login;

import java.util.HashMap;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ttp.cloopen.rest.demo.SDKTestSendTemplateSMS;
import com.ttp.service.UserRegistService;

@Controller
@RequestMapping("userlogin")
public class userlogin {
	@Autowired
	private UserRegistService service;
	@RequestMapping("login")
	public String tologin(){
		return "userlogin/login";
	}
	@RequestMapping("regist")
	public String toregist(){
		return "userlogin/registcode";
	}
	@RequestMapping("code")
	public void code(){
		System.out.println(111);
		/*int i = (int) ((Math.random()*9+1)*100000);
		String j = String.valueOf(i);
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
        session.setAttribute(tel, j);
		String k = "1";*/
		SDKTestSendTemplateSMS.message("17723324274", "123456", "1");
	}
	/*@RequestMapping("doregistcode")
	public String doregist(@RequestParam(value="tel")String tel,@RequestParam(value="code")String code,Map map){
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		String j = (String) session.getAttribute(tel);
		if(j.equals(code)){
			map.put("tel", tel);
			return "userlogin/registinformation";
		}else{
			map.put("error", "验证码错误，请重新输入");
			return "userlogin/registcode";
		}
	}*/
	@RequestMapping("doregistinformation")
	public String doregistinformation(@RequestParam(value="name")String name,@RequestParam(value="password")String password,@RequestParam(value="confirmpassword")String confirmpassword,@RequestParam(value="tel")String tel,Map map){
		
		if (password.equals(confirmpassword)) {
			service.userRegist(tel, name, password);
			map.put("result", "注册成功，快去登陆吧");
			return "userlogin/registinformation";
		}else{
			map.put("result", "两次密码不一致");
			return "userlogin/registinformation";
		}
	}
	
}
