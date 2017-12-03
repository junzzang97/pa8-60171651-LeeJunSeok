//60171651 ���ؼ�

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
		//������� PA8�ȳ� PDF���Ͽ� �ִ� �ڵ�� �����ϴ�.
		
		Shape[] shapes2 = new Shape[2];
		shapes2[0] = new Square(10, 10, 20);
		shapes2[1] = new Triangle(30, 40, 30, 60);
		
		for(Shape s : shapes2) {
			System.out.printf("Area: %.1f\n", s.getArea());
			System.out.printf("Length: %.1f\n",  s.getLength());
			s.draw();
		}
		//��������� �ڵ��, �̹� �������� ���θ��� Ŭ������, Square�� Triangle�� �׽�Ʈ�ϱ� ���� ���� �ڵ��̴�.
		//�� Ŭ������ ��ü�� �����, Area,length�� ����ϰ� draw()�޼ҵ���� ȣ���ߴ�.
		
		Shape circle = new Circle(100, 100, 20);
		circle.draw();
		for(int i = 0; i < 10; i++) {
			circle.move(10, 10);
			circle.draw();
		}
		//�� �ڵ�� PA8�ȳ� PDF�� ���õ� �����̹Ƿ�,
		//���ô�� (100, 100, 20)���� Circle�� ������ �� 
		//10ȸ ���� x������ +10, y������ +10�ϸ� ��� draw�Ͽ���.
	}
	
}
