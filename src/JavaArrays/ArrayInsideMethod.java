package JavaArrays;

public class ArrayInsideMethod {

	public static void main(String args[]) {

		int values[] = { 4, 5, 8, 3, 9, 10, 99 };

		// enhanced for loop
		for (int y : values) {

			System.out.print(y+" ");
		}

		System.out.println();

		changeValues(values);

		
		System.out.println(" after change Values method");

		for (int y : values) {

			System.out.print(y + "  ");
		}

	}

	public static void changeValues(int x[]) {

		for (int i = 0; i < x.length; ++i) {
			// System.out.println(i);

			x[i] += 1500;

		}

	}

}
