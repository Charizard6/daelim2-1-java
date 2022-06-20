package gimal;

public class StringLiteral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "hello"; //스트링 리터럴
		String b = "java";
		String c = "hello"; // 리터럴에 저장되면 공유하게 된다 a = c
		String d = new String("hello"); //객체로 만들면 공유하지 않음
		String e = new String("java");
		String f = new String("java");
		
		if(a == c)
			System.out.println("same");
		else
			System.out.println("not");
	}

}
