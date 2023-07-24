package s0;

public class Student {
	
	int rollno;
	int age;
	
	public void display1()
	{
		System.out.println("Welcome to all of you");
	}
	
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
	
	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.rollno=815012135;
		s1.age=32;
		s1.display1();
		s1.display2();
		System.out.println("Roll No is "+s1.rollno);
		System.out.println("Age is "+s1.age);
		
	}
	
	
	

}
