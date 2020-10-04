package JavaArrays;

public class MultiDimensionalArrays {
	public static void main(String args[]) {
		// int abc[][] = new int [10][10];
	

		int a[] = { 4, 6, 2, 3,3 };
		int b[] = { 4, 6, 2, 3, 5, 7, 8, 9 ,0,};
		int[] c= { 2, 1, 7, 9, 0 };

		int firstArray[][] = { { 2, 1, 7, 9, 0 }, a, b };  //3
		int secondArray[][] = { a, b, a, b, a, b ,c};        //6


		int size = secondArray[1].length;
		System.out.println(size);

		System.out.println("This is the elements present inside the first array");
		printArray(firstArray);
		System.out.println("This is the elements present inside the second array");
		printArray(secondArray);

	}

	public static void printArray(int x[][]) {

		System.out.println("length of array " + x.length);//7

		for (int row = 0; row < x.length; row++) {

			for (int coloumn = 0; coloumn < x[row].length; coloumn++) {//5 times 

				System.out.print(x[row][coloumn] + "(" + row + "," + coloumn + ")" + "\t");

			}
			System.out.println();
		}

	}

}
