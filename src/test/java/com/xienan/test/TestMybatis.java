package com.xienan.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xienan.model.Contestant;
import com.xienan.service.UserService;

public class TestMybatis {
	private ApplicationContext ac;

	private UserService userService;
	
	@Before
	public void before(){
		ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
		userService = (UserService) ac.getBean("userservice");
	}
	

	
	@Test
	public void test(){
		Contestant contestant = (Contestant) userService.getUserById("1");
		System.out.println("ContestantAddress = " + contestant.getContestantAddress());
	}
	
	
	
}
