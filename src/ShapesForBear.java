//60171651 이준석

import java.util.ArrayList;

//이 클래스는 , Bear클래스를위해
//여러 개의 Drawable을 가지는 리스트를 가지고있는 클래스이다.
public class ShapesForBear {
	
	private ArrayList<Drawable> shapes = new ArrayList<Drawable>();

	public ArrayList<Drawable> getShapes() {
		return shapes;
	}
	public void setShapes(ArrayList<Drawable> shapes) {
		this.shapes = shapes;
	}
	
	
}
