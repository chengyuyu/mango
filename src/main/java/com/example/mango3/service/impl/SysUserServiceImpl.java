package com.example.mango3.service.impl;

import java.io.File;
import java.util.List;

import com.example.mango3.dao.SysUserMapper;
import com.example.mango3.domain.SysUser;
import com.example.mango3.page.MybatisPageHelper;
import com.example.mango3.page.PageRequest;
import com.example.mango3.page.PageResult;
import com.example.mango3.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SysUserServiceImpl implements SysUserService {
    
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> findAll() {
        return sysUserMapper.findAll();
    }

    @Override
    public SysUser findByName(String name) {
        return sysUserMapper.selectByUserName(name);
//        return null;
    }

    @Override
    public String findPermissions(String name) {
        return null;
    }

    @Override
    public String findUserRoles(Long userId) {
        return null;
    }

    @Override
    public File createUserExcelFile(PageRequest pageRequest) {
        return null;
    }


    @Override
    public int save(SysUser record) {
        // insert和insertSelective   插入全部属性和插入部分属性。
        if((sysUserMapper.selectByUserName(record.getName()) != null)){
            return sysUserMapper.updateByPrimaryKeySelective(record);
        }
        return sysUserMapper.insertSelective(record);
    }

    @Override
    public int delete(SysUser record) {
        return sysUserMapper.deleteByPrimaryKey(record.getId());
    }

    @Override
    public int delete(List<SysUser> records) {
        int cnt = 0;
        for(SysUser record : records){
            sysUserMapper.deleteByPrimaryKey(record.getId());
            cnt++;
        }
        return cnt;
    }

    @Override
    public SysUser findById(Long id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return MybatisPageHelper.findPage(pageRequest, sysUserMapper);
    }
}