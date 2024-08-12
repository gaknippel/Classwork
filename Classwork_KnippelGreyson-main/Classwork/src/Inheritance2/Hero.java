package Inheritance2;

public class Hero extends Human 
{	
	public Hero(String name)
	{
		super(name);
	}
	
	public int getRunSpeed()
	{
		int rs = super.getRunSpeed();
		return 10* rs;
	}
	
	public void run()
	{
		
		System.out.println("running at a speed of " + this.getRunSpeed());
	}
}
