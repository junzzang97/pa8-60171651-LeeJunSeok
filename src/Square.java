//60171651 이준석

//Square클래스, 즉 정사각형은 직사각형 이므로(isa테스트) Rectangle클래스를 상속받았다.
public class Square extends Rectangle{
	public Square(double x, double y, double width) {
		super(x, y, width, width);
		setClassName(Square.class.getSimpleName());
	}
	//따라서 따로 다론 메소드정의없이, 생성자만 정의해주었다.
	
	
}
