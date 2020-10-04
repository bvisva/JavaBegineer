package JavaToString;

public class Lenova {
private int month;
private int year;
private int day;

Lenova(int m ,int y,int d){
	month =m;
	year = y;
	day  = d;
	
	System.out.printf("the constructor of this is %s\n", this);
	
}
public String toString(){
	return String.format("%d,%d,%d", month, day, year);
}
	
}
