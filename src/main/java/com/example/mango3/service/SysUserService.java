package com.example.mango3.service;

import com.example.mango3.domain.SysUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SysUserService extends CurdService<SysUser>{

    /**
     * 查找所有用户
     * @return
     */
    List<SysUser> findAll();
}