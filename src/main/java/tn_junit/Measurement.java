package tn_junit;

public class Measurement {
	private int val;
	public Measurement(int m)
	{
		val=m;
		
	}
	public int getValue()
	{
		return val;
	}
	public void add(Measurement m)
	{
		val=val+m.getValue();
	}
	
	public void sub(Measurement m)
	{
		val=val-m.getValue();
	}
	
}
