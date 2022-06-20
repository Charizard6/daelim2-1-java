package gimal;

class Shape{
	public void draw() {
		System.out.println("shape");
	}
}
class Line extends Shape{
	public void draw() { //method 오버라이딩
		System.out.println("line");
	}
}
class Rect extends Shape{
	public void draw() {
		System.out.println("rect");
	}
}
public class MethodOveridingEX {
	static void paint(Shape p) {
		p.draw();
	}
	public static void main(String[] args) {
		Line line = new Line();
		paint(line);
		
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
	}

}
