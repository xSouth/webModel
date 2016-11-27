package com.xienan.dao;

import com.xienan.model.Voidoreview_comment;

public interface Voidoreview_commentMapper {
    int deleteByPrimaryKey(Long commentId);

    int insert(Voidoreview_comment record);

    int insertSelective(Voidoreview_comment record);

    Voidoreview_comment selectByPrimaryKey(Long commentId);

    int updateByPrimaryKeySelective(Voidoreview_comment record);

    int updateByPrimaryKey(Voidoreview_comment record);
}