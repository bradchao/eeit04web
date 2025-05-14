package tw.brad.apis;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class BradUtils {
	public static String loadView(String view) throws Exception {
		String source = 
			"C:\\Users\\User\\git\\repository2\\bradweb\\src\\main\\webapp\\views\\%s.html";
		String sfile = String.format(source, view);
		File html = new File(sfile);
		BufferedInputStream bin = 
			new BufferedInputStream(new FileInputStream(html));
		byte[] buf = bin.readAllBytes();
		bin.close();
		
		return new String(buf);
	}
	
	public static String calc(String sx, String sy) {
		try {
			int x = Integer.parseInt(sx);
			int y = Integer.parseInt(sy);
			return x + y + "";
		}catch(Exception e) {
			return "";
		}
	}
	
	
	
}
