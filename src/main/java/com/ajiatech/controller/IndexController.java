package com.ajiatech.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ajiatech.pojo.AjiaShipping;
import com.ajiatech.pojo.AjiaUser;

@Controller
public class IndexController {
	
	@RequestMapping("/user/{userId}")
	@ResponseBody
	public String selectUser(@PathVariable(name="userId") String userId)
	{
		System.out.println("userId:"+userId);
		return "hello!";
	}
	
	@RequestMapping("/saveAddress")
	@ResponseBody
	public String saveAddress(AjiaShipping shipping)
	{
		System.out.println(shipping);
		return "hello";
	}
	
	@RequestMapping("/login")
	@ResponseBody
	public String login(@RequestParam(required=true,name="pwd") String name,String pwd,@RequestParam(required=false,defaultValue="18") Integer age)
	{
		return "<h1>name:"+name+"    pwd:"+pwd+"    age:"+age+"</h1>";
	}
	
	@RequestMapping(produces="text/html;charset=utf-8",method= {RequestMethod.GET,RequestMethod.POST},value= {"/hello","/hello100"})
	@ResponseBody
	public String helloworld(String param)
	{
		System.out.println("param:"+param);
		return "<h1>Hello World!"+param+"</h1>";
	}
	
	@RequestMapping("/getUser")
	@ResponseBody
	public List<AjiaUser> getUser()
	{
		List<AjiaUser> users = new ArrayList<AjiaUser>();
		for(int i = 0;i < 50;i++)
		{
			users.add(new AjiaUser());
		}
		return users;
	}
	
	public String forward(Model model)
	{
		model.addAttribute("name","张三三");
		return "index";
	}
	
	@RequestMapping("/index")
	public String index()
	{
		return "redirect:http://www.baidu.com";
	}

}
