package com.example.mango3.service.impl;


import com.example.mango3.domain.SysDict;
import com.example.mango3.page.PageRequest;
import com.example.mango3.page.PageResult;
import com.example.mango3.service.SysDictService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysDictServiceImpl implements SysDictService {
    @Override
    public List<SysDict> findByLable(String lable) {
        return null;
    }

    @Override
    public int save(SysDict record) {
        return 0;
    }

    @Override
    public int delete(SysDict record) {
        return 0;
    }

    @Override
    public int delete(List<SysDict> records) {
        return 0;
    }

    @Override
    public SysDict findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return null;
    }
}
