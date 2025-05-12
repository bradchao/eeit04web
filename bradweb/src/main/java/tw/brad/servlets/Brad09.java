package tw.brad.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.IOException;

@WebServlet("/Brad09")
@MultipartConfig( location = 
		"C:\\Users\\User\\git\\repository2\\bradweb\\src\\main\\webapp\\upload")
public class Brad09 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Part part = request.getPart("upload");
		if (part.getSize() > 0) {
			part.write("brad1.jpg");
			System.out.println("Upload Success");
		}else {
			System.out.println("Upload failure");
		}
	
	}

}
