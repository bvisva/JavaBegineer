package JavaArrays;

public class ArrayElementsAddition {

	public static void main(String args[]) {

		int[] prabhu = { 4, 8, 5, 2, 8, 6, 1, 0,88,99, 23, 34, 45, 77,4,5,666 };

	
		int sum = 0  ;
		
		
		 int size = prabhu.length;
		System.out.println(" total no of elements " +" "+ size);
	
		
		for (int counter = 0; counter < size; counter++) {
						
			sum +=  prabhu[counter];//4+8+5
			     
			// System.out.println(sum);

		}

		System.out.println(sum);

	}

}
