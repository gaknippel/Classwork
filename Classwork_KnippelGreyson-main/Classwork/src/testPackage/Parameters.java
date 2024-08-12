package testPackage;

import java.util.Scanner;

public class Parameters
{

	 public static void main(String[] args)
	    {
	        Scanner con = new Scanner(System.in);
	        
	        System.out.println("low?");
	        
	        String inputAsAString1 = con.nextLine();
	        
	        int b = Integer.parseInt(inputAsAString1);
	        
	        
	        
	        Scanner con2 = new Scanner(System.in);
	        
	        System.out.println("high?");
	        
	        String inputAsAString2 = con2.nextLine();
	        
	        int n = Integer.parseInt(inputAsAString2);
	        
	        
	        
	        int sum = sumNum(b, n);
	        
	        System.out.print("sum = " + sum);
	    }
	    public static int sumNum(int b, int n)
	    {
	        int sum = 0;
	        for(int i = b; i <= n; i++)
	        {
	            sum = sum + i;
	        }
	        return sum;
	    }

}