package tw.brad.servlets;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Brad08")
public class Brad08 extends HttpServlet {
	private int i;
    public Brad08() {
    	System.out.println("Brad08()");
    }
	@Override
	public void init() throws ServletException {
		System.out.println("init()");
		super.init();
		
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init(config)");
		super.init(config);
	}
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service(brad):" + request.getMethod());
		super.service(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet:" + i++);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
	}

}
