package Recursion;

public class Example1 
{
	public static void main (String[] args)
	{
		printNum(9);
	}
	
	
	public static void printNum(int n)
	{
		System.out.println(n);
		printNum(n + 1);
	}
}
