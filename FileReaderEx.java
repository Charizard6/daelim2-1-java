package gimal;
import java.io.*;
public class FileReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader in = null;
		try {
			in = new FileReader("c:\\D\\system.ini");
			int c;
			while((c=in.read())!=-1) {
				System.out.print((char)c);
			}
		in.close();
		}
		catch(IOException e) {
			System.out.println("입출력 ㅇ류");
		}
		InputStreamReader ni = new InputStreamReader(System.in);
		FileWriter fout = null;
		int d;
		try {
			fout = new FileWriter("c:\\D\\system.ini");
			while((d=ni.read())!=-1) {
				fout.write(d);
			}
			in.close();
			fout.close();
		}
		catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
