package creational.design.factorypattern.Button;

public class IOSButton implements Button{
    @Override
    public void click() {
        System.out.println("IOS Button Click");
    }
}
