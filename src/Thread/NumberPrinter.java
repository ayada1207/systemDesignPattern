package Thread;

public class NumberPrinter implements Runnable{

    private int x;

    NumberPrinter(int number){
        this.x=number;
    }
    @Override
    public void run() {
    System.out.println("thread from :"+Thread.currentThread().getName());
    }
}
