package creational.design.factorypattern;

import creational.design.factorypattern.Button.Button;
import creational.design.factorypattern.Menu.Menu;

public interface UIFactory {

    Button createButton();

    Menu createMenu();
}
