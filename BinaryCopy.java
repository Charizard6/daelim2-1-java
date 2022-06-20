package gimal;
import java.io.*;
public class BinaryCopy {
	public static void main(String[] args) {
		File src = new File("c:\\D\\군복무.png");
		File desrt = new File("c:\\D\\군복무2.png");
		int c;
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(desrt);
			while((c=fi.read())!=-1) {
				fo.write((byte)c);
			}
			fi.close(); fo.close();
			System.out.println(src.getPath()+"를"+desrt.getPath()+"로 복사");
		}
		catch(IOException e) {
			System.out.println("파일 복사 오류");
		}
	}

}
