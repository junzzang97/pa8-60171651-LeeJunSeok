
public class Bear implements Drawable {
	
	ShapesForBear facePart = new ShapesForBear();
	
	public Bear(double x, double y, double radius) {
		Rectangle head = new Rectangle(x-radius, y-radius, radius*2, radius*2);
		Circle leftEar = new Circle(x-radius, y+radius, radius/2);
		Circle rightEar = new Circle(x+radius, y+radius, radius/2);
		facePart.getShapes().add(head);
		facePart.getShapes().add(leftEar);
		facePart.getShapes().add(rightEar);
	}
	
	public void draw() {
		System.out.println("Bear");
		for (Drawable d : facePart.getShapes()) {
			d.draw();
		}
	}
}
