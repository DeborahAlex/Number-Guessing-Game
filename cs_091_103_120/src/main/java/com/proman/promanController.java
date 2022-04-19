package com.proman;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dao.ILoginDao;

@Controller
public class promanController {
	@Autowired
	ILoginDao loginDao;
	@RequestMapping({"/login" , "/"})
	public String getLoginpage()
	{
		return "login";
	}
	@RequestMapping("/dashboard")
	public String getDashboard()
	{
		return "dashboard";
	}
	@RequestMapping("/admindash")
	public String getAdminDash()
	{
		return "admindash";
	}
	@RequestMapping("/busdevdash")
	public String getBusDevDash()
	{
		return "busdevdash";
	}
	@RequestMapping("/resources")
	public String getResDash()
	{
		return "resdash";
	}
	@RequestMapping("/manager")
	public String ManDash()
	{
		return "mandash";
	}
	@RequestMapping("/adminadduser")
	public String getadduser()
	{
		return "admin_adduser";
	}
	@RequestMapping(value="/createuser",method=RequestMethod.POST)
	public ModelAndView InsertUser(@RequestParam String text, @RequestParam String pass, @RequestParam String type)
	{
		ModelAndView mv = new ModelAndView();
		loginDao.InsertUser(text,pass,type);
		mv.addObject("user", text);
		mv.setViewName("admindash");
		return mv;
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView checkUser(@RequestParam String text, @RequestParam String pass)
	{
		ModelAndView mv = new ModelAndView();
		System.out.println("Reached checkUser in Controller");
		boolean loginFlag=loginDao.validateUser(text, pass);
		if (loginFlag==true) {
			System.out.println("Validated");
			String Type=loginDao.checkType(text,pass);
			System.out.println(Type);
			if (Type.equals("admin"))
			{
			mv.addObject("user", text);
			mv.setViewName("admindash");
			return mv;
			}
			else if (Type.equals("busdev"))
			{
				mv.addObject("user", text);
				mv.setViewName("busdevdash");
				return mv;
			}
			else if (Type.equals("res"))
			{
				mv.addObject("user", text);
				mv.setViewName("resdash");
				return mv;
			}
			else if (Type.equals("man"))
			{
				mv.addObject("user", text);
				mv.setViewName("mandash");
				return mv;
			}
		}
					//ADD FAILURE PAGE
			System.out.println("Not Validated");
			mv.setViewName("signup.jsp");
			return mv;
		
	}
}
