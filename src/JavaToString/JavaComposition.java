package JavaToString;

public class JavaComposition {

	private String name;
	private Lenova birthdate;
	
	public JavaComposition(String theName , Lenova theDate ) {
		
		
		name = theName;
		birthdate = theDate;
	}
	
	public String toString(){
		return  String.format("My name %s , My birthday is ", name,birthdate);
	}
	
}
