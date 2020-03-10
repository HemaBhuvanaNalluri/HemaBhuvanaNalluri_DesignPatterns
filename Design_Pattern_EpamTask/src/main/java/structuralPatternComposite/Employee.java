package structuralPatternComposite;

import java.util.ArrayList;
public class Employee {
	private String name;
    private String position;
    private int wage;
    private ArrayList<Employee> coworkers;
    
    public Employee(String name, String position, int wage) {
        this.name = name;   
        this.position = position;
        this.wage = wage;
        coworkers = new ArrayList<Employee>();
    }
    
    public void addCoworker(Employee employee) {
        coworkers.add(employee);
    }
    
    public void removeCoworker(Employee employee) {
        coworkers.remove(employee);
    }
    
    public ArrayList<Employee> getCoworkers() {
        return coworkers;
    }
    
    public String toString() {
        return "Employee : | Name: " + name + ", Position: " + position + ", Wage: "
             + wage + " |";
    }
}
