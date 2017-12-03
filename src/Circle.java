//60171651 ���ؼ�
public class Circle extends Shape {
	
	//CircleŬ������ ���� ǥ���� ���̹Ƿ�, ���� �߽��� ��ǥ��,�������� ����ִ� instance������ �ʿ��ϴ�.
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
		       //(���� �߽��� x,y��ǥ,����������)
		setArea(r*r*Math.PI);
		setLength(2*r*Math.PI);
		//���� ���̿� �ѷ��� ���� �� �ʿ��� �������� �ڹ��� MathŬ������ ����ߴ�.
		setCenterX(x);
		setCenterY(y);
		setRadius(r);
	}
	public void draw() {
		//CircleŬ������ draw�޼ҵ��
		//���� �߽��� ��ǥ�� �������� ���̸� ����Ѵ�.
		String center = String.format("center(%.1f, %.1f)-radius(%.1f)", 
				getCenterX(), getCenterY(), getRadius());
		System.out.println("Circle "+center);
	}
	
	public void move(double dx, double dy) {
		centerX = centerX + dx;
		centerY = centerY + dy;
	}
}
