package com.frox.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.frox.Dao.FroxDao;

public class existIdService implements Service {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		System.out.println("existIdService´Ù");
		FroxDao dao = new FroxDao();
		int w = dao.existId(id, pwd);
		if(w == 1) {
			request.setAttribute("exist", 1);
			session.setAttribute("id", id);
			session.setAttribute("pwd", pwd);
		}else if(w == -1) {
			request.setAttribute("exist", -1);
		}
	}

}
