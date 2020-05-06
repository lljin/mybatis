package com.lljin.mapper;

import com.lljin.entity.Author;
import com.lljin.entity.Business;

/**
 * @author lljin
 * @description 商户操作mapper
 * @date 2020/5/6 23:50
 */
public interface BusinessMapper {
    /**
     * 根据ID查询商户信息
     *
     * @param id 商户ID
     * @return 商户信息
     */
    Business getBusinessById(int id);

    /**
     * 添加商户信息
     *
     * @param business 商户信息
     * @return 商户信息
     */
    int addBusiness(Business business);
}
