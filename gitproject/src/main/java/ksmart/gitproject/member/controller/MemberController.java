package ksmart.gitproject.member.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ksmart.gitproject.member.dto.Member;
import ksmart.gitproject.member.service.MemberService;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping(value="/member")
public class MemberController {
	
	private final MemberService memberService;
	
	@GetMapping("/memberList")
	public String memberList(Model model) {
		List<Member> memberList = memberService.getMemberList();
		
		model.addAttribute("title", "회원목록");
		model.addAttribute("memberList",memberList);
		
		return "member/memberList";
	}

}
