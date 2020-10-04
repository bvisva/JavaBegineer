package ReflectionAPI;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ReflectionDemo {
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		 ReflectionDemo reflectionDemo = new ReflectionDemo();
		/* 
		 reflectionDemo.openBrowser();
		 reflectionDemo.closeBrowser();
		 
		 reflectionDemo.openBrowser();
		 reflectionDemo.launchUrl();
		 reflectionDemo.closeBrowser();
		 
		  reflectionDemo.openBrowser();
		 reflectionDemo.launchUrl();
		 reflectionDemo.closeBrowser()
		 takeScreenShot
		 
		 *
		 *
		 */
		 
		 Scanner sc= new Scanner(System.in);
		 sc.getClass().getMethods();
		 
		 Method[] methodsArray = reflectionDemo.getClass().getMethods();
		 
		 for (int i =0;i<methodsArray.length;i++){
			 
			// System.out.println(methodsArray[i].getName());
			 
			 if ( methodsArray[i].getName().equals("login")){
				 methodsArray[i].invoke(reflectionDemo, 2);
				
			 }
		 }
		 
	}
	
	public void openBrowser(int a){
System.out.println(" Browesr opened ");		
	}
	
	
	public void launchUrl(int b){
		System.out.println(" Urllaunched ");
	}
	
	public void login(){
		System.out.println(" Log in sucessfull ");
	}
	
	
	public void takescreenShot(){
		System.out.println(" Screen shot captured");
	}
	
	public void closeBrowser(){
		System.out.println(" browser closed ");
	}

}
