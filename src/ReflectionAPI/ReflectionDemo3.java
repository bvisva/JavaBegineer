package ReflectionAPI;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ReflectionDemo3 {

	
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		ReflectionDemo3 rd3 = new ReflectionDemo3();
		    Method[] methods = rd3.getClass().getMethods();
		    
		    Scanner sc = new Scanner(System.in);
		Method[] SccannerMethodARRay = sc.getClass().getMethods();
	
		
		for ( int i = 0; i<SccannerMethodARRay.length;i++){
		 	  System.out.println(SccannerMethodARRay[i].getName());
	    		
			
		}
		    
		    
		    for ( int i = 0; i<methods.length;i++){
		    	
		    	if(methods[i].getName().equals("login")){
		    		
		    		methods[i].invoke(rd3,2);
		    		
		    		
		    	}
		    	
		    	
		    }
		
		
	}
	
	
	
	
	public void openBrowser(int a) {
		System.out.println(" Browesr opened ");
	}

	public void launchUrl(int b) {
		System.out.println(" Urllaunched ");
	}

	public void login() {
		System.out.println(" Log in sucessfull ");
	}

	public void takescreenShot() {
		System.out.println(" Screen shot captured");
	}

	public void closeBrowser() {
		System.out.println(" browser closed ");
	}
}
