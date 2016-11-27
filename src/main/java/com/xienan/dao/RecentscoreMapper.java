package com.xienan.dao;

import com.xienan.model.Recentscore;

public interface RecentscoreMapper {
    int deleteByPrimaryKey(Integer matchId);

    int insert(Recentscore record);

    int insertSelective(Recentscore record);

    Recentscore selectByPrimaryKey(Integer matchId);

    int updateByPrimaryKeySelective(Recentscore record);

    int updateByPrimaryKey(Recentscore record);
}