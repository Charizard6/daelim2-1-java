package gimal;

public class HwalYongString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = new String(" c#");
		String b = new String(",c++ ");
		
		System.out.println(a + "의 길이는"+ a.length());
		System.out.println(a.contains("#"));
		
		a = a.concat(b); //a b 연결
		System.out.println(a);
		
		a = a.trim();
		System.out.println(a);
		
		a = a.replace("c#","java");
		System.out.println(a);
		
		String s[] = a.split(",");
		for(int i =0;i<s.length;i++) {
			System.out.println("분리된 문자열"+i+" : " + s[i]);
		}
		
		a=a.substring(5);
		System.out.println(a);
		
		char c = a.charAt(2);
		System.out.println(c);
		
	}

}