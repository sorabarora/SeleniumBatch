package s0;

public class Constructorcall {
	
	int a,b,c,d,e;
	
	public Constructorcall(int f,int g,int h,int i,int j)
	{
		a=f;
		b=g;
		c=h;
		d=i;
		e=j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructorcall cc1=new Constructorcall(10,20,30,40,50);
		System.out.println(cc1.a);
		System.out.println(cc1.b);
		System.out.println(cc1.c);
		System.out.println(cc1.d);
		System.out.println(cc1.e);
		
		/* In Constructor call 5 calls for one object. */
		
		Constructorcall cc2=new Constructorcall(10,20,30,40,50);
		System.out.println(cc2.a);
		System.out.println(cc2.b);
		System.out.println(cc2.c);
		System.out.println(cc2.d);
		System.out.println(cc2.e);
		
		/* So, for 10 objects 50 calls are there. So, constructor is reduces the calls. */

	}

}
