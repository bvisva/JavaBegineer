import java.util.Scanner;

public class Example {
	static String nm; 
	int ag;
public static void main(String[] args) {
	Example.name();
	Example objage=new Example();
	objage.age();
	int a = Example.nextInt();
	System.out.println(a);
	
}
public static int nextInt() {
	// TODO Auto-generated method stub
	return 20;
}
public static void name(){
System.out.println("please enter name");
	Scanner sc=new Scanner(System.in);
	
	nm=sc.nextLine();
	System.out.println("name is "+nm);
	}
public void age(){
	System.out.println("please enter age");
	Scanner sc= new Scanner(System.in);
	ag=sc.nextInt();
	System.out.println("age is "+ag);
}
public Example(){
	System.out.println("this is a consturctor");
}
}

