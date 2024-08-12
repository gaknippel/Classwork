package testPackage;

public class Kitten 
{
	private int ears;
	private boolean cute;
	private String orange;
	
	
	
	public Kitten()
	{
		ears = 2;
		cute = true;
		orange = "Orange";
	}
	
	public String getColor()
	{
		return orange;
	
	}
	
	
	public void sayColor()
	{
		System.out.println(orange);
	}
	
	public void isCute()
	{
		System.out.println(cute);
	}
	
	public int getEars()
	{
		return ears;
	}
	
}
