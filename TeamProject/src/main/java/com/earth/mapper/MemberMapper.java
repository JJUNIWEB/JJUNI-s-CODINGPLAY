package com.earth.mapper;

import org.apache.ibatis.annotations.Param;

import com.earth.model.DogVo;
import com.earth.model.MemberInfoVo;
import com.earth.model.MemberVo;


public interface MemberMapper {

	public void memberJoin(MemberInfoVo member);
	
	public void dogInsert(MemberInfoVo member);
	
	// 이메일 중복 검사
	public int emailCheck(String user_email);
	
	// 닉네임 중복 검사
	public int nickNameCheck(String user_nickname);
	
	/* 로그인 */
    public MemberInfoVo memberLogin(MemberInfoVo member);
    
    // 회원정보 수정
    public void memberUpdate(MemberInfoVo member);
    
    //강아지 정보 추가
    public void dogJoin(DogVo dog);
    
    //강아지 정보 수정
    public void dogUpdate(MemberInfoVo member);
    
    //강아지 이름 체크
    public int dogNameCheck(String dog_name);
    

}
