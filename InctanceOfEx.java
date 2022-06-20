package gimal;
class person1{}	
class student1 extends person1{}
class researcher extends person1{}
class professor extends researcher{}
public class InctanceOfEx {
	static void print(person1 p) {
		if(p instanceof person1)
			System.out.println("person");
		if(p instanceof student1)
			System.out.println("student");
		if(p instanceof researcher)
			System.out.println("researcher");
		if(p instanceof professor)
			System.out.println("professor");
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("new student() =>"); print(new student1());
		System.out.print("new researcher() =>"); print(new researcher());
		System.out.println("new professor() =>"); print(new professor());
	}

}