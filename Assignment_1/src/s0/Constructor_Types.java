package s0;

public class Constructor_Types {
	
	public Constructor_Types()
	{
		System.out.println("Default Constructor");
	}
	
	public Constructor_Types(int a)
	{
		System.out.println("One Parameterized Constructor");
		System.out.println(a);
	}
	
	public Constructor_Types(int a,int b)
	{
		System.out.println("Two Parameterized Constructor");
		System.out.println(a);
		System.out.println(b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor_Types ct1=new Constructor_Types();
		Constructor_Types ct2=new Constructor_Types(10);
		Constructor_Types ct3=new Constructor_Types(10,20);
		
		
		

	}

}
