package Loops;

import java.util.Scanner;

public class WhileLoop {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int sum = whileloop3();
		System.out.println("the total value u have entered is "+sum);
		// whileLoop1();

		// whileLoop2();

	}

	public static int whileloop3() { 
		int sum = 0;
		System.out.println(" enter the numbers");
		while (scanner.hasNextInt()) {
			int a = scanner.nextInt();
			sum += a;
			if (scanner.nextInt() == 1) {
				System.out.println(" you have reached to end ");
				break;
			}

		}
		return sum;
	}

	private static void whileLoop2() {
		while (!scanner.nextLine().equals("quit")) {
			System.out.println("Insert question code:");
			String question = scanner.nextLine();
			if (question.equals("quit"))
				break;

			System.out.println("Insert answer code:");
			String answer = scanner.nextLine();
			if (answer.equals("quit"))
				break;

		}
	}

	private static void whileLoop1() {
		while (true) {
			System.out.println("Insert question code:");
			String question = scanner.nextLine();
			if (question.equals("quite")) {
				break;
			}
			System.out.println("Insert answer code:");
			String answer = scanner.nextLine();
			if (answer.equals("quite")) {
				break;
			}
		}
	}
}