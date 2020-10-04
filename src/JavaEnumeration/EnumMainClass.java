package JavaEnumeration;

public class EnumMainClass {
	
	public static void main(String args[]){
		
		for( Enumdemo people: Enumdemo.values()){
			System.out.printf("%s\t%s\t%s\n",people,people.getDesc(),people.getAge());
		}
	}

}
