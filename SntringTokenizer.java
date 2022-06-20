package gimal;
import java.util.StringTokenizer;

public class SntringTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String query = "name=yyh&addr=seoul&age=23";
		StringTokenizer st = new StringTokenizer(query,"&=");
		
		int n = st.countTokens();
		System.out.println("토큰 개수"+ n);
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
