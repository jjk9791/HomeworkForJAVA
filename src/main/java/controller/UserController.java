package controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.UserService;
import syz.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @Autowired
    private UserService userService;
    @RequestMapping("/doLogin")
    public String doLogin(@RequestParam String userName,
                          @RequestParam String userPassword,
                          HttpServletRequest request, HttpSession session){
        User user = userService.getOne(new QueryWrapper<User>().eq("name", userName));
        if (user != null && userPassword.equals(user.getPassword())){
            //登录成功
            session.setAttribute("userSession",user);
            return "redirect:/main";
        }
        request.setAttribute("error","用户名或者密码有误！！");
        return "login";
    }

    @RequestMapping("/main")
    public String main(){
        return "frame";
    }
}
