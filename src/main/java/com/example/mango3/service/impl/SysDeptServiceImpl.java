package com.example.mango3.service.impl;


import com.example.mango3.domain.SysDept;
import com.example.mango3.page.PageRequest;
import com.example.mango3.page.PageResult;
import com.example.mango3.service.SysConfigService;
import com.example.mango3.service.SysDeptService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysDeptServiceImpl implements SysDeptService {
    @Override
    public List<SysDept> findTree() {
        return null;
    }

    @Override
    public int save(SysDept record) {
        return 0;
    }

    @Override
    public int delete(SysDept record) {
        return 0;
    }

    @Override
    public int delete(List<SysDept> records) {
        return 0;
    }

    @Override
    public SysDept findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return null;
    }
}
