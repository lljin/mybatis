package com.lljin.entity;

import lombok.Data;

/**
 * @author lljin
 * @description TODO
 * @date 2020/5/6 23:48
 */
@Data
public class Comment {
    private Integer id;
    private Integer authorId;
    private String content;
}
