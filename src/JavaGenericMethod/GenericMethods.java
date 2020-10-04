package JavaGenericMethod;

public class GenericMethods {
	public static void main(String args[]) {

		Integer[] iray = { 1, 2, 3, 4 };
		char[] cray = { 'b', 'e', 'r', 'y' };
		printIntArray(iray);
		System.out.println();
		printCharrArray(cray);
		// String str ;
		// String st1r = new String();

	}

	private static void printCharrArray(char[] charray) {
		
		for (char x : charray) {
			System.out.printf("%S", x);
		}

	}

	private static void printIntArray(Integer[] iarray) {
		System.out.println();
		for (int x : iarray) {
			System.out.printf("%s", x);
		}
	}

}
