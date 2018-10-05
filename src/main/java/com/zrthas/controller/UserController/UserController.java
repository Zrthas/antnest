package com.zrthas.controller.UserController;

import com.zrthas.entity.User;
import com.zrthas.service.UserService.impl.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/findUser")
    @ResponseBody
    public String findUser(){
        int id = 1;
        User user = this.userService.findUserById(id);
        String rs = user.getUsername()+":"+user.getId();
        return rs;
    }
    @RequestMapping("/tonewurl")
    public String toNewUrl(){
        return "/user/userdem";
    }
}
