package JavaSimplePrograms;

import java.util.Random;

public class RandomNumber {

	public static void main(String args[]){
		int number ;
		Random rd = new Random();
		
		for (int i=0;i<1;i++){
		
			number =rd.nextInt(10);
			System.out.println(number);
			
		}
		
	}
}
