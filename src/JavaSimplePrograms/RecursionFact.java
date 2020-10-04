package JavaSimplePrograms;

public class RecursionFact {

	public static void main(String args[]) {

		System.out.println(fact(20));

	}

	public static long fact(long n) {

		if (n <= 1) {
			return 1;
		} else {

			long f;
			f = n * fact(n - 1);

			return f;

		}
	}
}
