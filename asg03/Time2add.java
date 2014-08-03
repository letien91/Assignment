// Fig. 8.5: Time2.java
// Time2 class declaration with overloaded constructors.  

public class Time2 {
	
	// save number of seconds from middle night
	private int secondFromMid;
	
	//contructor	
	public Time2(int sec){
			secondFromMid = sec % 43200;
	}
	
	//set sec method
	public void setTime(int sec){
			secondFromMid = sec % 43200;
	}
	
	//tick method
	public void tick(){
		secondFromMid = (++secondFromMid) % 43200;
	}
	
	public void incrementMinute(){
		secondFromMid = (secondFromMid + 60) % 43200;
	}
	
	public void incrementHour() {
		secondFromMid = (secondFromMid + 3600) % 43200;
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
