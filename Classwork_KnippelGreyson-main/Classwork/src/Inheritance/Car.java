package Inheritance;

public class Car extends Vehicle 
{
	private String make;

	public Car(String make)
	{
		super(make);
		this.make = make;
	}
	
	public void honk()
	{
		System.out.println("beep beep");
	}

}
