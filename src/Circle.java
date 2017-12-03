//60171651 이준석
public class Circle extends Shape {
	
	//Circle클래스는 원을 표현한 것이므로, 원의 중심의 좌표와,반지름을 담고있는 instance변수가 필요하다.
	private double centerX;
	private double centerY;
	private double radius;
	
	public void setCenterX(double x) {
		centerX = x;
	}
	public void setCenterY(double y) {
		centerY = y;
	}
	public void setRadius(double r) {
		radius = r;
	}
	public double getCenterX() {
		return centerX;
	}
	public double getCenterY() {
		return centerY;
	}
	public double getRadius() {
		return radius;
	}
	
	public Circle(double x, double y, double r) {
		       //(원의 중심의 x,y좌표,반지름길이)
		setArea(r*r*Math.PI);
		setLength(2*r*Math.PI);
		//원의 넓이와 둘레를 구할 때 필요한 원주율은 자바의 Math클래스를 사용했다.
		setCenterX(x);
		setCenterY(y);
		setRadius(r);
	}
	public void draw() {
		//Circle클래스의 draw메소드는
		//원의 중심의 좌표와 반지름의 길이를 출력한다.
		String center = String.format("center(%.1f, %.1f)-radius(%.1f)", 
				getCenterX(), getCenterY(), getRadius());
		System.out.println("Circle "+center);
	}
	
	public void move(double dx, double dy) {
		centerX = centerX + dx;
		centerY = centerY + dy;
	}
}
