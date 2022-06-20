package gimal;
interface PhoneInterface{
	final int Timeout = 10000;
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("전화");
	}
}
class Calc{
	public int calculate(int x, int y) {
		return x+y;
	}
}
class SmartPhone extends Calc implements PhoneInterface{
	public void receiveCall() {
		System.out.println("전화옴");
	}
	public void flash() {
		System.out.println("전화기 불켜짐");
	}
	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("알람");
	}
	public void schedule() {
		System.out.println("일정관리");
	}
}
public class InterfaceEx {
	public static void main(String[] args) {
		SmartPhone p = new SmartPhone();
		p.printLogo();
		p.sendCall();
		p.receiveCall();
		p.flash();
		System.out.println("3+5="+p.calculate(3,5));
		p.schedule();
	}

}
