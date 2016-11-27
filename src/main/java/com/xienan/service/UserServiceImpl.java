package com.xienan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xienan.dao.ContestantMapper;

@Service("userservice")
public class UserServiceImpl implements UserService {

	private ContestantMapper contestantmapper;
	@Autowired
	public void setContestantmapper(ContestantMapper contestantmapper) {
		this.contestantmapper = contestantmapper;
	}
	public ContestantMapper getContestantmapper() {
		return contestantmapper;
	}



	@Override
	public Object getUserById(String id) {
		return contestantmapper.selectByPrimaryKey(Long.parseLong(id));
	}

}
