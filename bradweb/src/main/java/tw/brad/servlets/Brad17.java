package tw.brad.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tw.brad.apis.MyModel;

import java.io.IOException;

@WebServlet("/Brad17")
public class Brad17 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String x = request.getParameter("x");
		String y = request.getParameter("y");
		String result = "";
		
		// 運算 model
		try {
			MyModel model = new MyModel(x, y);
			result = model.plus();
		} catch (Exception e) {
			x = y = "";
		}
		
		request.setAttribute("x", x);
		request.setAttribute("y", y);
		request.setAttribute("result", result);
		request.setAttribute("view", "view3");
		
		
		
		// 呈現 View
		RequestDispatcher dispatcher = 
			request.getRequestDispatcher("Brad19");
		response.setContentType("text/html; charset=UTF-8");
		dispatcher.forward(request, response);
		
		
		
	
	
	
	}

}
