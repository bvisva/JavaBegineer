package JavaGenericMethod;

public class ImplementationOfGenerics {
public static void main(String args[]){
		
		Integer[] iray = {1,2,3,4};
		Character[]cray ={'b','e','r','y'};
	//	printIntArray(iray);
		System.out.println();
	//	printCharrArray(cray);
		printGenericArra(iray);
		printGenericArra(cray);
		printGenericArra(iray);
		
	}

private static <B>void printGenericArra( B[] x) {
	for(B b:x){
		System.out.printf("%S", b);
		System.out.println();
	}
	
}
}
