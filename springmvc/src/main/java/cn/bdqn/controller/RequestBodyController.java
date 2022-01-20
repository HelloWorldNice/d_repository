package cn.bdqn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestBodyController {

    @RequestMapping("/getBody")
    public void getBody(@CookieValue("JSESSIONID") String bodyContent){
        // username=springmvc&password=4488&age=99
        System.out.println(bodyContent);
    }
}
