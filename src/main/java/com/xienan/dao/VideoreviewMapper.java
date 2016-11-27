package com.xienan.dao;

import com.xienan.model.Videoreview;

public interface VideoreviewMapper {
    int deleteByPrimaryKey(Long videoId);

    int insert(Videoreview record);

    int insertSelective(Videoreview record);

    Videoreview selectByPrimaryKey(Long videoId);

    int updateByPrimaryKeySelective(Videoreview record);

    int updateByPrimaryKey(Videoreview record);
}