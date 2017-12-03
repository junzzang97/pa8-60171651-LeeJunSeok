//60171651 이준석

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
		//여기까지 PA8안내 PDF파일에 있는 코드와 동일하다.
		
		Shape[] shapes2 = new Shape[2];
		shapes2[0] = new Square(10, 10, 20);
		shapes2[1] = new Triangle(30, 40, 30, 60);
		
		for(Shape s : shapes2) {
			System.out.printf("Area: %.1f\n", s.getArea());
			System.out.printf("Length: %.1f\n",  s.getLength());
			s.draw();
		}
		//여기까지의 코드는, 이번 과제에서 새로만든 클래스인, Square와 Triangle을 테스트하기 위해 만든 코드이다.
		//두 클래스의 객체를 만들고, Area,length를 출력하고 draw()메소드까지 호출했다.
		
		Shape circle = new Circle(100, 100, 20);
		circle.draw();
		for(int i = 0; i < 10; i++) {
			circle.move(10, 10);
			circle.draw();
		}
		//이 코드는 PA8안내 PDF에 제시된 내용이므로,
		//지시대로 (100, 100, 20)으로 Circle를 생성한 후 
		//10회 동안 x축으로 +10, y축으로 +10하며 계속 draw하였다.
	}
	
}
