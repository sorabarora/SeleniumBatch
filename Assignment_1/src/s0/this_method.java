package s0;

public class this_method {
	
	public void default_method()
	{
		System.out.println("Default Method");
	}
	
	public void first_method(int a)
	{
		System.out.println("One Parameterized Method");
	}
	
	public void second_method(int a,int b)
	{
		this.third_method(10,20,30);
		this.default_method();
		this.first_method(10);
		this.Fourth_Method(10, 20, 30, 40);
		System.out.println("Two Parameterized Method");
	}
	
	public void third_method(int a,int b, int c)
	{
		System.out.println("Three Parameterized Method");
	}
	
	public void Fourth_Method(int a,int b,int c,int d)
	{
		System.out.println("Four Parameterized Method");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		this_method tm1=new this_method();
		tm1.second_method(10, 20);
		
		

	}

}
