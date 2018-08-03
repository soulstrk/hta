package com.frox.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.frox.Dao.FroxDao;
import com.frox.Dto.FroxDto;

public class InsertService implements Service {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		String id = (String)request.getParameter("id");
		String pwd = (String)request.getParameter("pwd");
		String name = (String)request.getParameter("name");
		String birth = (String)request.getParameter("birth");
		String gender = (String)request.getParameter("gender");
		String phone = (String)request.getParameter("phone");
		FroxDto dto = new FroxDto(id, pwd, name, birth, gender, phone, null);
		
		FroxDao dao = new FroxDao();
		int w = dao.insertMember(dto);
		
	}

}
