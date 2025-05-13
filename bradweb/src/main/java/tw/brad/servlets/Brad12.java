package tw.brad.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

@WebServlet("/Brad12")
public class Brad12 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String source = "C:\\Users\\User\\git\\repository2\\bradweb\\src\\main\\webapp\\upload\\brad.jpg";

		BufferedImage img = ImageIO.read(new File(source));
		Graphics2D g2d = img.createGraphics();
		
		Font font = new Font(null, Font.BOLD, 72);
		
		AffineTransform tran = new AffineTransform();
		tran.rotate(Math.toRadians(-10));
		Font font2 = font.deriveFont(tran);
		
		g2d.setColor(Color.YELLOW);
		g2d.setFont(font2);
		g2d.drawString("Hello, 資策會", 100, 300);
		
	
		//---------------------------
		response.setContentType("image/jpeg");
		ImageIO.write(img, "JPEG", response.getOutputStream());
		response.flushBuffer();	
	
		//---------------------------
		String target = "C:\\Users\\User\\git\\repository2\\bradweb\\src\\main\\webapp\\upload\\sd.jpg";
		ImageIO.write(img, "JPEG", new File(target));
		
		
		
		
	}

}
