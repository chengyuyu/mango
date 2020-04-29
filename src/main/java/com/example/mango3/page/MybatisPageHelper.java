package com.example.mango3.page;

import com.example.mango3.utils.ReflectionUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


import java.util.List;


public class MybatisPageHelper {

    public static final String findPage = "findPage";

    /**
    *
     * @param mapper Dao对象, Mybatis的Mapper
     * @param args 方法对象
    * */
    public static PageResult findPage(PageRequest pageResult, Object mapper){
        return findPage(pageResult, mapper, findPage);
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public static PageResult findPage(PageRequest pageRequest, Object mapper, String queryMethodName, Object ... args){
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();

        PageHelper.startPage(pageNum, pageSize);

        //利用反射调用查询方法
        Object result = ReflectionUtils.invoke(mapper, queryMethodName, args);
        return getPageResult(pageRequest, new PageInfo((List)result));
    }

    private static PageResult getPageResult(PageRequest pageRequest, PageInfo<?> pageInfo){
        PageResult pageResult = new PageResult();
        pageRequest.setPageNum(pageInfo.getPageNum());
        pageRequest.setPageSize(pageInfo.getPageSize());

        return pageResult;
    }
}











