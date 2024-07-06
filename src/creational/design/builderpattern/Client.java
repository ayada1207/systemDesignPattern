package creational.design.builderpattern;

public class Client {

    public static void main(String[] args) {
        // BuilderPattern builder = new BuilderPattern();
       // BuilderPattern builder = ;
        //builder.setAge(20);
       // builder.setGradYear(2019);
      //  builder.setAttendance(90);
       // builder.setBatch("Morning");
        //builder.setPsp(80);
    Student.BuilderPattern builder = Student.getBuilder();
    builder.setName("Arpt")
            .setAge(20)
            .setAttendance(80)
            .setGradYear(2019)
                    .setBatch("Morning")
                            .setExperience(12)
                                    .setPsp(90).build();

        System.out.println("DEBUG");
    }
}
