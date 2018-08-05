package com.frox.FrontController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.frox.Service.CheckIdService;
import com.frox.Service.InsertService;
import com.frox.Service.Service;
import com.frox.Service.existIdService;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionDo(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionDo(request,response);
	}

	protected void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		
		String viewPage = "";
		Service service = null;
		
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
		
		if(com.equals("/insert.do")) {
			service = new InsertService();
			service.execute(request, response);
			viewPage = "index.jsp";
		}else if(com.equals("/checkId.do")) {
			service = new CheckIdService();
			service.execute(request, response);
			viewPage = "openIdChk.jsp";
		}else if(com.equals("/existId.do")) {
			service = new existIdService();
			service.execute(request, response);
			int existNum = (int) request.getAttribute("exist");
			if(existNum == 1) {
				viewPage = "content.jsp";
			}else if(existNum == -1) {
				viewPage = "index.jsp";
				request.setAttribute("loginFail", "-1");
			}
		}else if(com.equals("/logout.do")) {
			session.invalidate();
			//System.out.println(session.getAttribute("id")); 세션을 말소한 상태에서 부르니 에러 발생
			viewPage = "alert.jsp";
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}
}
