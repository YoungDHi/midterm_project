package com.camp.s1.member;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	
	@Autowired
	private MemberDAO memberDAO;
	
	public boolean getMemberIdCheck(MemberDTO memberDTO)throws Exception{
		memberDTO = memberDAO.getMemberLogin(memberDTO);
		
		boolean check =  true;
		if(memberDTO !=null) {
			check = false;
		}
		return check;
	}
	
	public int setMemberJoin(MemberDTO memberDTO)throws Exception {
		
		int result = memberDAO.setMemberJoin(memberDTO);
		
		return result;
	}
	
	public MemberDTO getMemberLogin(MemberDTO memberDTO)throws Exception{
		MemberDTO result = memberDAO.getMemberLogin(memberDTO);
		
		if(result != null && memberDTO.getPw().equals(result.getPw())) {
			
			memberDTO.setPw(null);
			return memberDTO;
			
		}else {
			return null;
		}	
	}
	
	public MemberDTO getMemberPage(MemberDTO memberDTO)throws Exception{
	
		return memberDAO.getMemberLogin(memberDTO);
	}

	public int setMemberUpdate(MemberDTO memberDTO)throws Exception{
		
		return memberDAO.setMemberUpdate(memberDTO);
	}
	
	public int setMemberDelete(MemberDTO memberDTO)throws Exception{
		return memberDAO.setMemberDelete(memberDTO);
	}

//비밀 번호 변경
	public int setmemberPwChange(MemberDTO memberDTO, HttpServletResponse response)throws Exception{
		String oldPw = new String();
		
		PrintWriter out = response.getWriter();
		
		//if(oldPw.equals(memberDAO.getMemberLogin(memberDTO.getPw()))) {
			
		//}
		
		return memberDAO.setMemberUpdate(memberDTO);
	}

}
