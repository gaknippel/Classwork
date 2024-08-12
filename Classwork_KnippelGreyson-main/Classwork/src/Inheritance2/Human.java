package Inheritance2;

public class Human 
{
	private String name;
	private int runspeed;
	
	public Human(String name)
	{
		this.name = name;
		this.runspeed = 5;
	}
	
	public String getName()
	{
		return this.name;
	}
	public int getRunSpeed()
	{
		return this.runspeed;
	}
	
	public void run()
	{
		System.out.println("running at a speed of " + this.runspeed);
	}

}
