package com.xienan.dao;

import com.xienan.model.Contestant;

public interface ContestantMapper {
    int deleteByPrimaryKey(Long contestantId);

    int insert(Contestant record);

    int insertSelective(Contestant record);

    Contestant selectByPrimaryKey(Long contestantId);

    int updateByPrimaryKeySelective(Contestant record);

    int updateByPrimaryKey(Contestant record);
}