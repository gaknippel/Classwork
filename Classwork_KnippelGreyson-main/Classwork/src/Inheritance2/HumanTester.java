package Inheritance2;

public class HumanTester 
{
	public static void main(String []args)
	{
		Human h1 = new Human("greyson");
		System.out.println(h1.getName());
		//System.out.println(h1.getRunSpeed());
		h1.run();
		
		Hero hero1 = new Hero ("hero greyson");
		System.out.println(hero1.getName());
		System.out.println(hero1.getRunSpeed());

		hero1.run();		
		
	}
}
