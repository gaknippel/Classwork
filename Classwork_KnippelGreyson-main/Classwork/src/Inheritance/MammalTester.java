package Inheritance;

public class MammalTester {

	public static void main(String[] args) 
	{
		//Mammal m = new Mammal();
		//m.breath();
		//m.walk();
		
		//Lion l = new Lion();
		//l.breath();
		//l.walk();
		Lion l = new Lion();
		Cat c = new Cat();
		doX(l);
		doY(c);
		LoopBreathing(c);
	}
	
	public static void doX(Mammal m)
	{
		m.breath();
		m.walk();
	}
	
	public static void doY(Mammal m)
	{
		m.beCute();
		m.isGoated(m);
	}
	
	public static void LoopBreathing (Mammal m)
	{
		m.loop();
	}

}
