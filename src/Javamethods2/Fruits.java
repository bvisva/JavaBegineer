package Javamethods2;

public class Fruits {
	
	private String fruitName;
	
	public void setName(String fruitName){
		this.fruitName = fruitName;
	}
	
	public String getName(){
		return fruitName;
	}
	
	
	public void sayingName (){
		System.out.printf("the Name of my fav fruit is %s ", getName());
	}
	

}
