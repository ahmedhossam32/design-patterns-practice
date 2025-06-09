package composite;

public class Intern extends Employee
{
    private int  internduration ;


    public Intern(String employeeName, String position, double salary,int internduration) {
        super(employeeName, position, salary);
        this.internduration = internduration ;

    }

    @Override
    public void displayDetails() {
        System.out.println("Intern Details: ");
        System.out.println("Name: " + this.getEmployeeName());
        System.out.println("Position: " + this.getPosition());
        System.out.println("Salary: " + this.getSalary());
        System.out.println("Intern Duration: " + this.internduration);

    }
}
