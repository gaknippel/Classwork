package Inheritance;

public class VehicleTester 
{
	public static void main (String []args)
	{
		Car c = new Car("awesome");
		c.drive();
		c.honk();
		
		Vehicle v = new Vehicle("something");
		v.drive();
	}
}
