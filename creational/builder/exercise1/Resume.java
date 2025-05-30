package builderpattern;

import java.util.ArrayList;
import java.util.List;

public class Resume {
    private String fullName;
    private String email;
    private String phone;
    private Education education;
    private WorkExpercience workExperience;
    private List<String> skills;

    // Private constructor receives a builder
    private Resume(Builder builder) {
        this.fullName = builder.fullName;
        this.email = builder.email;
        this.phone = builder.phone;
        this.education = builder.education;
        this.workExperience = builder.workExperience;
        this.skills = builder.skills;
    }

    // ✅ Optional: toString() to easily print resume
    @Override
    public String toString() {
        return "Resume {" +
                "\n  Full Name: " + fullName +
                "\n  Email: " + email +
                "\n  Phone: " + phone +
                "\n  Education: " + (education != null ? education.getDegree() + ", " + education.getInstitution() : "N/A") +
                "\n  Work Experience: " + (workExperience != null ? workExperience.getRole() + " at " + workExperience.getCompany() : "N/A") +
                "\n  Skills: " + skills +
                "\n}";
    }

    public static class Builder {
        private String fullName;
        private String email;
        private String phone;
        private Education education;
        private WorkExpercience workExperience;
        private List<String> skills = new ArrayList<>();

        public Builder setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setEducation(Education education) {
            this.education = education;
            return this;
        }

        public Builder setWorkExperience(WorkExpercience workExperience) {
            this.workExperience = workExperience;
            return this;
        }

        public Builder addSkill(String skill) {
            this.skills.add(skill);
            return this;
        }

        public Resume build() {
            return new Resume(this);
        }
    }
}
