package s0;

/* (((((10+2)+2)-2)*2)/2) */

public class Arithmetic_1 {
	
	int a;
	int b;
	
	public int sum(int c,int d)
	{
		int e;
		e=c+d;
		return e;
	}
	
	public int sub(int h, int i)
	{
		int j;
		j=h-i;
		return j;
	}
	
	public int mul(int m, int n)
	{
		int o;
		o=m*n;
		return o;
	}
	
	public void div(int p, int q)
	{
		int r;
		r=p/q;
		System.out.println("The final result is "+r);
	}
	
	public static void main(String[] args) {
		
		Arithmetic_1 a1=new Arithmetic_1();
		a1.a=10;
		a1.b=2;
		int f=a1.sum(a1.a,a1.b);
		int g=a1.sum(f, a1.b);
		int k=a1.sub(g,a1.b);
		int l=a1.mul(k,a1.b);
		a1.div(l,a1.b);
		//System.out.println(l);
		
		
	}

}
