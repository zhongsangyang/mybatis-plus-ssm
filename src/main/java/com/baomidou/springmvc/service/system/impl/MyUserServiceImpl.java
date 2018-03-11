package com.baomidou.springmvc.service.system.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.baomidou.springmvc.mapper.system.MyUserMapper;
import com.baomidou.springmvc.model.system.User;
import com.baomidou.springmvc.service.system.MyUserService;
import org.springframework.stereotype.Service;

@Service
public class MyUserServiceImpl extends ServiceImpl<MyUserMapper,User> implements MyUserService{
}
