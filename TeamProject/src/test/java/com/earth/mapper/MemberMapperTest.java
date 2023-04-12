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
	
	/*
	 * @Test public void memberJoin() throws Exception { MemberVo member = new
	 * MemberVo();
	 * 
	 * 
	 * member.setUser_email("spring_test111"); member.setUser_pw("1111111");
	 * member.setUser_name("Test111");
	 * 
	 * 
	 * membermapper.memberJoin(member); }
	 */
	
	// 아이디 중복검사
		@Test
		public void emailCheck() throws Exception{
			String email = "csj53055@naver.com";	// 존재하는 아이디
			String email2 = "test123@asdfw.com";	// 존재하지 않는 아이디
			membermapper.emailCheck(email);
			membermapper.emailCheck(email2);
		}
	
}
