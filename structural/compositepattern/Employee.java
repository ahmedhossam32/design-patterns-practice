package composite;

public abstract class Employee {
    private String employeeName;
    private String position;
    private double salary;

    public Employee(String employeeName, String position, double salary) {
        this.employeeName = employeeName;
        this.position = position;
        this.salary = salary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    // Setters
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public abstract void displayDetails();
}
