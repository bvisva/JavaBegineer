package JavaCollectionFrameworks;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListProgram {

	public static void main(String args[]) {
		String[] things = { "breads", "pens", "bats", "fingers", "balls", "fruits", "caps", "phones" };
		List<String> list1 = new ArrayList<String>();

		// add array items to list

		for (String x : things) {
			list1.add(x);
			
		}

		System.out.println("The values of list 1");
		for (int i = 0; i < list1.size(); i++) {
			System.out.printf("%s  ", list1.get(i));
		}
		System.out.println();

		String[] morethigs = { "hats", "bats", "balls", };
		List<String> list2 = new ArrayList<String>();

		// add array items to list

		for (String y : morethigs) {
			list2.add(y);
		}
		System.out.println("The values of list 2");
		for (int i = 0; i < list2.size(); i++) {
			System.out.printf("%s  ", list2.get(i));
		}
		

		list1.addAll(list2);
		list2 = null;
		
		printList(list1);
	System.out.println("Performing remove stuf");
	
		removeStuff(list1,2,5);
		System.out.println("After remove stuf");
		printList(list1);
		reverseList(list1);
		
		
		
		
	}//1,2,3,4,5,6,6,

	private static void reverseList(List<String> li1) {
		ListIterator<String> it = li1.listIterator (li1.size());
		while(it.hasPrevious()){
			System.out.printf("%s ",it.previous());
			
		}
	}

	private static void removeStuff(List<String> li1, int from, int to) {
		
	
		li1.subList(from, to).clear();
		//li1.subList(fromIndex, toIndex)
		
	}

	private static void printList(List<String> li1) {
		
		for(String b: li1)
			System.out.print(" "+b);
		System.out.println();
	}
	 
	
	
	
	
	
	
}
