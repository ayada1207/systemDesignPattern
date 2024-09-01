package creational.design.factorypattern.Button;

public class AndroidButton implements Button{
    @Override
    public void click() {
        System.out.println("Android Button Click");
    }
}
