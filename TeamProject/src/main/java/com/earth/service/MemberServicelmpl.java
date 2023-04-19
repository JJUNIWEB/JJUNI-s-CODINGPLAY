package com.earth.service;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.earth.mapper.MemberMapper;
import com.earth.model.MemberVo;

@Service
public class MemberServicelmpl implements MemberService {
	
	@Autowired
	MemberMapper membermapper;
	
	@Override
	public void memberJoin(MemberVo member) throws Exception {
		membermapper.memberJoin(member);
		
	}

	@Override
	public int emailCheck(String user_email) throws Exception {
		return membermapper.emailCheck(user_email);
	}

	@Override
	public MemberVo memberLogin(MemberVo member) throws Exception {
		return membermapper.memberLogin(member);
	}

	@Override
	public int nickNameCheck(String user_nickname) throws Exception {
		return membermapper.nickNameCheck(user_nickname);
	}

	@Override
	public void memberUpdate(MemberVo member) throws Exception {
		membermapper.memberUpdate(member);
		
	}

	@Override
	public void addInfo(MemberVo member) throws Exception {
		membermapper.addInfo(member);
		
	}

	

	

	

	
	
	

}
