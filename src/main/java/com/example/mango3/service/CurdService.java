package com.example.mango3.service;

import com.example.mango3.page.PageRequest;
import com.example.mango3.page.PageResult;

import java.util.List;

public interface CurdService <T>{

    int save(T record);

    int delete(T record);

    int delete(List<T> records);

    T findById(Long id);

    PageResult findPage(PageRequest pageRequest);

}
