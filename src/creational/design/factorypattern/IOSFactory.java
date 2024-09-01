package creational.design.factorypattern;

import creational.design.factorypattern.Button.Button;
import creational.design.factorypattern.Button.IOSButton;
import creational.design.factorypattern.Menu.IOSMenu;
import creational.design.factorypattern.Menu.Menu;

public class IOSFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
