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
		String x, y, op, result;
		x = y = op = result = "";
		
		try {
			x = request.getParameter("x");
			y = request.getParameter("y");
			op = request.getParameter("op");
			
			int intX = Integer.parseInt(x) ;
			int intY = Integer.parseInt(y);
			switch(op) {
				case "1": result = intX + intY + ""; break;
				case "2": result = intX - intY + ""; break;
				case "3": result = intX * intY + ""; break;
				case "4": 
					result = (intX / intY) + " ... " + (intX % intY); 
					break;
			}
			
		}catch(Exception e) {
			x = y = op = "";
		}
		
		
		
		
		//--------------------------------------
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.printf("<meta charset='UTF-8' />\n")
			.printf("<form action='Brad06'>\n")
			.printf("	<input name='x' value='%s' />\n", x)
			.printf("	<select name='op'>\n")
			.printf("	<option value='1' %s>+</option>\n", 
							op.equals("1")?"selected":"")
			.printf("	<option value='2' %s>-</option>\n", 
							op.equals("2")?"selected":"")
			.printf("	<option value='3' %s>x</option>\n", 
							op.equals("3")?"selected":"")
			.printf("	<option value='4' %s>/</option>\n", 
							op.equals("4")?"selected":"")
			.printf("	</select>\n")
			.printf("	<input name='y' value='%s' />\n", y)
			.printf("	<input type='submit' value='=' />\n")
			.printf("%s", result)
			.printf("</form>\n");
	
	
	}

}
