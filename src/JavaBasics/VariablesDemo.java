package JavaBasics;

public class VariablesDemo {
	
	public static final  String name ="prabhu";
	public static int b =10;
	public static int a =20;
public static void main(String args[]){
	
	//data type variable [ = value][, variable [= value] ...] ;
	
	double decimal;
	decimal = 3.14;
	
	String mani;
//public static int a ;
 	System.out.println("The value of PI is " + decimal);
	System.out.println(  a+b);
}
	
}


/*Rule for Local Variable
•Local variables cannot use any of the access level since its scope is only inside the method.
•Final is the Only Non Access Modifier that can be applied to a local variable.
•Local variables are not assigned a default value, hence they need to be initialized.*/


/*Naming Convention

There are no specific rules for naming a local variable. All the rules of variables are applied to local variables.

Below mentioned are the rules for naming a local variable.

•Variable names are case sensitive.
•There is no limitation on the length of a local variable.
•If a variable name is of one word only then all characters should be in lower case.*/

/*Rules for Instance variable
 * 
•Instance variables can use any of the four access levels
•They can be marked final
•They can be marked transient
•They cannot be marked abstract
•They cannot be marked synchronized
•They cannot be marked strictfp
•They cannot be marked native
•They cannot be marked static*/


/*Types of reference variables
•Static Variable
•Instance Variable
•Method Parameter
•Local Variable*/
