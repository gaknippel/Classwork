package testPackage;

import java.util.Scanner;

public class MyFirstScanner 
{
	public static void main(String[] args)
	{
		Scanner con = new Scanner(System.in);
		
		System.out.print("Type a number ==> ");
		String text = con.nextLine();
		
		int num = Integer.parseInt(text);
		
		int result = sumTotal(num);
		
		System.out.println("sum of 1 to " + num + " is " + result);
		
	}
	
	// method that adds all values from 1 to n
	// and returns the result
	public static int sumTotal(int n)
	{
		int sum = 0;
		for(int i = 1; i <= n; i++)
			sum = sum  + i;
		
		return sum;
		
	}
	
	
}
