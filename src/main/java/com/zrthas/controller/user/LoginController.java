/*若将包名命名为usercontroller则无法通过spring-mvc的package扫描*/
package com.zrthas.controller.user;

import com.sun.org.apache.bcel.internal.classfile.Code;
import com.zrthas.entity.User;
import com.zrthas.entity.common.CodeValue;
import com.zrthas.entity.common.ResultParamEntity;
import com.zrthas.entity.user.UserEntity;
import com.zrthas.entity.user.UserInfoEntity;
import com.zrthas.service.user.impl.UserService;
import com.zrthas.until.GetIp;
import com.zrthas.until.UUIDTool;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.xml.transform.Result;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @methon 用于用户的登录或登出等
 * @author zrthas
 * @date 2018/10/10
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    private static final Logger logger = Logger.getLogger(LoginController.class);

    @Resource
    private UserService userService;

    @RequestMapping("existuser")
    @ResponseBody
    public ResultParamEntity<UserEntity> existUser(@RequestParam("userLoginName") String userLoginName){
        UserEntity userEntity = new UserEntity();
        userEntity.setUserLoginName(userLoginName);
        Boolean exist =userService.findUserExist(userEntity);
        ResultParamEntity<UserEntity> resultParamEntity = new ResultParamEntity<UserEntity> ();
        if (exist) {
            resultParamEntity.setCode(CodeValue.ACC_SUCCESS_CODE);
            resultParamEntity.setMsg(CodeValue.ACC_SUCCESS_MSG);
        } else {
            resultParamEntity.setCode(CodeValue.ACC_FAIL_CODE);
            resultParamEntity.setMsg(CodeValue.ACC_FAIL_MSG);
        }

        return resultParamEntity;
    }

    /**
     * 注册步骤1-基本信息注入
     * @param request
     * @param userEntity
     * @param userInfoEntity
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "register",method = RequestMethod.POST)
    @ResponseBody
    public ResultParamEntity<UserEntity> registerUser(HttpServletRequest request, UserEntity userEntity, UserInfoEntity userInfoEntity) throws Exception {
        userInfoEntity.setUserId(userEntity.getUserId());
        userInfoEntity.setUserRegIp(GetIp.getUserIp(request));
        ResultParamEntity<UserEntity> resultParamEntity = new ResultParamEntity<UserEntity>();
        if (userService.insertNewUser(userEntity)){
            resultParamEntity.setCode(CodeValue.ACC_SUCCESS_CODE);
            resultParamEntity.setMsg(CodeValue.ACC_SUCCESS_REGIESTER_MSG);
        }else{
            resultParamEntity.setCode(CodeValue.ACC_FAIL_CODE);
            resultParamEntity.setMsg(CodeValue.ACC_FAIL_REGIESTER_MSG);
        }
        return resultParamEntity;
    }

    public ResultParamEntity<UserInfoEntity> perfectUserInfo(HttpServletRequest request, UserEntity userEntity, UserInfoEntity userInfoEntity){
        ResultParamEntity<UserInfoEntity> resultParamEntity = new ResultParamEntity<UserInfoEntity>();



        return resultParamEntity;
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