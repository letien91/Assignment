package peoples;
import java.util.Date;


public class Employee extends Person{
	protected double salary;
	
	public Employee(String name, Date birth, double sal){
		super(name, birth);
		salary = sal;
	}
	
	public double getSalary(){
		return salary;
	}
	
	@Override
	public String toString(){
		return String.format("%s Salary : %3.2f",super.toString(), salary);
	}
}
