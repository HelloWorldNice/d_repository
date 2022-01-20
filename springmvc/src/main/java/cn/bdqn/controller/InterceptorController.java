package cn.bdqn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InterceptorController {

    @RequestMapping(value = "/testInterceptor")
    public String testInterceptor(){

        System.out.println("InterceptorController--->testInterceptor");

        return "success";
    }
}
