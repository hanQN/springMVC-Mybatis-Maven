package com.han.ssm.controller;

import com.han.ssm.model.User;
import com.han.ssm.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by 123 on 2018/3/12.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;

    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request, Model model) {
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.getUserByID(userId);
        //绑定对象到User.jsp
        model.addAttribute("user", user);
        return "user";

    }

}
