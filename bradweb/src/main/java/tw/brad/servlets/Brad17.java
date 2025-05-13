package tw.brad.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Brad17")
public class Brad17 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String x = request.getParameter("x");
		String y = request.getParameter("y");
		
		// 運算 model
		
		
		
		// 呈現 View
		RequestDispatcher dispatcher = 
			request.getRequestDispatcher("Brad18");
		response.setContentType("text/html; charset=UTF-8");
		dispatcher.forward(request, response);
		
		
		
	
	
	
	}

}
