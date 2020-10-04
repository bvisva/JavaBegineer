package JavaCollectionFrameworks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionMethodSort {

	public static void main(String args[]){
		
		String[] morethigs = { "hats", "bats", "balls",
				"breads", "pens", "bats", "fingers", "balls", "fruits", "caps", "phones"  };
	   
 List<String> l1 = Arrays.asList(morethigs);
	    
	   Collections.sort(l1);
	   
	    System.out.printf(" %s\n",l1);
	   
	    Collections.sort(l1,Collections.reverseOrder());
	    System.out.printf(" %s\n",l1);
	   
	
	}
}
