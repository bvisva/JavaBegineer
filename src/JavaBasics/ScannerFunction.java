package JavaBasics;

import java.util.Scanner;

//import java.util.Scanner;

public class ScannerFunction {
	
	 static String myoldName;

	public static void main(String args[]) {
		//String myoldName;
		
		String mmynewName;
	//	int age;
		System.out.println("enter your old name  ");
		Scanner sc = new Scanner(System.in);
		myoldName = sc.nextLine();
	
		System.out.println("Enter  new Name");
		mmynewName = sc.nextLine();
		System.out.println("My name old is " + myoldName);
		System.out.println("My New name is " + mmynewName);
		
        sc.close();
	}

}
/*Declaration

Following is the declaration for java.util.Scanner.nextLine() method
public String nextLine()*/
