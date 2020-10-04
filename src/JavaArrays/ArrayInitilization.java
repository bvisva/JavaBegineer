package JavaArrays;

import java.util.Scanner;

public class ArrayInitilization {
	// static int a = 10;

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		// int v = a;

		System.out.println("enter the Array Index  value");

		 int arrayIndex = sc.nextInt();

		String prabhu[] = { "apples", "pineapple", "Grapes", "mango" };

		System.out.println(prabhu[arrayIndex]);
		System.out.println(prabhu[2]);

		System.out.println("give the second Input  ");
		System.out.println(prabhu[sc.nextInt()]);

	}

}
