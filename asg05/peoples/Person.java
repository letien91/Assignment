package peoples;
import java.util.Date;
import java.text.SimpleDateFormat;


public class Person {
	protected String name;
	protected String birthday;
	
	public Person(String name, Date birh) {
		this.name = name;
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		birthday = dateFormat.format(birh);
	}
	
	public String getName() {
		return name;
	}
	
	public String toString(){
		return String.format("Name : %s Birthday : %s", name, birthday);
	}
}
