package composite;

public class Developer extends Employee
{
    private String devolping;

    public Developer(String employeeName, String position, double salary,String devolping)
    {
        super(employeeName, position, salary);
        this.devolping = devolping;
    }

    @Override
    public void displayDetails() {
        System.out.println("Developer Name: " + this.getEmployeeName());
        System.out.println("Position: " + this.getPosition());
        System.out.println("Salary: " + this.getSalary());
        System.out.println("Developer Details: " + this.devolping);

    }
}
