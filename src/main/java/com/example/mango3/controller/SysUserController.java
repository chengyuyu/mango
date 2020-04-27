package com.example.mango3.controller;

import com.example.mango3.dao.SysUserMapper;
import com.example.mango3.domain.SysUser;
import com.example.mango3.http.HttpResult;
import com.example.mango3.page.PageRequest;
import com.example.mango3.service.SysUserService;
import com.github.pagehelper.PageHelper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @Resource
    private SysUserMapper sysUserMapper;

    @GetMapping(value="/findAll")
    public Object findAll() {
        return sysUserService.findAll();
    }

    @PostMapping(value = "/findPage")
    public HttpResult findPage(@RequestBody PageRequest pageRequest){
        return HttpResult.ok(sysUserService.findPage(pageRequest));
    }

    @GetMapping(value = "getUserListPage")
    public List<SysUser> getUserList(Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum, pageSize);
        return sysUserMapper.getUserListPage();
    }
}