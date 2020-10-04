package JavaSimplePrograms;

import java.util.Scanner;

public class AverageCalculator {
public static void main(String args[]){
	System.out.println("entr up to 10 numbers for calculating average ");
	
	Scanner getInput = new Scanner(System.in);
	int total =0;
	int grade;
	int counter = 0;
	int average;
	
	while(counter<10){
		System.out.println(" Loop Entry ");
		grade = getInput.nextInt();
		total = total + grade;
		counter++;
		System.out.println("Loop Exit");
	}
	
	average = total/10;
	System.out.println("the average value " +average);
	getInput.close();
	
	
}
}
