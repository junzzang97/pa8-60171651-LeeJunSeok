//60171651 ���ؼ�

public abstract class Shape implements Drawable, Movable{

	//ShapeŬ������ Rectangle�� Circle�� ���� Ŭ�����̹Ƿ�, �� Ŭ������ ���������� �������ִ� area�� length��
	//instance������ ������ �ִ�. length�� ������ �ѷ��� �ǹ��Ѵ�.
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
