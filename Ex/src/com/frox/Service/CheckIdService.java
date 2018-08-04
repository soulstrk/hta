package com.frox.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.frox.Dao.FroxDao;

public class CheckIdService implements Service {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		FroxDao dao = new FroxDao();
		int w = dao.checkId(id);
		if(w == -1) {
			request.setAttribute("check", "�̹� �����ϴ� ���̵� �Դϴ�.");
		}else if(w == 1) {
			request.setAttribute("check", "��� ������ ���̵� �Դϴ�!");
		}
	}

}
