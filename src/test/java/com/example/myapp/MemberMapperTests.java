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
	private MemberMapper membermapper;			//MemberMapper.java �������̽� ������ ����
	
	//ȸ������ ���� �׽�Ʈ �޼���
	@Test
	public void memberJoin() throws Exception{
		MemberVO member = new MemberVO();
		
		member.setMemberId("test");			//ȸ�� id
		member.setPassword("test");			//ȸ�� ��й�ȣ
		member.setName("���̹�");		//ȸ�� �̸�
		member.setEmail("test@gmial.com");		//ȸ�� ����
		member.setPhone("010-1234-5678");	//ȸ�� ���ּ�
		
		membermapper.memberJoin(member);			//���� �޼��� ����
		
	}
	
	
	
}