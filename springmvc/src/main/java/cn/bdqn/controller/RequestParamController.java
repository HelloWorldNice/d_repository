package cn.bdqn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequestParamController {

    @RequestMapping("/getParam")
    public void getParam(@RequestParam(name="username") String name,
                         @RequestParam(name="pageNo",defaultValue = "1",required = false) Integer pageNo){
        System.out.println(name);
        System.out.println(pageNo);
    }
}
