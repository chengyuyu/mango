package com.example.mango3.service.impl;

import com.example.mango3.dao.SysRoleMapper;
import com.example.mango3.domain.SysMenu;
import com.example.mango3.domain.SysRole;
import com.example.mango3.domain.SysRoleMenu;
import com.example.mango3.page.PageRequest;
import com.example.mango3.page.PageResult;
import com.example.mango3.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysRoleServiceImpl implements SysRoleService {
    @Autowired
    private SysRoleMapper sysRoleMapper;

    public SysRole findRoleById(Long id){
        return sysRoleMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SysRole> findAll() {
        return null;
    }

    @Override
    public List<SysMenu> findRoleMenus(Long roleId) {
        return null;
    }

    @Override
    public int saveRoleMenus(List<SysRoleMenu> records) {
        return 0;
    }

    @Override
    public List<SysRole> findByName(String name) {
        return null;
    }

    @Override
    public int save(SysRole record) {
        return 0;
    }

    @Override
    public int delete(SysRole record) {
        return 0;
    }

    @Override
    public int delete(List<SysRole> records) {
        return 0;
    }

    @Override
    public SysRole findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return null;
    }
}
