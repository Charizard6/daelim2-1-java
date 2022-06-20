package gimal;

public class WrapperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Character.toLowerCase('A')); //A를 소문자로 변환
		char c1='4',c2='F';
		if(Character.isDigit(c1)) //숫자면 true
			System.out.println(c1 + "는 숫자");
		if(Character.isAlphabetic(c2)) //영문자면 true
			System.out.println(c2 + "는 영문자");
		
		System.out.println(Integer.parseInt("28")); //문자열을 10진수로
		System.out.println(Integer.toString(28)); //정수를 문자열로
		System.out.println(Integer.toBinaryString(28)); //2진수 문자열로
		System.out.println(Integer.bitCount(28)); //28에 대한 2진수의 1의 개수
		Integer i = Integer.valueOf(28);
		System.out.println(i.doubleValue()); //정수를 double값으로 변환 28
		
		Double d = Double.valueOf(3.14);
		System.out.println(d.toString()); //double을 문자열로
		System.out.println(Double.parseDouble("3.14")); //문자열을 실수로
		
		boolean b =(4>3);
		System.out.println(Boolean.toString(b)); //불린값을 문자열로
		System.out.println(Boolean.parseBoolean("false")); //문자열을 불린으로
		
		String a = "Hello";
		String bb = new String("Hello");
		if(a.equals(bb))
			System.out.println("same");
		else
			System.out.println("no");
	}

}
