//60171651 이준석

public class Rectangle extends Shape {

	//Rectangle클래스는 Circle클래스와 다르게 직사각형을 의미하는 클래스이므로
	//area와 length말고, 직사각형의 하나의 꼭지점의 x,y좌표와, 가로, 세로의 길이를 담는 instance변수가 있다.
	private double vertaxX;
	private double vertaxY;
	private double width;
	private double heigth;
	private String className;
	
	public void setVertaxX(double x) {
		vertaxX = x;
	}
	public void setVertaxY(double y) {
		vertaxY = y;
	}
	public void setWidth(double w) {
		width = w;
	}
	public void setHeigth(double h) {
		heigth = h;
	}
	public double getVertaxX() {
		return vertaxX;
	}
	public double getVertaxY() {
		return vertaxY;
	}
	public double getWidth() {
		return width;
	}
	public double getHeigth() {
		return heigth;
	}
	public void setClassName(String n) {
		className = n;
	}
	public String getClassName() {
		return className;
	}
	
	public Rectangle(double x, double y, double width, double height) {
		            //(직사각형 왼쪽아래 꼭지점의 x,y좌표, 가로, 세로 길이)
		setArea( width * height );
		setLength( width*2 + height*2 );
		setVertaxX(x);
		setVertaxY(y);
		setWidth(width);
		setHeigth(height);
		className = Rectangle.class.getSimpleName();
	}
	
	public void draw() {
		//Rectangle클래스의 draw메소드는 
		//직사각형의 왼쪽아래 좌표와, 오른쪽위 좌표를 출력한다.
		String coor = String.format("(%.1f, %.1f)-(%.1f, %.1f)", 
				getVertaxX(), getVertaxY(), 
				getVertaxX() + getWidth(), getVertaxY() + getHeigth());
		System.out.println(className + " " +coor);
	}
	
	public void move(double dx, double dy) {
		vertaxX = vertaxX + dx;
		vertaxY = vertaxY + dy;
	}
	
	
	
	
}
