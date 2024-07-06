package creational.design.prototypepattern;

public class IntelligentStudent extends Student{
    int iq;

    IntelligentStudent(){

    }

    public IntelligentStudent(IntelligentStudent student){
        super(student);
        this.iq=student.iq;
    }

    @Override
    public Student clone() {
        return new IntelligentStudent(this);
    }
}
