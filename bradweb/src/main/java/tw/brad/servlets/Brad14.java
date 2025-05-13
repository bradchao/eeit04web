package tw.brad.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tw.brad.apis.Bike;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Brad14")
public class Brad14 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Integer x = (Integer)request.getAttribute("x");
		Integer y = (Integer)request.getAttribute("y");
		Bike bike = (Bike)request.getAttribute("bike");
		
		PrintWriter out = response.getWriter();
		out.printf("I am Brad14: x = %d; y = %d<br />", x, y);
		out.println(bike);
	}


}
