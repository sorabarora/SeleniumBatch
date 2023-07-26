package s0;

public class Constructor_Practice {
	
	public Constructor_Practice()
	{
		System.out.println("Default Constructor");
	}
	public Constructor_Practice(int a)
	{
		System.out.println("One Parameterized Constructor");
		System.out.println(a);
	}
	
	public Constructor_Practice(int a,int b)
	{
		System.out.println("Two Parameterized Constructor");
		System.out.println(a);
		System.out.println(b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_Practice cp1=new Constructor_Practice();
		Constructor_Practice cp2=new Constructor_Practice(10);
		Constructor_Practice cp3=new Constructor_Practice(20,30);
		
		

	}

}
