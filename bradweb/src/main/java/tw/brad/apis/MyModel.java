package tw.brad.apis;

public class MyModel {
	private int x, y;
	public MyModel(String x, String y) throws Exception {
		this.x = Integer.parseInt(x); 
		this.y = Integer.parseInt(y);
	}
	public String plus() {
		return x + y + "";
	}
}
