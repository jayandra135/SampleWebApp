package tn_junit;

public class Calculator {
	public Calculator() {}
	
	public int fact(int a)
	{
		int f=1;
		for(int i=1;i<=a;i++)
			f=f*i;
		return f;
	}
	public static void main(String[] args) {
		int a=5;
		Calculator cc=new Calculator();
		System.out.println(cc.fact(a));
	}

}