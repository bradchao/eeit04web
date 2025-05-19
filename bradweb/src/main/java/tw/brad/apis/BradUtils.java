package tw.brad.apis;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import org.json.JSONArray;
import org.json.JSONObject;

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
	
	public static String calc(String sx, String sy, String op) {
		try {
			int x = Integer.parseInt(sx);
			int y = Integer.parseInt(sy);
			StringBuffer sb = new StringBuffer();
			switch(op) {
				case "1": sb.append(x + y); break;
				case "2": sb.append(x - y); break;
				case "3": sb.append(x * y); break;
				case "4": sb.append(x / y).append(" ... ").append(x % y) ; 
							break;
			}
			return sb.toString();
		}catch(Exception e) {
			return "";
		}
	}
	
	public static String createScore() {
		return (int)(Math.random()*101) + "";
	}
	
	public static SortedMap[] parseFood(String json) {
		JSONArray root = new JSONArray(json);
		
		TreeMap<String, String>[] foods = new TreeMap[root.length()];
		
		for (int i=0; i<root.length(); i++) {
			JSONObject food = root.getJSONObject(i);
			
			TreeMap<String, String> map = new TreeMap<>();
			map.put("name", food.getString("Name"));
			map.put("tel", food.getString("Tel"));
			map.put("city", food.getString("City"));
			map.put("town", food.getString("Town"));
			map.put("addr", food.getString("Address"));
			
			foods[i] = map;
		}
		
		return foods;
	}

	public static List<Map<String,String>> parseFoodV2(String json) {
		JSONArray root = new JSONArray(json);
		
		List<Map<String,String>> foods = new LinkedList<>();
		
		for (int i=0; i<root.length(); i++) {
			JSONObject food = root.getJSONObject(i);
			
			TreeMap<String, String> map = new TreeMap<>();
			map.put("name", food.getString("Name"));
			map.put("tel", food.getString("Tel"));
			map.put("city", food.getString("City"));
			map.put("town", food.getString("Town"));
			map.put("addr", food.getString("Address"));
			
			foods.add(map);
		}
		
		return foods;
	}
	
	public static String order2JSON(SortedMap[] rows) {
		JSONObject root = new JSONObject();
		if (rows.length > 0) {
			root.put("customer",
				String.format("%s (%s)", rows[0].getOrDefault("ContactName", ""),
						rows[0].getOrDefault("CompanyName", ""))
			);
			
			root.put("employee",
				String.format("%s %s", rows[0].getOrDefault("FirstName", ""),
						rows[0].getOrDefault("LastName", ""))
			);
			
			JSONArray details = new JSONArray();
			for (SortedMap<String, String> row : rows) {
				JSONObject obj = new JSONObject();
				
				obj.put("pid", row.getOrDefault("ProductID", ""));
				obj.put("price", row.getOrDefault("UnitPrice", ""));
				obj.put("qty", row.getOrDefault("Quantity", ""));
				obj.put("pname", row.getOrDefault("ProductName", ""));
				
				double temp1 = Double.parseDouble(obj.get("price").toString());
				int temp2 = Integer.parseInt(obj.get("qty").toString());
				//System.out.println(temp1*temp2);
				
				obj.put("total", temp1*temp2);
				
				
				details.put(obj);
			}
			
			root.put("details", details);
			
		}
		
		return root.toString();
	}
	
	
	
	
	
}
