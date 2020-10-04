package Time;

public class ThisKeywordUsage {
	private int hour =1;
	private int minutes = 2;
	private int seconds = 3;
	
	public void setTime(int hour, int minute, int seconds){
		
	this.hour = 4;
	this.minutes =5;
	this.seconds = 6;
	}
	
	public String toMilitaryTime(){
		return String.format("%02d :%02d :%02d", hour,minutes,seconds);
		
	}
	
	public String toRegularTime(){
		return String.format("%02d :%02d : %02d  %s ", ((hour == 0 || hour ==12)? 12 : hour%12),minutes,seconds,(hour < 12 ? "AM" : "PM "));
		
	}

}
