package JavaCollectionFrameworks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ArrayListProgram {

	public static void main(String args[]) {

		// IM declaring arrays
		String things[] = { "breads", "pens", "bats", "balls", "fruits", "caps" };

		List<String> list1 = new ArrayList<String>();

		// new ArrayListProgram();
		// add array items to list

		for (String x : things) {
			
            list1.add("Prabhu");
			list1.add(x);

		}

		String[] morethings = { "hats", "bats", "balls","Prabhu"};

		List<String> list2 = new ArrayList<String>();

		// add array items to list

		for (String y : morethings) {

			list2.add(y);

			// list2.add(y);
		}

		System.out.println("The values of list 1 ");

		for (int i = 0; i < list1.size(); i++) {

			System.out.printf("%s  ", list1.get(i));
		}

		System.out.println();
		System.out.println("The values of list 2");

		for (int i = 0; i < list2.size(); i++) {
			System.out.printf("%s  ", list2.get(i));
		}
		System.out.println();
		// add, size,get,iterator,contains,remove,next,hasnext

		editList(list1, list2);

		// editList(list2, l2);

		System.out.println("After the EditList method");
		for (int i = 0; i < list1.size(); i++) {
			System.out.printf("%s  ", list1.get(i));
		}

	}

	// { "breads", "pens", "bats", "balls", "fruits", "caps" };
	public static void editList(Collection<String> l1, Collection<String> l2) {

	 Iterator<String> it = l1.iterator();

		while (it.hasNext()) {
			// "hats", "bats", "balls","Prabhu"
			if (l2.contains(it.next()))

				it.remove();
		}

	}

}
