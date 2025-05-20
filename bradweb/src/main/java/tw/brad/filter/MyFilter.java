package tw.brad.filter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import tw.brad.apis.BradUtils;

@WebFilter("/*")	// /login.jsp ... /member/*
public class MyFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		//Filter.super.init(filterConfig);
		System.out.println("init()");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			BradUtils.createConnection();
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		
	}

	@Override
	public void doFilter(ServletRequest request, 
						ServletResponse response, 
						FilterChain chain)
			throws IOException, ServletException {
		System.out.println("doFilter:start");
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		chain.doFilter(request, response);
		
		System.out.println("doFilter:end");
	}

	@Override
	public void destroy() {
		System.out.println("destroy()");
	}
	
	
}
