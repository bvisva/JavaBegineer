package JavaCollectionFrameworks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionReverseAndCopy {
	public static void main(String args[]){
		// create an array and convert to list
		
		Character [] ray = {'p','o','t','e'};
	List<Character> l2 = Arrays.asList(ray);
		
		
		System.out.println(" List is: ");
		output(l2);
		
		// reverse and print out the lit
		Collections.reverse(l2);
		
		System.out.println();
		System.out.println("After Reverse :");
		output(l2); 
		
		//create new array and a new list 
		Character[] newRay = new Character[4];
		List<Character> listcopy = Arrays.asList(newRay);
		
		
		
		// copy contents of list into listcopy
		System.out.println("Elements present inside ListCopy");
		Collections.copy(listcopy, l2);
		output(listcopy);
		
		
		// filling Collection with data
		
		
		Collections.fill(l2, 'x');
		System.out.println("Collection //aftetr filling with x");
		output(l2);
		

		
	
		
	}

	private static void output(List<Character> theList) {
		
		for(Character thing : theList){
			
			System.out.printf("%s  ",thing);
			System.out.println();
		}
		
	}

}
