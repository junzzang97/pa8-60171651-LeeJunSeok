//60171651 ���ؼ�

public class Text implements Drawable{
	//TextŬ������ Drawable�������̽��� �����Ѵ�.
	
	private String stringForDraw;
	
	public void setStringForDraw(String s) {
		stringForDraw = s;
	}
	
	public Text(String s) {
		setStringForDraw(s);
	}

	//TextŬ������ draw�޼ҵ��,
	//Text�� ���۷��� ��ü�� ���� �� parameter�� ���� String�� ����ϴ°��̴�.
	public void draw() {
		System.out.println(stringForDraw);
	}
}
