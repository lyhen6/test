package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2018/6/29.
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/login")
    public ModelAndView toLogin(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("login");
        return mv;
    }

    @RequestMapping(value = "/getData")
    @ResponseBody
    public String toLogin2(){
        return "hello word!";
    }

}
