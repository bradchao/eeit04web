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

@WebServlet("/Brad09")
@MultipartConfig( location = 
		"C:\\Users\\User\\git\\repository2\\bradweb\\src\\main\\webapp\\upload")
public class Brad09 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String urip = request.getRemoteAddr();
		Part part = request.getPart("upload");
		
		String type = part.getContentType();
		String name = part.getName();
		long size = part.getSize();
		String fileName = part.getSubmittedFileName();
		
		System.out.println(urip);
		System.out.println(type);
		System.out.println(name);
		System.out.println(size);
		System.out.println(fileName);
		
		//-------------
		InputStream in = part.getInputStream();
		byte[] buf = in.readAllBytes();
		//---------------------
		
		if (part.getSize() > 0) {
			part.write("brad1.jpg");
			System.out.println("Upload Success");
		}else {
			System.out.println("Upload failure");
		}
	
	}

}
