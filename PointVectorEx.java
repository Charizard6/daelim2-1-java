package gimal;
import java.util.Vector;
class point{
	private int x,y;
	public point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "(" + x + ","+y+")";
	}
}
public class PointVectorEx {
	public static void main(String[] args) {
		Vector<point> v = new Vector<point>();
		 v.add(new point(2,3));
		 v.add(new point(-5,20));
		 v.add(new point(30,-8));
		 
		 v.remove(1);
		 for(int i = 0;i<v.size();i++) {
			 point p = v.get(i);
			 System.out.println(p);
		 }
	}
}
