package creational.design.prototypepattern;

public class Student implements Prototype{

    private String name;
    private int age;
    private String university;
    private int avgPsp;
    private String batch;
    private int year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getAvgPsp() {
        return avgPsp;
    }

    public void setAvgPsp(int avgPsp) {
        this.avgPsp = avgPsp;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Student(Student student) {
        student.name = name;
        student.age = age;
        student.university = university;
        student.avgPsp = avgPsp;
        student.batch = batch;
        student.year = year;
    }
    public Student(){}

    @Override
    public Student clone() {
        return new Student(this);
    }
}
