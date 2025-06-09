package composite;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee
{
     private List<Employee> employeelist = new ArrayList<Employee> () ;


    public Manager(String employeeName, String position, double salary) {
        super(employeeName, position, salary);
    }

    public void addEmployee(Employee employee)
    {
        employeelist.add(employee);
    }
    public void removeEmployee(Employee employee) {
        employeelist.remove(employee);
    }

    @Override
    public void displayDetails()
    {
        System.out.println("The employees manages by MR " + this.getEmployeeName() + "are ");
        for(Employee employee : employeelist)
        {
            employee.displayDetails();
        }

    }
}
