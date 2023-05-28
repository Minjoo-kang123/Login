package com.example.myapp;


import com.example.myapp.mapper.MemberMapper;
import com.example.myapp.model.MemberVO;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MemberMapperTests {

	@Autowired
	private MemberMapper membermapper;			//MemberMapper.java 인터페이스 의존성 주입
	
	//회원가입 쿼리 테스트 메서드
	@Test
	public void memberJoin() throws Exception{
		MemberVO member = new MemberVO();
		
		member.setMemberId("test");			//회원 id
		member.setPassword("test");			//회원 비밀번호
		member.setName("김이박");		//회원 이름
		member.setEmail("test@gmial.com");		//회원 메일
		member.setPhone("010-1234-5678");	//회원 상세주소
		
		membermapper.memberJoin(member);			//쿼리 메서드 실행
		
	}
	
	
	
}