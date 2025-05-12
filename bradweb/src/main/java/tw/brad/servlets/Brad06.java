package tw.brad.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/Brad06")
public class Brad06 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Brad06?x=10&y=3
		String x = request.getParameter("x");
		String y = request.getParameter("y");
		String result;
		
		if (x != null && y != null) {
			result = Integer.parseInt(x) + Integer.parseInt(y) + "";
		}else {
			x = y = result = ""; 
		}
		//--------------------------------------
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.printf("<meta charset='UTF-8' />\n")
			.printf("<form action='Brad06'>\n")
			.printf("	<input name='x' value='%s' />\n", x)
			.printf("	+\n")
			.printf("	<input name='y' value='%s' />\n", y)
			.printf("	<input type='submit' value='=' />\n")
			.printf("%s", result)
			.printf("</form>\n");
	
	
	}

}
