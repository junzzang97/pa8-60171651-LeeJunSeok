//60171651 ���ؼ�

public class Rectangle extends Shape {

	//RectangleŬ������ CircleŬ������ �ٸ��� ���簢���� �ǹ��ϴ� Ŭ�����̹Ƿ�
	//area�� length����, ���簢���� �ϳ��� �������� x,y��ǥ��, ����, ������ ���̸� ��� instance������ �ִ�.
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
		            //(���簢�� ���ʾƷ� �������� x,y��ǥ, ����, ���� ����)
		setArea( width * height );
		setLength( width*2 + height*2 );
		setVertaxX(x);
		setVertaxY(y);
		setWidth(width);
		setHeigth(height);
		className = Rectangle.class.getSimpleName();
	}
	
	public void draw() {
		//RectangleŬ������ draw�޼ҵ�� 
		//���簢���� ���ʾƷ� ��ǥ��, �������� ��ǥ�� ����Ѵ�.
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
