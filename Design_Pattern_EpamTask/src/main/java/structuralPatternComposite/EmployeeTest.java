package structuralPatternComposite;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class EmployeeTest {
	private ArrayList<Employee> x=new ArrayList<Employee>();
	Employee employee1 = new Employee("David", "Programmer", 1500);
    Employee employee2 = new Employee("Scott", "CEO", 3000);
    Employee employee3 = new Employee("Andrew", "Manager", 2000);
    Employee employee4 = new Employee("Scott", "Janitor", 500);
    Employee employee5 = new Employee("Juliette", "Marketing", 1000);
    Employee employee6 = new Employee("Rebecca", "Sales", 2000);
    Employee employee7 = new Employee("Chris", "Programmer", 1750);
    Employee employee8 = new Employee("Ivan", "Programmer", 1200);
	@Test
	public void testEmployee() {		
	}

	@Test
	public void testAddCoworker() {
		employee3.addCoworker(employee1);
        employee3.addCoworker(employee7);
        employee3.addCoworker(employee8);
	}

	@Test
	public void testRemoveCoworker() {
		employee3.removeCoworker(employee1);
	}

	@Test
	public void testGetCoworkers() {
		x=employee3.getCoworkers();
	}

	@Test
	public void testToString() {
		Employee e=new Employee("David", "Programmer", 1500);
		assertEquals("Employee : | Name: David, Position: Programmer, Wage: 1500 |",e.toString());

	}

}
