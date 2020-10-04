package JavaConstructors;

import JavaConstructors.MultipleConstructors;

public class TimeMainCkass2 {

	public static void main(String args[])
	{
	MultipleConstructors mc = new MultipleConstructors();	
	MultipleConstructors mc1 = new MultipleConstructors(5);
	MultipleConstructors mc2 = new MultipleConstructors(5,6);
	MultipleConstructors mc3 = new MultipleConstructors(5,6,8);
	
	System.out.printf("%s\n",mc.toMilitary());
	System.out.printf("%s\n",mc1.toMilitary());
	System.out.printf("%s\n",mc2.toMilitary());
	System.out.printf("%s\n",mc3.toMilitary());
	
	
	}
}
