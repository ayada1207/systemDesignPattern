package creational.design.factorypattern;

public class UIFactorySupportedPlatform {
    public static UIFactory getUiFactoryPlatform(SupportedPlatform platform){
        return switch (platform){
            case IOS -> new IOSFactory();
            case ANDROID -> new AndroidFactory();
            default -> null;
        };
    }
}
