package JavaSimplePrograms;

public class VariableLegenthArguments {
	
	public static void main(String ...ar){
	System.out.println("The average value of numbers ");
		System.out.println(variabLength(4,6,88,24,55,90,11,44,66,55,88));
		
		
		
	}
	
	public static  int variabLength(int...numbers){
		
		int total =0;
		for(int x:numbers){
			total+=x;
		}
		return total/numbers.length;
		
		
		
	}
	

}
