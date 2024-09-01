package creational.design.factorypattern;

import creational.design.factorypattern.Button.AndroidButton;
import creational.design.factorypattern.Button.Button;
import creational.design.factorypattern.Menu.AndroidMenu;
import creational.design.factorypattern.Menu.Menu;

public class AndroidFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
