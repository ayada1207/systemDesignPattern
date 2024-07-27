package creational.design.singletonpattern;

public class Singleton {

    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        if(instance==null){
            synchronized (Singleton.class){
                if(instance==null){
                    instance= new Singleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        System.out.println("x- " + x.hashCode());
        System.out.println("y- " + y.hashCode());
    }

}
