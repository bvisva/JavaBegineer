package Time;

public class TimeClassMain {

	public static void main(String args[]) {

		TimeClass tc = new TimeClass();
	
		System.out.println(tc.toMilitaryTime());
		tc.setTime(17, 44, 9);
		System.out.println(tc.toMilitaryTime());

		System.out.println(tc.toRegularTime());
		tc.setTime(14, 55, 4);
		System.out.println(tc.toRegularTime());
		
		ThisKeywordUsage tku = new ThisKeywordUsage();
		tku.setTime(17, 23, 9);
		System.out.println(tku.toMilitaryTime());

	}
}
