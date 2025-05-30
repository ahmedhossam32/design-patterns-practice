package builderpattern;

import java.util.ArrayList;
import java.util.List;

public class Skill {
    private List<String> skills;

 
    public Skill() {
        this.skills = new ArrayList<>();
    }

    public void addSkill(String skill) {
        skills.add(skill);
    }

    public void removeSkill(String skill) {
        skills.remove(skill);
    }

    public List<String> getSkills() {
        return skills;
    }

    public void printSkills() {
        System.out.println("Skills: ");
        for (String skill : skills) {
            System.out.println("- " + skill);
        }
    }
}

