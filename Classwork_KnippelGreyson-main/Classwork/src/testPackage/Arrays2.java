package testPackage;

public class Arrays2
{
	public static void main (String[] args)
	{
		String [] array = new String [10];
		array[0] = "Frank";
		array[1] = "Donald";
		array[2] = "Eric";
		array[3] = "Tom";
		array[4] = "Seb";
		array[5] = "Donovan";
		array[6] = "Jason";
		array[7] = "Jordie";
		array[8] = "Francis";
		array[9] = "Johnny";
		
		printNames(array);
		printNamesInReverse(array);
		printShortNames(array);
		printENames(array);

	}
	
	public static void printNames (String[] arr)
	{
		System.out.println("Printing all names ==>");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println("\t" + arr[i]);
		}
	}
	public static void printNamesInReverse (String[] arr)
	{
		System.out.println("\n\nPrinting all reverse ==>");
		for(int i = arr.length - 1; i >= 0; i--)
		{
			System.out.println("\t" + arr[i]);
		}
	}
	
	public static void printShortNames (String[] arr)
	{
		System.out.println("Printing all short names ==>");
		for(int i = 0; i < arr.length; i++)
		{
			if (arr[i].length() < 5)
			{
				System.out.println("\t" + arr[i]);
			}
		}
	}
	
	public static void printENames (String[] arr)
	{
		System.out.println("Printing all names with an e ==>");
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i].toUpperCase().indexOf("E") > -1)
			{
				System.out.println("\t" + arr[i]);
			}
		}
	}

	
	// printShortNames : < 5 in length
	// printENames : if the name has an e
	
}
