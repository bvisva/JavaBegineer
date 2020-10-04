package JavaFinalDemo;

public class FinalMainClass {

	public static void main(String args[]) {

		FinalVariables fv = new FinalVariables(10);

		for (int i = 0; i <5; i++) {
			fv.add();
			System.out.printf("%s", fv);
		}

	}
}

