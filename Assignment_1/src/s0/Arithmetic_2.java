package s0;

/* (((((10*2)-2)+2)-2)/2) */

public class Arithmetic_2 {
	
	int a;
	int b;
	
	public int mul(int c, int d)
	{
		int e=c*d;
		return e;
	}
	
	public int sub(int h,int i)
	{
		int j=h-i;
		return j;
	}
	
	public int sum(int l, int m)
	{
		int n=l+m;
		return n;
	}
	
	public void div(int p,int q)
	{
		System.out.println("The final result is "+p/q);
	}

	public static void main(String[] args) {
		
		Arithmetic_2 a2=new Arithmetic_2();
		a2.a=10;
		a2.b=2;
		int f=a2.mul(a2.a, a2.b);
		int g=a2.sub(f,a2.b);
		int k=a2.sum(g,a2.b);
		int o=a2.sub(k, a2.b);
		a2.div(o,a2.b);
		
		
		
		//System.out.println(f);
		
	}
}
