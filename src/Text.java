//60171651 이준석

public class Text implements Drawable{
	//Text클래스는 Drawable인터페이스를 구현한다.
	
	private String stringForDraw;
	
	public void setStringForDraw(String s) {
		stringForDraw = s;
	}
	
	public Text(String s) {
		setStringForDraw(s);
	}

	//Text클래스의 draw메소드는,
	//Text의 래퍼런스 객체를 만들 떄 parameter로 받은 String을 출력하는것이다.
	public void draw() {
		System.out.println(stringForDraw);
	}
}
