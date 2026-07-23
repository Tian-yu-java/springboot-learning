package com.wcy.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//声明控制器
//使用@Controller声明的控制器对象,类中定义方法
//他的返回值都表示视图(一个html的路径和名称, 一个thymeleaf文件)
@Controller
@RequestMapping("/user")
public class UserController {
    //uri: /user/list 请求访问地址, 就是api接口名称
    //@GetMapping("/list")
    /**
     * @RequestMapping: 请求映射,将请求绑定到指定方法
     * value:请求的uri地址, 以"/"开头       uri地址是唯一的
     *method: 请求的方式, GET, POST ..., 使用RequestMethod的枚举值
     *              如果不知道method属性, 请求方式没有限制
     *              如果提交的请求方式与method不一致, Method Not Allowed, status=405
     *
     *              value和method组合是唯一的 就可以表示uri
     */
    @RequestMapping(value={"/list","/show"},method = {RequestMethod.GET})
    public String userList(){
        System.out.println("====进入userList====");
        return "redirect:/users.html";//视图文件的路径和名称
    }

    @RequestMapping(value = "/list",method=RequestMethod.POST)
    public Object userListPage(){
        System.out.println("进入userListPage");
        return "/userPage";
    }
}
