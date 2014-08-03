import java.util.Date;

import peoples.Employee;


public class Manager extends Employee {
	private Employee assistant;
	
	public Manager(String name, Date birth, double sal){
		super(name, birth, sal);
	}
	
	public void setAssistant(Employee assi){
		assistant = assi;
	}
	
	@Override
	public String toString(){
		return String.format("%s Assistant : %s", super.toString(), assistant);
	}
}
