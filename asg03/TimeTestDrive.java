
public class TimeTestDrive {
	public static void main(String[] args) {
		Time2 time = new Time2(43199);
		time.incrementMinute();
		time.tick();
		System.out.println(time.toUniversalString());
		//System.out.println(time.toString());
	}
}
