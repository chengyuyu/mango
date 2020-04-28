package com.example.mango3.service.impl;

import com.example.mango3.domain.SysLoginLog;
import com.example.mango3.page.PageRequest;
import com.example.mango3.page.PageResult;
import com.example.mango3.service.SysLoginLogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysLoginLogServiceImpl implements SysLoginLogService {
    @Override
    public int save(SysLoginLog record) {
        return 0;
    }

    @Override
    public int delete(SysLoginLog record) {
        return 0;
    }

    @Override
    public int delete(List<SysLoginLog> records) {
        return 0;
    }

    @Override
    public SysLoginLog findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return null;
    }
}
