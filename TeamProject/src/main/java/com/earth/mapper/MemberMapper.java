package com.earth.mapper;

import org.apache.ibatis.annotations.Param;

import com.earth.domain.DogDto;
import com.earth.domain.MemberInfoDto;
import com.earth.domain.MemberDto;


public interface MemberMapper {

	public void memberJoin(MemberInfoDto member);
	
	public void dogInsert(MemberInfoDto member);
	
	// 이메일 중복 검사
	public int emailCheck(String user_email);
	
	// 닉네임 중복 검사
	public int nickNameCheck(String user_nickname);
	
	/* 로그인 */
    public MemberInfoDto memberLogin(MemberInfoDto member);
    
    // 회원정보 수정
    public void memberUpdate(MemberInfoDto member);
    
    //강아지 정보 추가
    public void dogJoin(DogDto dog);
    
    //강아지 정보 수정
    public void dogUpdate(MemberInfoDto member);
    
    //강아지 이름 체크
    public int dogNameCheck(String dog_name);
    

}
