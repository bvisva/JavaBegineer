package JavaFinalDemo;

public class FinalVariables {
	
	private int sum;
	private final int NUMBER;
	
	public FinalVariables(int x){
		NUMBER = x;	
	}
	
	public void add(){
		sum+= NUMBER;
	}
	
	public String toString(){
		return String.format("sum = %d\n ", sum);
		
	}
	
	
}
