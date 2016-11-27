package com.xienan.dao;

import com.xienan.model.Agent;

public interface AgentMapper {
    int deleteByPrimaryKey(Long agentId);

    int insert(Agent record);

    int insertSelective(Agent record);

    Agent selectByPrimaryKey(Long agentId);

    int updateByPrimaryKeySelective(Agent record);

    int updateByPrimaryKey(Agent record);
}