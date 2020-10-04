package ReflectionAPI;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo2 {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		ReflectionDemo2 rd2 = new ReflectionDemo2();
	Method[] methodarray = rd2.getClass().getMethods();
	
	for (int i=0;i<methodarray.length;i++){
		
		if(methodarray[i].getName().equals("openBrowser")){
			methodarray[i].invoke(rd2,6);
			
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
