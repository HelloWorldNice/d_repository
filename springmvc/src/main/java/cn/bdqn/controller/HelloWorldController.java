package cn.bdqn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// 控制器类---Servlet
@Controller
@RequestMapping(value = "/hello")
public class HelloWorldController {

    // @RequestMapping作用：将请求和方法(处理请求)联系起来
    @RequestMapping(value = "/login" , method = {RequestMethod.POST,RequestMethod.GET},
                    params = {"username=yyy"})
    public String login(){
        // 这个字符串就是一个逻辑视图名称
        // 通过视图解析，/WEB-INF/jsp/ + 逻辑视图名 + .jsp ==> 物理路径
        // /WEB-INF/jsp/success.jsp ---> 请求转发
        return "success";
    }
}
