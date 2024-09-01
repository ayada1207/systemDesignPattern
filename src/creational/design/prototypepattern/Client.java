package creational.design.prototypepattern;

public class Client {

    private static void fillRegistry(StudentRegistry studentRegistry) {
        Student mar24LLDEvePrototype = new Student();
        mar24LLDEvePrototype.setBatch("Mar24Eve");
        mar24LLDEvePrototype.setAvgPsp(80);
        studentRegistry.register("Mar24Eve", mar24LLDEvePrototype);

        Student feb24LLDEvePrototype = new Student();
        feb24LLDEvePrototype.setBatch("Feb24Eve");
        feb24LLDEvePrototype.setAvgPsp(75);
        studentRegistry.register("feb24LLDEve", feb24LLDEvePrototype);

        IntelligentStudent mar24LLDEveIntStudentPrototype = new IntelligentStudent();
        mar24LLDEveIntStudentPrototype.setBatch("Mar24Eve");
        mar24LLDEveIntStudentPrototype.setAvgPsp(80);
        mar24LLDEveIntStudentPrototype.iq = 100;
        studentRegistry.register("Mar24EveIntStudent", mar24LLDEveIntStudentPrototype);


    }

    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student shivam = studentRegistry.get("Mar24Eve").clone();
        shivam.setName("Shivam");
        shivam.setUniversity("YUBAN, Luanan");
        shivam.setAge(25);
        shivam.setAvgPsp(99);

        Student arpit = studentRegistry.get("Mar24EveIntStudent").clone();
        arpit.setName("Arpit");
        arpit.setBatch("Nov23");
        arpit.setUniversity("Aktu");
        arpit.setAvgPsp(99);

        System.out.println("DEBUG");
    }

}
