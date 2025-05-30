package builderpattern;

public class WorkExpercience {
    

    private String role;
    private String company;
    private int startYear;
    private int endYear;

   
    public WorkExpercience(String role, String company, int startYear, int endYear) {
        this.role = role;
        this.company = company;
        this.startYear = startYear;
        this.endYear = endYear;
    }

    // Getters
    public String getRole() {
        return role;
    }

    public String getCompany() {
        return company;
    }

    public int getStartYear() {
        return startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    // Setters
    public void setRole(String role) {
        this.role = role;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }

    // Display method
    public void printExperience() {
        System.out.println(role + " at " + company + " (" + startYear + " - " + endYear + ")");
    }
}


