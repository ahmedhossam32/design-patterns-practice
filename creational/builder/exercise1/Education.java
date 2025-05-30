package builderpattern;

public class Education {
    private String degree;
    private String institution;
    private int startYear;
    private int endYear;

    
    public Education(String degree, String institution, int startYear, int endYear) {
        this.degree = degree;
        this.institution = institution;
        this.startYear = startYear;
        this.endYear = endYear;
    }

  
    public String getDegree() {
        return degree;
    }

    public String getInstitution() {
        return institution;
    }

    public int getStartYear() {
        return startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    // Setters
    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }

    public void printEducationDetails() {
        System.out.println("Degree: " + degree);
        System.out.println("Institution: " + institution);
        System.out.println("Start Year: " + startYear);
        System.out.println("End Year: " + endYear);
    }

}
