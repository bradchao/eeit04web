package tw.brad.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

@WebServlet("/Brad20")
public class Brad20 extends HttpServlet {
	private static Connection conn = null;
    public Brad20() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "root");
			conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/brad", prop);
		}catch(Exception e) {
			System.out.println(e);
		}    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		StringBuffer sb = new StringBuffer();
		sb.append("<h1>Brad Big Company</h1><hr />");
		sb.append("<table border='1' width='100%'>");
		sb.append("<tr><th>ID</th><th>Name</th><th>Photo</th></tr>");
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM gift LIMIT 10");
			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				String picurl = rs.getString("picurl");
				sb.append(
					String.format(
					"<tr><td>%s</td><td>%s</td><td><img src='%s' width='160px' height='120px'></td></tr>", id,name,picurl));
			}
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e);
		}
		sb.append("</table>");
		
		out.append(sb);
		response.flushBuffer();
	
	}

}
