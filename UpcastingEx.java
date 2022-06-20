package gimal;
class Person{
	String name;
	String id;
	
	public Person(String name) {
		this.name = name;
	}
}
class Student extends Person{
	String grade;
	String department;
	
	public Student(String name) {
		super(name);
	}
}
public class UpcastingEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Person p;
		//Student s = new Student("이재명");
		//p = s; //업캐스팅발생
		//System.out.println(p.name);
		
		//다운캐스팅
		Person p = new Student("홍길돋ㅇ");
		Student s =(Student)p;
		System.out.println(s.name);
		s.grade="A";
	}
}
