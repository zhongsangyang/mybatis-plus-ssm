package com.baomidou.springmvc.controller;

import com.baomidou.springmvc.model.enums.TypeEnum;
import com.baomidou.springmvc.model.system.User;
import com.baomidou.springmvc.service.system.IUserService;
import com.baomidou.springmvc.service.system.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class MyUserController {
    private final  MyUserService myUserService;
    @Autowired
    public MyUserController(MyUserService myUserService) {
        this.myUserService = myUserService;
    }
    @RequestMapping("/testMytest")
    public String testMytest(){
        User user=new User();
        user.setName("ylz");
        user.setAge(21);
        user.setCtime(new Date());
        user.setType(TypeEnum.NORMAL);
        user.setId(4l);
        myUserService.insert(user);
        return "TestMyUser";
    }
}
