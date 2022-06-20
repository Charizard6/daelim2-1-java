package gimal;
class SharedPrinter{
	synchronized void print(String text) { //synchronized를 빼고 실행해보자
		for(int i=0;i<text.length();i++)
			System.out.print(text.charAt(i));
		System.out.println();
	}
}
class WorkerThread extends Thread{
	private SharedPrinter p;
	private String [] text;
	public WorkerThread(SharedPrinter p, String[] text) {
		this.p =p; this.text=text;
	}
	public void run() {
		for (int i=0;i<text.length;i++)
			p.print(text[i]);
	}
}
public class SynchronizedEx {
	public static void main(String[] args) {
		SharedPrinter p = new SharedPrinter();
		String [] mcuText = {"야 변왕추","이 시발련아","계급장 떼고 붙자","따라나와 이 씹샛기야"};
		String [] korText = {"동해물과","백두산이","마르고 닳도록","하느님이 보우하사"};
		Thread t1 = new WorkerThread(p, mcuText);
		Thread t2 = new WorkerThread(p, korText);
		t2.start();
		t1.start();
	}
}
