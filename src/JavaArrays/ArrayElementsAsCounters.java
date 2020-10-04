package JavaArrays;

import java.util.Random;

public class ArrayElementsAsCounters {

	public static void main (String args[]){
		 int a = 10;
		
		Random ra = new Random();
		
		int freq[] = new int[7];
		
		
		for( int roll =0;roll <=2000;roll++){
			
			++freq[1+ra.nextInt(6)];
			
		//	ra.nextInt(8)
		}
		
		System.out.println("Face \t Frequency");
		
		for(int face =1; face<freq.length;face++){
			
			System.out.println(face+"       " +freq[face]);
			
			
		}
		
	}
}
