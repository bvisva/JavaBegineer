package ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ExceptionDemo {
	static String name ;

	public static void main(String args[]) {
		System.out.println(" Starting");
	try {
		fileNotFoundException();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		System.out.println("Ending");

	}

	private static void arithematicExceptionDemo() {
		try {
			int a = 100 / 0;
		} catch (Exception e) {
			e.printStackTrace();
			
			// TODO Auto-generated catch block
			System.out.println("Exception Handled");
		}

	}

	private static void nullPointerExceptionDemo() {
		
		try {
			System.out.println(name.concat("Demo"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void stackOverfloException() {
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		while (true) {
			array.add(2);
		}

	}

	private static void numberFormatException() {
		try {
			String s = "data";
			int t = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println(" handled ");
		}
	}

	private static void fileNotFoundException() throws FileNotFoundException   {

		File file = new File("Users/prabhu/fsdfsdfd.txt");
		FileInputStream fis = new FileInputStream(file);

	}

	private static void classNOtFoundEException() throws ClassNotFoundException {
		Class.forName("fsdfsdlfj");

	}

	private static void arrayIndexoutofBoundException() {
		// TODO Auto-generated method stub
		int a[] = new int[4];
		System.out.println(a[5]);
	}

	private static void inputOutputException() {
		InputStreamReader isr = new InputStreamReader(null);
	}

	private static void IllegalStateException() {
		String s = "demo";

		Scanner sc = new Scanner(System.in);

		System.out.println(sc.nextLine());
		sc.close();
		System.out.println(sc.nextLine());

	}

	private static void OutofMemoryException() {
		long data[] = new long[1000000000];

	}

}
