package JavaBasics;

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String args[]) {

		int exam;

		System.out.println("pls enter the number of ");
		Scanner sc = new Scanner(System.in);
		exam = sc.nextInt();

		if (exam == 9) {
			System.out.println("yes ,you pass in the exam");
		} else {
			System.out.println("Sorry ur failed ");
		}
		sc.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}