package cn.bdqn.controller;

import cn.bdqn.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExceptionController {

    @RequestMapping(value = "testException")
    public String testException(Integer id){

        System.out.println("测试异常");

        int x = 1 / 0;

        return "success";
    }
}
