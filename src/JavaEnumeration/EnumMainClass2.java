package JavaEnumeration;

import java.util.EnumSet;

public class EnumMainClass2 {
	
	public static void main(String args[]){
		
		for( Enumdemo people: Enumdemo.values()){
			System.out.printf("%s\t%s\t%s\n",people,people.getDesc(),people.getAge());
		}
		
		System.out.println("***********************************");
		
		for(Enumdemo people:EnumSet.range(Enumdemo.prabhu, Enumdemo.kiruba)){
			System.out.printf("%s\t%s\t%s\n",people,people.getDesc(),people.getAge());
		
		}
	}

}
