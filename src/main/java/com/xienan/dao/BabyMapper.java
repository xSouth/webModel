package com.xienan.dao;

import com.xienan.model.Baby;

public interface BabyMapper {
    int deleteByPrimaryKey(Long babyId);

    int insert(Baby record);

    int insertSelective(Baby record);

    Baby selectByPrimaryKey(Long babyId);

    int updateByPrimaryKeySelective(Baby record);

    int updateByPrimaryKey(Baby record);
}