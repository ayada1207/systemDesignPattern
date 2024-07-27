package syncronization;

import java.util.concurrent.locks.ReentrantLock;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        ReentrantLock mutex = new ReentrantLock();

        Count count = new Count(0);
        Adder adder = new Adder(count,mutex);
        Subtracter subtract = new Subtracter(count,mutex);

        Thread th1 = new Thread(adder);
        th1.start();
        Thread th2 = new Thread(subtract);
        th2.start();


        // Join method is used to let the current thread to complete the task,until
        // then main thread will wait for th1 to execute this task, if  we don't write this join method
        //main thread will execute first, And we get 0 value always for count.
        th1.join();
        th2.join();

        System.out.println("current Value from "+ Thread.currentThread().getName()+
                " is-: " +count.getCount());
    }




}
