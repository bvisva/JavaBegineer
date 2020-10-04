package Javamethods;

import java.util.Scanner;

public class Avengers {
	public static void main(String args[]) {
		
		
		// creating obj  for  Sccanner
		
		
		Scanner sc = new Scanner(System.in);
		
		
		CaptianAmerica cap = new CaptianAmerica();

		System.out.println(" captian r u ready  for war ");
		System.out.println("name the material that used to made ur shield");
		String weponName = sc.nextLine();
		//cap.protectionSheild(weponName);
		
		
		cap.protectionSheild(weponName);
		
		//Scanner sc = new Scanner(System.in);
		sc.close();

	}
}
