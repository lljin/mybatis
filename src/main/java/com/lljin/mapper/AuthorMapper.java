package com.lljin.mapper;

import com.lljin.entity.Author;

/**
 * @author lljin
 * @description TODO
 * @date 2020/5/6 23:50
 */
public interface AuthorMapper {
    Author getAuthorById(int id);
    int addAuthor(Author author);
}
