package gimal;
abstract class Calculator{
	public abstract int add(int a,int b);
	public abstract int subtract(int a, int b); //추상클래스,추상메소드
	public abstract double average(int[] a);
}
public class GoodCalc extends Calculator {
	public int add(int a,int b) { //추상클래스를 구현한 섭클은 추상 x
		return a+b;
	}
	public int subtract(int a,int b) {
		return a-b;
	}
	public double average(int[] a) {
		double sum =0;
		for(int i=0;i<a.length;i++) 
			sum+=a[i];
		return sum/a.length;
	}
	public static void main(String[] args) {
		GoodCalc c = new GoodCalc();
		System.out.println(c.add(2,3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.average(new int[] {2,3,4}));
	}

}
