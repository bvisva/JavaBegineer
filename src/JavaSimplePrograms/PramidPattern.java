package JavaSimplePrograms;

public class PramidPattern {
	
	
	public static void main(String[] args) {
		drawPyramidPattern();
	}

	public static void drawPyramidPattern() {
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			
			
			System.out.println();
		}
	}

	//Read more:http:// www.java67.com/2015/10/how-to-print-pyramid-pattern-in-java-example.html#ixzz4m3k2mlre
}
