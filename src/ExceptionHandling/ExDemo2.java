package ExceptionHandling;

public class ExDemo2 {

	public static void main(String[] args) {

		int prabhu[] = { 4, 4, 4, 4, 4 };

		System.out.println(" before ");
		
				try {
					System.out.println(prabhu[7]);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		

		System.out.println(" After ");
	}

}
