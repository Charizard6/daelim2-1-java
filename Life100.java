package gimal;
import java.util.*;
public class Life100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] charArray;
		Scanner sc = new Scanner(System.in);
		System.out.println("단어 입력 end는 종료");
		
		while(true) {
			String word =sc.next();
			if(word.toUpperCase().equals("end")) {
				System.out.println("프로그램 종료");
				break;
			}
			int nsum = 0;
			charArray = word.toCharArray();
			for(int i=0;i<charArray.length;i++) {
				Integer j = Integer.valueOf(charArray[i])-96;
				nsum += j;
			}
			System.out.println(word+"의 값"+nsum+"입니다" );
		}
	}

}
