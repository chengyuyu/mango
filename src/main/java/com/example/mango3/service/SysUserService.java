package com.example.mango3.service;

import com.example.mango3.domain.SysUser;
import com.example.mango3.page.PageRequest;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;

@Service
public interface SysUserService extends CurdService<SysUser>{

    /**
     * 查找所有用户
     * @return
     */
    List<SysUser> findAll();
    
    SysUser findByName(String name);


    String findPermissions(String name);

    String findUserRoles(Long userId);

    File createUserExcelFile(PageRequest pageRequest);
}