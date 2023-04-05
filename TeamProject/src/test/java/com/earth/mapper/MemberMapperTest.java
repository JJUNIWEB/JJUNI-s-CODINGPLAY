package com.earth.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.earth.model.MemberVo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MemberMapperTest {

	@Autowired
	private MemberMapper membermapper;
	
	@Test
	public void memberJoin() throws Exception {
		MemberVo member = new MemberVo();
		
		member.setUser_no(0);
		member.setUser_email("spring_test");
		member.setUser_pw("1111");
		member.setUser_name("Test");
		member.setUser_pnum("Test");
		
		membermapper.memberJoin(member);
	}
}
