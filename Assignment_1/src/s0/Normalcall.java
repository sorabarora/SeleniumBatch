package s0;

public class Normalcall {
	
	int a,b,c,d,e;
	
	public static void main(String[] args) {
		
		Normalcall nc1=new Normalcall();
		nc1.a=10;
		nc1.b=20;
		nc1.c=30;
		nc1.d=40;
		nc1.e=50;
		
		System.out.println(nc1.a);
		System.out.println(nc1.b);
		System.out.println(nc1.c);
		System.out.println(nc1.d);
		System.out.println(nc1.e);  
		
		/* In normal call 10 calls for one object. */
		
		Normalcall nc2=new Normalcall();
		nc2.a=60;
		nc2.b=70;
		nc2.c=80;
		nc2.d=90;
		nc2.e=100;
		
		System.out.println(nc2.a);
		System.out.println(nc2.b);
		System.out.println(nc2.c);
		System.out.println(nc2.d);
		System.out.println(nc2.e); 
		
		/* So, for 10 objects 100calls are there. */
		
		
		
		
		
		
	}

}
