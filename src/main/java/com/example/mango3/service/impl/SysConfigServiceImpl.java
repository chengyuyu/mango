package com.example.mango3.service.impl;

import com.example.mango3.domain.SysConfig;
import com.example.mango3.page.PageRequest;
import com.example.mango3.page.PageResult;
import com.example.mango3.service.SysConfigService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysConfigServiceImpl implements SysConfigService {
    @Override
    public List<SysConfig> findByLable(String lable) {
        return null;
    }

    @Override
    public int save(SysConfig record) {
        return 0;
    }

    @Override
    public int delete(SysConfig record) {
        return 0;
    }

    @Override
    public int delete(List<SysConfig> records) {
        return 0;
    }

    @Override
    public SysConfig findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return null;
    }
}
