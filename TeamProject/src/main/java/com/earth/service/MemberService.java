package com.earth.service;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import com.earth.model.MemberVo;

public interface MemberService {

	public void memberJoin(MemberVo member) throws Exception;
	
	
}
