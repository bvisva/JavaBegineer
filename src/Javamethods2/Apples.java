package Javamethods2;

import java.util.Scanner;

public class Apples {

	public static void main(String args[]){
		
		Fruits fr = new Fruits();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your fav fruit name ");
		String favfruit = sc.nextLine();
		fr.setName(favfruit);
		fr.sayingName();
		sc.close();
	}
}
