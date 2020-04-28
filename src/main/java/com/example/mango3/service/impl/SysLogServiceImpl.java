package com.example.mango3.service.impl;

import com.example.mango3.domain.SysLog;
import com.example.mango3.page.PageRequest;
import com.example.mango3.page.PageResult;
import com.example.mango3.service.SysLogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysLogServiceImpl implements SysLogService {
    @Override
    public int save(SysLog record) {
        return 0;
    }

    @Override
    public int delete(SysLog record) {
        return 0;
    }

    @Override
    public int delete(List<SysLog> records) {
        return 0;
    }

    @Override
    public SysLog findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return null;
    }
}
