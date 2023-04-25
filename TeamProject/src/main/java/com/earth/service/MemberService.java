package com.earth.service;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.Param;

import com.earth.model.DogVo;
import com.earth.model.MemberVo;

public interface MemberService {

	public void memberJoin(MemberVo member) throws Exception;
	
	public void dogInsert(DogVo dog) throws Exception;
	
	// 이메일 중복 검사
	public int emailCheck(String user_email) throws Exception;
	
	// 닉네임 중복검사
	public int nickNameCheck(String user_nickname) throws Exception;
	
	/* 로그인 */
    public MemberVo memberLogin(MemberVo member) throws Exception;
    
    /* 회원정보수정 */
    public void memberUpdate(MemberVo member) throws Exception;
    
    public void dogJoin(DogVo dog) throws Exception;
    
    public void dogUpdate(DogVo dog) throws Exception;
    
    public int dogNameCheck(String dog_name) throws Exception;
    
}
