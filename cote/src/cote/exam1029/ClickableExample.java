package cote.exam1029;

public class ClickableExample {

	public static void main(String[] args) {
		Clickable a = new Image("a.png");
		Clickable b = new Button("Ok");
		
		a.click();
		b.click();
		
		Drawable k = (Image) a;
		Drawable l = (Button) b;
		k.draw();
		l.draw();
		if(a instanceof Image) {
			Image i = (Image) a;
			System.out.println(i.url);
		}
		
		if(b instanceof Button) {
			Button j = (Button) b;
			System.out.println(j.label);
		}

	}

}
