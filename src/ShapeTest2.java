//60171651 ¿Ã¡ÿºÆ

public class ShapeTest2 {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[3];
		shapes[0] = new Rectangle(10, 20, 30, 40);
		shapes[1] = new Rectangle(30, 30, 10, 10);
		shapes[2] = new Circle(50, 20, 30);
		
		for(Shape s : shapes) {
			System.out.printf("Area: %.1f\n", s.getArea());
			System.out.printf("Length: %.1f\n",  s.getLength());
		}
		
		Drawable[] drawables = new Drawable[5];
		for(int i = 0; i < shapes.length; i++) {
			drawables[i] = shapes[i];
		}
		drawables[3] = new Text("Sample Text");
		drawables[4] = new Bear(100, 100, 20);
		for(Drawable d : drawables) {
			d.draw();
		}
		
		Shape[] shapes2 = new Shape[2];
		shapes2[0] = new Square(10, 10, 20);
		shapes2[1] = new Triangle(30, 40, 30, 60);
		
		for(Shape s : shapes2) {
			System.out.printf("Area: %.1f\n", s.getArea());
			System.out.printf("Length: %.1f\n",  s.getLength());
			s.draw();
		}
		
		Shape circle = new Circle(100, 100, 20);
		circle.draw();
		for(int i = 0; i < 10; i++) {
			circle.move(10, 10);
			circle.draw();
		}
		
	}
	
}
