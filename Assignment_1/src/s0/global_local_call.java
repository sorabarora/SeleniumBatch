package s0;

public class global_local_call {
	
	int a; //global variable
	
	public global_local_call()
	{
	    a=10;
	}
	
	public global_local_call(int c)
	{
		int b=c;
		System.out.println(b);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		global_local_call glc1=new global_local_call();
		System.out.println(glc1.a);
		global_local_call glc2=new global_local_call(20);
		
		
	}

}
