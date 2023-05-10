package com.earth.withdang;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.earth.domain.DogDto;
import com.earth.domain.MemberInfoDto;
import com.earth.domain.MemberDto;
import com.earth.service.MemberService;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class LoginController {
	
	@Autowired
	private MemberService memberservice;
	
	@RequestMapping(value = "/" , method = RequestMethod.GET)
	public String mainPageGET() {
		
		return "/main";
		
	}
	
	@GetMapping(value="/login")
	public String loginGET() {
		
		return "/login";
	}
	
	//회원가입 서비스 실행
	@PostMapping("/join")
	public String joinPOST(MemberDto member) throws Exception {
		memberservice.memberJoin(member);
		memberservice.dogInsert(member);
		
		return "redirect:/login";
		
	}

	// 아이디 중복 검사
	@RequestMapping(value = "/emailCheck", method = RequestMethod.POST)
	@ResponseBody
	public String memberEmailCheckPOST(String user_email) throws Exception{
		
		int result = memberservice.emailCheck(user_email);
		
		if(result != 0) {
			
			return "fail";	// 중복 아이디가 존재
			
		} else {
			
			return "success";	// 중복 아이디 x
			
		}	
		
		
	} // memberIdChkPOST() 종료	
	
			// 닉네임 중복 검사
			@RequestMapping(value = "/nickNameCheck", method = RequestMethod.POST)
			@ResponseBody
			public String membernickNameCheckPOST(String user_nickname) throws Exception{
				
				int result = memberservice.nickNameCheck(user_nickname);
				
				if(result != 0) {
					
					return "fail";	// 중복 닉네임 존재
					
				} else {
					
					return "success";	// 중복 닉네임 x
					
				}	
				
				
			} // memberIdChkPOST() 종료	
	
		/* 로그인 */
	    @RequestMapping(value="/login", method = RequestMethod.POST)
	    public String loginPOST(String user_email, HttpServletRequest request, HttpServletResponse response, boolean rememberEmail ,MemberDto member, DogDto dog, RedirectAttributes rttr) throws Exception{
	        
    	System.out.println("login 메서드 진입");
        System.out.println("전달된 데이터 : " + member);
    	
    	MemberDto lvo = memberservice.memberLogin(member);
    	DogDto dvo = memberservice.dogSelect(dog);
    	//DogDto dog = new DogDto();
    	
    	if (rememberEmail) {
			//2-2-1. 쿠키를 생성
			//2-2-2. 응답헤더에 저장 			
			Cookie cookie = new Cookie("email", user_email);
			response.addCookie(cookie);
		}
		else {
			//2-3-1. 쿠키를 삭제
			//2-3-2. 응답헤더에 저장 	
			Cookie cookie = new Cookie("email", user_email);
			cookie.setMaxAge(0);
			response.addCookie(cookie);
		}
    	
    	if(lvo == null) {                                // 일치하지 않는 아이디, 비밀번호 입력 경우
            
            int result = 0;
            rttr.addFlashAttribute("result", result);
            return "redirect:/login";
            
        }
    	HttpSession session = request.getSession();
        //m.addAttribute("dog", dog);
    	session.setAttribute("member", lvo);             // 일치하는 아이디, 비밀번호 경우 (로그인 성공)
    	session.setAttribute("dvo", dvo);
        return "redirect:/";
   
    	}
    
	    @GetMapping("/logout")
	    public String logout(HttpSession session) {
	    	session.invalidate();
	    	return "redirect:/";
	    }
	    
	
}
