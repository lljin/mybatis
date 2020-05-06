package com.lljin.entity;

import lombok.Data;

import java.util.List;

/**
 * @author lljin
 * @description 商户实体类
 * @date 2020/5/7 0:10
 */
@Data
public class Business {
    private Integer id;
    private String name;
    private List<Integer> scope;
}
