package com.earth.withdang;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MypageController {
	
	@GetMapping("/mypage")
	public void mypageGET () {
		
	}
	@GetMapping("/mypage_update")
	public void myPage_UpdateGET() {
		
	}
	@GetMapping("/addInfo")
	public void addInfoGET() {
		
	}
}
