package creational.design.builderpattern;

public class Student {
    String name;
    int age;
    String universityName;
    int gradYear;
    int experience;
    double psp;
    double attendance;
    String batch;
    String currentCompany;

   public static BuilderPattern getBuilder(){
        return new BuilderPattern();
    }
    private Student(BuilderPattern builder)  {
        this.name= builder.getName();
        this.age= builder.getAge();
        this.universityName = builder.getUniversityName();
        this.gradYear = builder.getGradYear();
        this.batch = builder.getBatch();
        this.experience = builder.getExperience();
        this.psp = builder.getPsp();
    }


    // Inner static class Builder pattern as we have make Student constructor as private
    public static class BuilderPattern {

        String name;
        int age;
        String universityName;
        int gradYear;
        int experience;
        double psp;
        double attendance;
        String batch;
        String currentCompany;

        public Student build(){
            // add required validation
            if(this.getAge()<19){
                throw new RuntimeDesignPatterException("Age should be Greater Than 18");
            }
            if(this.getGradYear()==0){
                throw new RuntimeDesignPatterException("Student should graduated");
            }
            if(this.getPsp()<70){
                throw new RuntimeDesignPatterException("Student psp should be greater than 70");
            }
            return new Student(this);
        }
        public String getName() {
            return name;
        }

        public BuilderPattern setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public BuilderPattern setAge(int age) {
            this.age = age;
            return this;
        }

        public String getUniversityName() {
            return universityName;
        }

        public BuilderPattern setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public BuilderPattern setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public int getExperience() {
            return experience;
        }

        public BuilderPattern setExperience(int experience) {
            this.experience = experience;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public BuilderPattern setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public double getAttendance() {
            return attendance;
        }

        public BuilderPattern setAttendance(double attendance) {
            this.attendance = attendance;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public BuilderPattern setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public String getCurrentCompany() {
            return currentCompany;
        }

        public BuilderPattern setCurrentCompany(String currentCompany) {
            this.currentCompany = currentCompany;
            return this;
        }
    }


}
