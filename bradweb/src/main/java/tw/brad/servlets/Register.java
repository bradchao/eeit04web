package tw.brad.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tw.brad.apis.MemberDB;

import java.io.IOException;

@WebServlet("/Register")
public class Register extends HttpServlet {
	private MemberDB memberDB;
	
    public Register() {
    	try {
    		memberDB = new MemberDB();
    	}catch(Exception e) {
    		System.out.println(e);
    	}
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String account = request.getParameter("account");
		String passwd = request.getParameter("passwd");
		String cname = request.getParameter("cname");
		
		if (!memberDB.isAccountExist(account)) {
			try {
				if (memberDB.addMember(account, passwd, cname)) {
					response.sendRedirect("brad19.jsp");
				}else {
					response.sendRedirect("brad18.jsp?errType=1");
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}else {
			response.sendRedirect("brad18.jsp?errType=2");
		}
		
		
		
	}

}
