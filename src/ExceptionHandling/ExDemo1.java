package ExceptionHandling;

public class ExDemo1 {

	public static void main(String[] args) {
		
    exceptionDemo();

	}

	public static void exceptionDemo()   {

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
