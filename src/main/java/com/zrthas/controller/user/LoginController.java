/*若将包名命名为usercontroller则无法通过spring-mvc的package扫描*/
package com.zrthas.controller.user;

import com.zrthas.entity.User;
import com.zrthas.service.UserService.impl.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @methon 用于用户的登录或登出等
 * @author zrthas
 * @date 2018/10/10
 */
@Controller
@RequestMapping("/user")
public class LoginController {

    @Resource
    private UserService userService;

    @RequestMapping("findUser")
    @ResponseBody
    public String findUser(){
        int id = 1;
        User user = this.userService.findUserById(id);
        String rs = user.getUsername()+":"+user.getId();
        return rs;
    }

    /**
     * 跳转到新的页面测试
     * @return
     */
    @RequestMapping("tonewurl")
    public String toNewUrl(){
        return "/user/userdem";
    }

    @RequestMapping("tologinpage")
    public String toLoginPage(){
        return "/login/login";
    }
}