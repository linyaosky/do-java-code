package me.skyline.modules.login.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 处理登录请求
 * @author chendh
 * 2016年5月9日
 */
@Controller
public class LoginController {
	
	@RequestMapping("/login")
	@ResponseBody
	public String login(HttpServletRequest request, HttpServletResponse response, Model model){
		String message = "springMVC ok";
		model.addAttribute("name", "cdh");
		return message ;
	}
}
