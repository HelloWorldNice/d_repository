package cn.bdqn.controller;

import cn.bdqn.domain.Address;
import cn.bdqn.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class ModelDataController {

    // 处理模型数据

    // 方式一：使用原生态的方式
    @RequestMapping(value = "/handleModelData1")
    public void handleModelData1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 构造数据
        User user = new User();
        user.setUsername("HelloWorld");
        user.setAge(34);
        user.setBorn(new Date());
        user.setPassword("222222");
        List<Address> list = new ArrayList<>();
        Address address1 = new Address();
        address1.setProvince("河南省");
        address1.setCity("郑州市");

        Address address2 = new Address();
        address2.setProvince("浙江省");
        address2.setCity("杭州市");
        list.add(address1);
        list.add(address2);
        user.setAddressList(list);

        // 保存到request作用域
        request.setAttribute("user",user);

        request.getRequestDispatcher("/WEB-INF/jsp/userinfo.jsp").forward(request,response);
    }

    // 方式二：方法形参中使用Map类型
    @RequestMapping(value = "/handleModelData2")
    public String handleModelData2(Map<String,Object> map){
        // 构造数据
        User user = new User();
        user.setUsername("SpringMVC");
        user.setAge(34);
        user.setBorn(new Date());
        user.setPassword("222222");
        List<Address> list = new ArrayList<>();
        Address address1 = new Address();
        address1.setProvince("河南省");
        address1.setCity("郑州市");

        Address address2 = new Address();
        address2.setProvince("浙江省");
        address2.setCity("杭州市");
        list.add(address1);
        list.add(address2);
        user.setAddressList(list);

        map.put("user",user);

        return "userinfo";
    }

    // 方式三：方法形参中使用Model类型
    @RequestMapping(value = "/handleModelData3")
    public String handleModelData3(Model model){
        // 构造数据
        User user = new User();
        user.setUsername("MyBatis");
        user.setAge(34);
        user.setBorn(new Date());
        user.setPassword("222222");
        List<Address> list = new ArrayList<>();
        Address address1 = new Address();
        address1.setProvince("河南省");
        address1.setCity("郑州市");

        Address address2 = new Address();
        address2.setProvince("浙江省");
        address2.setCity("杭州市");
        list.add(address1);
        list.add(address2);
        user.setAddressList(list);

        model.addAttribute("user",user);

        return "userinfo";
    }

    // 方式四：方法形参中使用ModelMap类型
    @RequestMapping(value = "/handleModelData4")
    public String handleModelData4(ModelMap modelMap){
        // 构造数据
        User user = new User();
        user.setUsername("Spring");
        user.setAge(34);
        user.setBorn(new Date());
        user.setPassword("222222");
        List<Address> list = new ArrayList<>();
        Address address1 = new Address();
        address1.setProvince("河南省");
        address1.setCity("郑州市");

        Address address2 = new Address();
        address2.setProvince("浙江省");
        address2.setCity("杭州市");
        list.add(address1);
        list.add(address2);
        user.setAddressList(list);

        modelMap.addAttribute("user",user);

        return "userinfo"; // 逻辑视图名称
    }

    // 方式五：方法形参中使用ModelAndView类型
    @RequestMapping(value = "/handleModelData5")
    public ModelAndView handleModelData5(ModelAndView mv){
        // 构造数据
        User user = new User();
        user.setUsername("SpringBoot");
        user.setAge(34);
        user.setBorn(new Date());
        user.setPassword("222222");
        List<Address> list = new ArrayList<>();
        Address address1 = new Address();
        address1.setProvince("河南省");
        address1.setCity("郑州市");

        Address address2 = new Address();
        address2.setProvince("浙江省");
        address2.setCity("杭州市");
        list.add(address1);
        list.add(address2);
        user.setAddressList(list);

        mv.setViewName("userinfo");
        mv.addObject("user",user);

        return mv;
    }


}
