package JavaArrays;

public class StringToCharArray {

    public static void main(String[] args) {

        String password = "password123";

        char[] passwordInCharArray = password.toCharArray();

       
        
        
        for(int i=passwordInCharArray.length-1;i>=0;i--){
  
        	System.out.println(passwordInCharArray[i]);
        }

    }

}