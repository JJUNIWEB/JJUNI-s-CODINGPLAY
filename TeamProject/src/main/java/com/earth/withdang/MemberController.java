package com.earth.withdang;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.earth.model.MemberVo;
import com.earth.service.MemberService;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class MemberController {
	
	@Autowired
	private MemberService memberservice;
	
	@RequestMapping(value = "/" , method = RequestMethod.GET)
	public String mainPageGET() {
		
		return "/main1";
		
	}
	
//	@RequestMapping(value="join" ,method = RequestMethod.GET)
//	public void joinGET() {
//		logger.info("회원가입 페이지 진입");
//	}
	
	@PostMapping("/main1")
	public String joinPOST(MemberVo member) throws Exception {
		//회원가입 서비스 실행
		memberservice.memberJoin(member);

		return "redirect:/";
		
	}
	
	@GetMapping(value="/login")
	public String loginGET() {
		
		return "/login";
	}
	
	// 아이디 중복 검사
		@RequestMapping(value = "/login", method = RequestMethod.POST)
		@ResponseBody
		public String memberIdChkPOST(String user_email) throws Exception{
			
			int result = memberservice.emailCheck(user_email);
			
			if(result != 0) {
				
				return "fail";	// 중복 아이디가 존재
				
			} else {
				
				return "success";	// 중복 아이디 x
				
			}	
			
			
		} // memberIdChkPOST() 종료	
	
}
