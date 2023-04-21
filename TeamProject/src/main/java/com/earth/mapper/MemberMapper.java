package com.earth.mapper;

import com.earth.model.DogVo;
import com.earth.model.MemberVo;


public interface MemberMapper {

	public void memberJoin(MemberVo member);
	
	// 이메일 중복 검사
	public int emailCheck(String user_email);
	
	// 닉네임 중복 검사
	public int nickNameCheck(String user_nickname);
	
	/* 로그인 */
    public MemberVo memberLogin(MemberVo member);
    
    // 회원정보 수정
    public void memberUpdate(MemberVo member);
    
    //강아지 정보 추가
    public void dogJoin(DogVo dog);
    

}
