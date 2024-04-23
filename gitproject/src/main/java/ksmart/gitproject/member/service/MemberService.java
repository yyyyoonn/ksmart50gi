package ksmart.gitproject.member.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ksmart.gitproject.member.dto.Member;
import ksmart.gitproject.member.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService {
	
	private final MemberMapper memberMapper;
	
	public List<Member> getMemberList(){
		return memberMapper.getMemberList();
	}

}
