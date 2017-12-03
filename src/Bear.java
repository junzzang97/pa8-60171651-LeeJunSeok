//60171651 이준석

//Bear클래스는, 한개의 정사각형, 두개의 원을 통해 곰얼굴의 형상을 띄고있다.
//따라서 PA8요구사항대로, 저 세 개의 도형을 담을 리스트가 필요하다.
public class Bear implements Drawable {
	
	//리스트는 아래 객체래퍼런스를 사용했다.
	ShapesForBear facePart = new ShapesForBear();
	
	public Bear(double x, double y, double radius) {
		Rectangle head = new Rectangle(x-radius, y-radius, radius*2, radius*2);
		Circle leftEar = new Circle(x-radius, y+radius, radius/2);
		Circle rightEar = new Circle(x+radius, y+radius, radius/2);
		facePart.getShapes().add(head);
		facePart.getShapes().add(leftEar);
		facePart.getShapes().add(rightEar);
		//세개의 도형 객체를 만들어 준뒤 , 리스트에 추가해주었다.
	}
	
	//Bear클래스의 draw는, 각 도형 객체의 draw를 사용하면된다.
	public void draw() {
		System.out.println("Bear");
		for (Drawable d : facePart.getShapes()) {
			d.draw();
		}
	}
}
