package JavaEnumeration;

public enum Enumdemo {
	
    prabhu("dancing ", "20"), 
    kiruba("devloper","21");
    
	private final String desc;
	private final String age;
	
	Enumdemo (String description, String year){
		desc =description;
		age = year;
	}
	
	public String getDesc(){
		return desc;
		
	}
	
	public String getAge(){
		return age;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
