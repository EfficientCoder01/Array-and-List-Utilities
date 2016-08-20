package parrayandlistutilities;
import java.util.*;

public class ArrayAndListUtilities {

	
	
	public static int findMax(int[] numbers)
	{
		int smallest = numbers[0];
        int largest = numbers[0];
        
		for(int num : numbers)
		{
			 if(num > largest)
                 largest = num;
         else if (num < smallest)
                 smallest = num;	
		}
		return largest;
	}
	
	public static int findMax(ArrayList<Integer>numbers)
	{
		int smallest = numbers.get(0);
        int largest = numbers.get(0);
        
		for(int num : numbers)
		{
			 if(num > largest)
                 largest = num;
         else if (num < smallest)
                 smallest = num;	
		}
		return largest;
	}
	
	public static int findMin(int[] numbers)
	{
		int smallest = numbers[0];
        int largest = numbers[0];
        
		for(int num : numbers)
		{
			 if(num > largest)
                 largest = num;
         else if (num < smallest)
                 smallest = num;	
		}
		return smallest;
	}
	
	public static int findMin(ArrayList<Integer>numbers) 
	{
		int smallest = numbers.get(0);
        int largest = numbers.get(0);
        
		for(int num : numbers)
		{
			 if(num > largest)
                 largest = num;
         else if (num < smallest)
                 smallest = num;	
		}
		return smallest;
	}
	
	public static String findIt(int[] numbers, int wanted)
	{
		int count = 0;
		for(int num : numbers)
		{
			if(wanted == num)
			{
				return ("Found at index, " + count);
			}
			count++;
		}
		return "We couldn't find that number";
	}	
	
	
	
	public static String findIt(ArrayList<Integer>numbers, int wanted)
	{
		int count = 0;
		for(int num : numbers)
		{
			if(wanted == num)
			{
				return ("Found at index, " + count);
			}
			count++;
		}
		return "We couldn't find that number";
	}
	
	public static void bubbleV1(int[] numbers)
	{
		for(int i = 0; i < numbers.length - 1; i++)
		{
			for(int j = 0; j <numbers.length - 1; j++)
			{
				if(numbers[j] > numbers[j+1])
				{
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}
	}
	
	public static void bubbleV2(int[] numbers)
	{
		int var = 1;
		for(int i = 0; i < numbers.length - 1; i++)
		{
			for(int j = 0; j <numbers.length - var; j++)
			{
				if(numbers[j] > numbers[j+1])
				{
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
			var ++;
		}
	}
	
	public static void bubbleV3(int[] numbers)
	{
		boolean sorted = false;
		while(!sorted)
		{
			sorted = true;
			for(int i = 0; i < numbers.length -1; i++)
			{
				if(numbers[i] > numbers[i+1])
				{
					int temp = numbers[i];
					numbers[i] = numbers[i+1];
					numbers[i+1] = temp;
					sorted = false;
				}
			}
		}
	}
	
	public static void selectionSort(int[] numbers)
	{
		for(int i = 0; i < numbers.length - 1; i++)
		{
			int smallestPos = i;
			for(int j = i; j < numbers.length - 1; j++)
			{
				if (numbers[j+1] < numbers[smallestPos])
				{
					smallestPos = j + 1;
				}
			}
			if(smallestPos != i)
			{
				int temp = numbers[smallestPos]; 
	            numbers[smallestPos] = numbers[i];
	            numbers[i] = temp;
			}
		}
	}
	
	    public static int[] insertionSort(int[] input){
	        for (int i = 1; i < input.length; i++) 
	        {
	            for(int j = i ; j > 0 ; j--)
	            {
	                if(input[j] < input[j-1])
	                {
	                    int temp = input[j];
	                    input[j] = input[j-1];
	                    input[j-1] = temp;
	                }
	            }
	        }
	        return input;
	    }
	}

