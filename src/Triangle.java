
public class Triangle extends Shape{
	
	private double x;
	private double y;
	private double bottom;
	private double width;
	private String className;
	
	public Triangle(double x, double y, double bottom, double width ) {
		setArea(bottom * width / 2);
		double side = Math.sqrt((bottom/2)*(bottom/2) + width*width);
		setLength(side*2 + bottom);
		this.x = x;
		this.y = y;
		this.bottom = bottom;
		this.width = width;
		className = Triangle.class.getSimpleName();
	}
	
	public void draw() {
		String coor = String.format("(%.1f, %.1f)-(%.1f, %.1f)-(%.1f, %.1f)", 
				x, y, x-bottom/2, y-width, x+bottom/2, y-width);
		System.out.println(className + " " +coor);
	}
	
	public void move(double dx, double dy) {
		x = x + dx;
		y = y + dy;
	}
}
