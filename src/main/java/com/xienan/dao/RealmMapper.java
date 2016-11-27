package com.xienan.dao;

import com.xienan.model.Realm;

public interface RealmMapper {
    int deleteByPrimaryKey(Integer realmId);

    int insert(Realm record);

    int insertSelective(Realm record);

    Realm selectByPrimaryKey(Integer realmId);

    int updateByPrimaryKeySelective(Realm record);

    int updateByPrimaryKey(Realm record);
}