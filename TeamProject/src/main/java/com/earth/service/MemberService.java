package com.earth.service;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import com.earth.model.MemberVo;

public interface MemberService {

	public void memberJoin(MemberVo member) throws Exception;
	
	// 이메일 중복 검사
	public int emailCheck(String user_email) throws Exception;
	
	// 닉네임 중복검사
	public int nickNameCheck(String user_nickname) throws Exception;
	
	/* 로그인 */
    public MemberVo memberLogin(MemberVo member) throws Exception;
}
