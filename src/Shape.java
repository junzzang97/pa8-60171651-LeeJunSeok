//60171651 이준석

public abstract class Shape implements Drawable, Movable{

	//Shape클래스는 Rectangle과 Circle의 상위 클래스이므로, 두 클래스가 공통적으로 가지고있는 area와 length를
	//instance변수로 가지고 있다. length는 도형의 둘레를 의미한다.
	private double area;
	private double length;
	
	public double getArea() {
		return area;
	}
	public double getLength() {
		return length;
	}
	public void setArea(double a) {
		area = a;
	}
	public void setLength(double l) {
		length = l;
	}
	
	
	
}
