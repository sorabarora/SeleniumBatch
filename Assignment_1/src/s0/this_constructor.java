package s0;

public class this_constructor {
	
	public this_constructor()
	{
		this(10,20,30);
		System.out.println("Default Constructor");
	}
	
	public this_constructor(int a)
	{
		this();
		System.out.println("One Parameterized Constructor");
	}
	
	public this_constructor(int a,int b)
	{
		this(10,20,30,40);
		System.out.println("Two Parameterized Constructor");
	}
	
	public this_constructor(int a, int b,int c)
	{
		System.out.println("Three Parameterized Constructor");
	}
	
	public this_constructor(int a,int b,int c,int d)
	{
		this(10);
		System.out.println("Four Parameterized Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		this_constructor tc1=new this_constructor(10,20);

	}

}
