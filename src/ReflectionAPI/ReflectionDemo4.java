package ReflectionAPI;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo4 {
	
	public static void main(String args[]) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		
		ReflectionDemo4 rd4 = new ReflectionDemo4();
		Method[] methods = rd4.getClass().getMethods();
		int length = methods.length;
		
		
		for (int i=0;i<length;i++){
			if(methods[i].getName().equals("openBrowser")){
				
				methods[i].invoke(rd4, 2,4);
			}
		}
		
	}
	
	
	public void openBrowser(int a,int c) {
		System.out.println(" Browesr opened ");
	}

	public void launchUrl(int b,int c) {
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
