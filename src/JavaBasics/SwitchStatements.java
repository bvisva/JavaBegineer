package JavaBasics;

import java.util.Scanner;

public class SwitchStatements {
	
	public static void main(String[] args) {
		 int age;
		
		System.out.println("pls enter your age  in multiples of 8 ");

		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();

		switch (age) {
		case 8:
			System.out.println("you can play in this age");
			break;
		case 16:
			System.out.println("you have to complete ur studies");
			break;

		case 24:
			System.out.println("it better to gett marriage with in your age ");
			break;
		case 32:
			System.out.println("you r in age of giving birth to children");
			break;
		case 40:
			System.out.println("it is a good age to earn and save money");
			break;
		case 48:
			System.out.println("it time for ur world tour");
			break;
		case 56:
			System.out.println("you r in a age to take rest");
			break;
		case 64:
			System.out.println("it time for your soul to rest in piece");
            break;
            
            default:
            	System.out.println("Pls enter multiples of 8 not more than 64");
            	sc.close();
		}
		
		
			
		}

	}

