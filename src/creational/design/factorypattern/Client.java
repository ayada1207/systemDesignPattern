package creational.design.factorypattern;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();

        UIFactory uif= flutter.getUIFactory(SupportedPlatform.IOS);
        uif.createButton().click();
        uif.createMenu().showMenu();

    }
}
