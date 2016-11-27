package com.xienan.dao;

import com.xienan.model.Rating;

public interface RatingMapper {
    int insert(Rating record);

    int insertSelective(Rating record);
}