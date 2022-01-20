package cn.bdqn.controller;

import cn.bdqn.domain.User;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

//    @InitBinder
//    public void initBinder(WebDataBinder binder) {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        dateFormat.setLenient(false); // 严格按照指定的格式进行解析
//        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
//    }

    // 基本数据类型、包装类型+String
    @RequestMapping(value = "/register" , method = RequestMethod.POST)
    public void register(String username,String password,int age){
        System.out.println("username-->" + username);
        System.out.println("password-->" + password);
        System.out.println("age---" + (age + 90));
    }

    // 实体请求参数的绑定
    @RequestMapping(value = "/register2" , method = RequestMethod.POST)
    public void register2(User user){
        System.out.println(user);
    }

    // 实体 + 关联实体    请求参数的绑定
    @RequestMapping(value = "/register3" , method = RequestMethod.POST)
    public void register3(User user){
        System.out.println(user);
        System.out.println(user.getAddress());
    }

    // 实体 + List类型    请求参数的绑定
    @RequestMapping(value = "/register4" , method = RequestMethod.POST)
    public void register4(User user){
        System.out.println(user);
        System.out.println(user.getAddressList());
    }

    // 实体 + Map类型    请求参数的绑定
    @RequestMapping(value = "/register5" , method = {RequestMethod.POST,RequestMethod.GET})
    public void register5(User user){
        System.out.println("-----");
        System.out.println(user);
        System.out.println(user.getAddressMap());
    }

    // 日期类型    请求参数的绑定
    @RequestMapping(value = "/register6" , method = RequestMethod.POST)
    public void register6(User user){
        System.out.println(user);
    }


    // --------------------------------------------

    // 异步提交ajax数据
    @RequestMapping(value = "/login" , method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> login(User user){  // key1=value1&key2=value2
        System.out.println(user);

        Map<String,Object> maps = new HashMap<>();
        maps.put("code",200);
        maps.put("msg","用户登录成功");

        return maps;
    }

    // 异步提交ajax数据
    @RequestMapping(value = "/login2" , method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> login2(@RequestBody User user){    // {"username":"kkk","password":"888","age":"66666"}
        System.out.println(user);

        Map<String,Object> maps = new HashMap<>();
        maps.put("code",200);
        maps.put("msg","用户登录成功");

        return maps;
    }

    // 异步提交ajax数据
    @RequestMapping(value = "/login3" , method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> login3(User user){
        System.out.println(user);

        Map<String,Object> maps = new HashMap<>();
        maps.put("code",200);
        maps.put("msg","用户登录成功");

        return maps;
    }

    // -------------  文件上传 --------------------
    @RequestMapping("/upload")
    public void upload(HttpServletRequest request,MultipartFile touxiang) throws Exception{

        // 1、得到文件上传的路径
        String path = request.getServletContext().getRealPath("/upload/");
        File destPath = new File(path);
        if(!destPath.exists()){
            destPath.mkdirs();
        }

        // 2、获取文件名称
        String fileName = touxiang.getOriginalFilename();

        // 3、保存文件
        touxiang.transferTo(new File(path,fileName));
    }
}
