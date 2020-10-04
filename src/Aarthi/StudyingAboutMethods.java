package Aarthi;

public class StudyingAboutMethods {

	
	public   void main(String args[]){
		
		System.out.println(" twoTypes of method  1: Static and 2:Non Static ");
		StudyingAboutMethods.staticDemo();
		//How to create a object 
		
		StudyingAboutMethods saMObj = new StudyingAboutMethods();
		saMObj.nonStaticDemo();
		
	}
	
	public static void staticDemo(){
		System.out.println(" Classname.Methodname ");
	}
	
	
	public void nonStaticDemo(){
		System.out.println(" objname.methodname ");
	}
	
	
}
