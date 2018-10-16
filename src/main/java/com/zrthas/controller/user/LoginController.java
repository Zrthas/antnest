/*若将包名命名为usercontroller则无法通过spring-mvc的package扫描*/
package com.zrthas.controller.user;

import com.zrthas.entity.User;
import com.zrthas.entity.common.CodeValue;
import com.zrthas.entity.common.ResultParamEntity;
import com.zrthas.entity.user.UserEntity;
import com.zrthas.service.user.impl.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @methon 用于用户的登录或登出等
 * @author zrthas
 * @date 2018/10/10
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @Resource
    private UserService userService;

    @RequestMapping("existuser")
    @ResponseBody
    public String existUser(@RequestParam("userLoginName") String userLoginName){
        UserEntity userEntity = new UserEntity();
        userEntity.setUserLoginName(userLoginName);
        Boolean exist =userService.findUserExist(userEntity);
        ResultParamEntity<UserEntity> resultParamEntity = new ResultParamEntity<UserEntity> ();

        if (exist) {
            resultParamEntity.setCode(CodeValue.ACC_SUCCESS_CODE);
            resultParamEntity.setMsg("请求成功");
        } else {
            resultParamEntity.setCode(CodeValue.ACC_FAIL_CODE);
            resultParamEntity.setMsg("暂无数据");
        }


        return null;
    }

    /**
     * 跳转到新的页面测试
     * @return
     */
    @RequestMapping("index")
    public String toNewUrl(){
        return "/index";
    }

    @RequestMapping("tologinpage")
    public String toLoginPage(){
        return "/login/login";
    }

    @RequestMapping("toregister")
    public String toRegister(){
        return "/login/register";
    }

    @RequestMapping("console")
    public String console(){
        return "home/console";
    }

}