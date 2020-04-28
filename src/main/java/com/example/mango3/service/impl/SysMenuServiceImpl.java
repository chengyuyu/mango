package com.example.mango3.service.impl;

import com.example.mango3.domain.SysMenu;
import com.example.mango3.page.PageRequest;
import com.example.mango3.page.PageResult;
import com.example.mango3.service.SysMenuService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysMenuServiceImpl implements SysMenuService {
    @Override
    public List<SysMenu> findTree(String userName, int menuType) {
        return null;
    }

    @Override
    public List<SysMenu> findByUser(String userName) {
        return null;
    }

    @Override
    public int save(SysMenu record) {
        return 0;
    }

    @Override
    public int delete(SysMenu record) {
        return 0;
    }

    @Override
    public int delete(List<SysMenu> records) {
        return 0;
    }

    @Override
    public SysMenu findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return null;
    }
}
