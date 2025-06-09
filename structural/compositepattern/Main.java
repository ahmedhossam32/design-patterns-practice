package composite;

public class Main {
    public static void main(String[] args) {

        // Create leaf nodes (Developers now include their specialization)
        Employee dev1 = new Developer("Charlie", "Developer", 120000, "Backend - Java");
        Employee dev2 = new Developer("David", "Developer", 110000, "Frontend - React");

        Employee intern1 = new Intern("Eve", "Intern", 50000, 6);
        Employee intern2 = new Intern("Grace", "Intern", 40000, 3);

        // Create composite nodes
        Employee headEngineering = new Manager("Bob", "Head of Engineering", 200000);
        Employee headMarketing = new Manager("Frank", "Head of Marketing", 180000);

        // Add subordinates to Head of Engineering
        ((Manager) headEngineering).addEmployee(dev1);
        ((Manager) headEngineering).addEmployee(dev2);
        ((Manager) headEngineering).addEmployee(intern1);

        // Add subordinates to Head of Marketing
        ((Manager) headMarketing).addEmployee(intern2);

        // Create CEO
        Employee ceo = new Manager("Alice", "CEO", 300000);
        ((Manager) ceo).addEmployee(headEngineering);
        ((Manager) ceo).addEmployee(headMarketing);

        // Display full company hierarchy
        ceo.displayDetails();
    }
}
