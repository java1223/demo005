package com.offcn.controller;

import com.offcn.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
public class Demo001Controller {
    @RequestMapping("/index")
    public String index(Model model) {
        String message = "廖思祥哇哈哈哈哈哈傻逼玩意！！！";
        model.addAttribute("message", message);
        return "index";
    }
    @RequestMapping("/getUser")
    public String getUser(Model model){
        User user = new User(1,"廖思选",55);
        model.addAttribute("user",user);
        Map<String, Object> map = new HashMap<>();
        map.put("src1","13.jpg");
        map.put("src2","20.jpg");
        map.put("src3","21.jpg");
        model.addAttribute("src",map);
        System.out.println("555555////////");
        return "index2";
    }
    @RequestMapping("/getUserList")
    public String getUserList(Model model){
        List<User> list = new ArrayList<User>();
        list.add(new User(1,"廖思狗1号",1));
        list.add(new User(2,"廖思狗2号 ",2));
        list.add(new User(3,"廖思狗3号",3));
        list.add(new User(4,"廖思狗4号",4));
        model.addAttribute("userList", list);
        return "index3";
    }
    @RequestMapping("/index4")
    public String index4(Model model){
        model.addAttribute("username","廖思狗1号");
        model.addAttribute("href","http://www.ujiuye.com");
        return "index4";
    }
    @RequestMapping("/index5")
    public String index5(Model model){
        model.addAttribute("result","y");
        model.addAttribute("menu","manager");
        model.addAttribute("manager","manager");
        return "index5";
    }
    @RequestMapping("/index6")
    public String index6(){
       System.out.println("********************");
        return "index6";
    }
    @RequestMapping("/index7")
    public String index7(Model model){
        //日期
        Date date = new Date();
        model.addAttribute("date",date);
        //数字格式化
        model.addAttribute("num",1323.222);
        //字符串处理
        String str="0-10-22 11:54:45.153  INFO 10744 --- [";
        model.addAttribute("str",str);
        //字符串截取
        String str2="javajkhkdelddiehue-gfgeufekfue";
        model.addAttribute("str2",str2);
        return "index7";
    }
}
