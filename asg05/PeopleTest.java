import java.util.Date;

import peoples.Employee;
import peoples.Person;

public class PeopleTest {
	public static void main(String[] args) {
		Employee newbie = new Employee
				("Newbie", new Date("2/10/1989"), 1000000);
				Manager boss = new Manager
				("Boss", new Date("2/23/1986"), 4000000);
				boss.setAssistant(newbie);
				Manager biggerBoss = new Manager
				("Big Boss", new Date("3/12/1969"), 10000000);
				biggerBoss.setAssistant(boss);
				
				Person[] listOfPerson = {newbie, boss, biggerBoss};
				for(int i = 0; i < listOfPerson.length; i++){
					System.out.println(listOfPerson[i]);
				}
	}
}
