package builderpattern;

public class BuilderPattern {

    public static void main(String[] args) {
        WorkExpercience exp = new WorkExpercience("Software Engineer", "Google", 2020, 2023);
    
        Education edu1 = new Education("Bachelor of Computer Science", "Cairo University", 2019, 2023);
    
        
     Resume resume = new Resume.Builder()
    .setFullName("Ahmed Hossam")
    .setEmail("ahmed@example.com")
    .setPhone("01012345678")
    .setEducation(edu1)
    .setWorkExperience(exp)
    .addSkill("Java")
    .addSkill("Spring Boot")
    .addSkill("Git")
    .build();

    }
    
}
