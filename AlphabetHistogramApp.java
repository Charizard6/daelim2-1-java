package gimal;
import java.util.*;

public class AlphabetHistogramApp {
	private int histoData[]= new int [26];
	public AlphabetHistogramApp() {
		for(int i=0;i<histoData.length;i++)
			histoData[i]=0;
	}
	public void run() {
		String s = readString();
		makeHistogram(s);
		drawHistogram();
	}
	private void makeHistogram(String s) {
		s = s.toUpperCase();
		
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c >= 'A' && c <= 'Z') {
				int index = c -'A';
				histoData[index]++;
			}
		}
	}
	private void drawHistogram() {
		System.out.println("\n 히스토그램 그림");
		for(int i=0; i<histoData.length;i++) {
			System.out.println((char)('A'+i));
			System.out.println("("+histoData[i]+") \t");
			for(int j=0; j<histoData[i];j++)
				System.out.print('-');
			System.out.println();
		}
	}
	private String readString() {
		System.out.println("알파벳입력");
		System.out.println("입력이 종료되면 ; 입력");
		StringBuffer sb = new StringBuffer();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String line = scanner.nextLine();
			if(line.equals(";"))
				break;
			sb.append(line);
		}
		scanner.close();
		return sb.toString();
	}
	public static void main(String[] args) {
		AlphabetHistogramApp app = new AlphabetHistogramApp();
		app.run();
	}
}
