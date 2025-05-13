package tw.brad.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

@WebServlet("/Brad10")
@MultipartConfig( location = 
		"C:\\Users\\User\\git\\repository2\\bradweb\\src\\main\\webapp\\upload")
public class Brad10 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String account = request.getParameter("account");
		
		Collection<Part> parts = request.getParts();
		int i = 0;
		for (Part part: parts) {
			if (part.getName().equals("upload")) {
				if(part.getSize() > 0) {
					i++;
					String filename = 
						String.format("%s_%d_%s", 
							account, i, part.getSubmittedFileName());
					part.write(filename);
				}
			}
		}
		
		
		//-----------------
		response.setContentType("text/html; charset=UTF-8");
		
		
	
	}

}
