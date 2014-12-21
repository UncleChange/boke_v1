package com.cn.wangsy.business.user.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.wangsy.business.user.service.IUserService;
import com.cn.wangsy.mapping.pojo.User;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService service;
	
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model){
		int userId = Integer.parseInt(request.getParameter("id"));
		User user = this.service.getUserById(userId);
		model.addAttribute("user", user);
		return "showUser";
	}
}
