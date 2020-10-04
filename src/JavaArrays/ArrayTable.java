package JavaArrays;

public class ArrayTable {

	// static int aaaa =20;

	public static void main(String args[]) {
		
		int[] prabhu = { 10,77, 66, 2, 3, 5, 4, 6, 8, 8, 10, 47, 77,55, 66, 77, 34,33,44, 33, 66, 3838 };

		// Finding the total number of elements in array
		int length = prabhu.length;
		System.out.println("Array total value " + length);

		System.out.println();
		// Printing elements inside the array

		// if i want do some task again and again...(repeat)
	
		
		System.out.println("Index \t Value ");
		
		for (int counter = 0; counter < prabhu.length; counter++) {
			
			
			System.out.println(counter + "\t" + prabhu[counter]);

		}

	}
}
