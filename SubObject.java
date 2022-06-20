package gimal;

class SuperObject{
	protected String name;
	public void paint() {
		draw();
	}
	public void draw() {
		System.out.println(name);
	}
}
public class SubObject extends SuperObject{
	protected String name;
	public void draw() {
		name = "sub";
		super.name="super"; //super.슈퍼클래스의 멤버 자신의 상위클래스에 접근
		super.draw();
		System.out.println(name);
	}
	public static void main(String[] args) {
		SuperObject b = new SubObject(); //동적바인딩
		b.paint();
	}
}
