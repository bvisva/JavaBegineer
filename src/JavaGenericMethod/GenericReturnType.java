 package JavaGenericMethod;

public class GenericReturnType {
	
	public static void main(String args[]){
		
		System.out.println(max(90,40,60));
		System.out.println(max(30.44,40.55,60.55));
		System.out.println(max(22.2,44.4,64.4));
		System.out.println(max("prabhu","kiruba","zjohn"));
	}

	public static <T extends Comparable<T>> T max( T a,T b, T c){
		T m =a;

		if(b.compareTo(a)>0)
			m=b;
		if(c.compareTo(m)>0)
			m=c;
			
		return m;
	}
}
