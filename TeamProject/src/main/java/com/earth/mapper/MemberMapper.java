package com.earth.mapper;

import org.apache.ibatis.annotations.Param;

import com.earth.model.DogVo;
import com.earth.model.MemberVo;


public interface MemberMapper {

	public void memberJoin(MemberVo member);
	
	public void dogInsert(DogVo dog);
	
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
    
    //강아지 정보 수정
    public void dogUpdate(DogVo dog);
    
    //강아지 이름 체크
    public int dogNameCheck(String dog_name);
    

}
