package com.shang.team.web;


import com.shang.team.entity.User;
import com.shang.team.service.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author sjy
 * @since 2019-02-28
 */
@RestController
@RequestMapping("/team/user")
@Slf4j
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/login")
    public String login(){
        User user = userService.selectById("1");
        return user.toString();
    }


    @RequestMapping("/test")
    public String test(String id){
        User user = userService.selectById("2");
        for(int i=0;i<2;i++){
            log.debug("debug"+i);
            log.info("info"+i);
            log.warn("warn"+i);
            log.error("error"+i);
        }
        int a = 1/0;
        return user.toString();
    }




    @RequestMapping("/loginAction")
    public String loginAction(String username){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, "");
        try {
            //如果执行subject.login不抛出异常则说明登陆成功
            subject.login(token);
            return "login success";
        } catch (AuthenticationException e) {
            //如果执行subject.login抛出异常则说明登陆失败
            e.printStackTrace();
            return "login Failed";
        }
    }
	
}
