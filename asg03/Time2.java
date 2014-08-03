// Fig. 8.5: Time2.java
// Time2 class declaration with overloaded constructors.  

public class Time2 {
	
	// save number of seconds from middle night
	private int secondFromMid;
	
	//contructor	
	public Time2(int sec){
		if(sec > 0)
			secondFromMid = sec;
	}
	
	//set sec method
	public void setTime(int sec){
		if(sec > 0)
			secondFromMid = sec;
	}
	
	//tick method
	public void tick(){
		
	}
	
	/* Get Methods */
	// get hour value
	public int getHour() {
		int hour = secondFromMid / 3600;
		return hour;
	}

	// get minute value
	public int getMinute() {
		int minute = (secondFromMid % 3600) / 60;
		return minute;
	}
	
	// get second value
	public int getSecond() {
		int second = (secondFromMid % 3600) % 60;
		return second;
	}

	// convert to String in universal-time format (HH:MM:SS)
	public String toUniversalString() {
		return String.format("%02d:%02d:%02d", getHour(), getMinute(),
				getSecond());
	}

	// convert to String in standard-time format (H:MM:SS AM or PM)
	public String toString() {
		return String.format("%d:%02d:%02d %s",
				((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
				getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
	} 
}