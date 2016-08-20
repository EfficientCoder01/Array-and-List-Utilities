package parrayandlistutilities;
import java.io.*;
import java.util.*;

public class ArrayAndListUtilitiesApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {6, 60, 70, 5, 52, 11, 12, 8, 19, 20};
		System.out.println(ArrayAndListUtilities.findIt(nums, 20));
		System.out.println(ArrayAndListUtilities.findIt(nums, 5));
		//Returns the first found number '5' in the array
		System.out.println(ArrayAndListUtilities.findIt(nums, 100));
		
		int[] numbers = new int[1000];
		File f = new File("rand.txt");
		
		try {
			Scanner scanner = new Scanner(f);
			while(scanner.hasNextLine())
			{
				for(int i= 0; i < numbers.length; i ++)
			
				{
				String line = scanner.nextLine();
				numbers[i] = Integer.parseInt(line);
				//System.out.println(numbers[i]);
				}
			}
			scanner.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(ArrayAndListUtilities.findMax(numbers));
		System.out.println(ArrayAndListUtilities.findMin(numbers));
		System.out.println(ArrayAndListUtilities.findIt(numbers, 150));
		

}
}
