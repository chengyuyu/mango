package com.example.mango3.page;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class PageRequest {
    private int pageNum =1;

    private int pageSize = 10;

    private Map<String, Object> params = new HashMap<>();
}
