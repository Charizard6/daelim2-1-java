package gimal;
class A{
	public A() {
		System.out.println("생성자a");
	}
	public A(int x) {
		System.out.println("매개변수생성자a");
	}
}
class B extends A{
	public B() {
		System.out.println("생성자b");
	}
	public B(int x) {
		System.out.println("매개변수생성자b");
	}
}
class C extends B{
	public C() {
		System.out.println("생성자c");
	}
	public C(int x) {
		System.out.println("매개변수생성자c");
	}
}
public class ConstructorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c;
		c = new C(5);
	}

}
