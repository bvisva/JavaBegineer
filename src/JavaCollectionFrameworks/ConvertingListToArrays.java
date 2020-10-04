package JavaCollectionFrameworks;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class ConvertingListToArrays {
	public static void main(String args[]) {
		
		

		String[] morethings = { "hats", "bats", "balls", "breads", "pens", "bats", "fingers", "balls", "fruits", "caps",
				"phones" };

		LinkedList<String> thelist = new LinkedList<String>(Arrays.asList(morethings));
		// new LinkedList<String>();

		thelist.add("pumpkins");
		thelist.addFirst("prabhu");

		// Converting Back to Array
		morethings = thelist.toArray(new String[thelist.size()]);
		
		

		for (String x : morethings)
			System.out.printf("%S ", x);

	}

}
