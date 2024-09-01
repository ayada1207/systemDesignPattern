package creational.design.factorypattern;

public class Flutter {

    void refreshUI(){
        System.out.println("Refreshing UI");
    }

    void setTheme(){
        System.out.println("creating theme");
    }

    public UIFactory getUIFactory(SupportedPlatform platform){
        return UIFactorySupportedPlatform.getUiFactoryPlatform(platform);
    }
}
