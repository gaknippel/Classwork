package testPackage;

import java.util.Scanner;

public class ArrayTest 
{
	public static void main(String[] args)
	{
		isUnique(new int[] {1, 3, 3});
	}
	public static boolean isUnique (int [] arr1)
	{
	    int [] temp = arr1;
	    if (arr1.length <= 1)
	    {
	        return true;
	    }
	    for (int i = 0; i < temp.length; i++)
	    {
	        for(int b = 0; i < arr1.length; i++)
	        {
	           if (arr1[b] == temp[i])
	           {
	               System.out.println(arr1[b]);
	           }
	        }
	        
	    }
	    return true;
	}
}
