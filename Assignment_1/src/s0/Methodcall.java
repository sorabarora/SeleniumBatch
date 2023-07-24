package s0;

public class Methodcall {
	
	int a,b,c,d,e;
	
	public void assignvalues(int f,int g,int h,int i,int j)
	{
		a=f;
		b=g;
		c=h;
		d=i;
		e=j;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methodcall mc1=new Methodcall();
		mc1.assignvalues(10,20,30,40,50);
		System.out.println(mc1.a);
		System.out.println(mc1.b);
		System.out.println(mc1.c);
		System.out.println(mc1.d);
		System.out.println(mc1.e);
		
		/* In Method call 6 calls for one object. */
		
		Methodcall mc2=new Methodcall();
		mc2.assignvalues(60,70,80,90,100);
		System.out.println(mc2.a);
		System.out.println(mc2.b);
		System.out.println(mc2.c);
		System.out.println(mc2.d);
		System.out.println(mc2.e);
		
		/* So, for 10 objects 60 calls are there. */

	}

}
