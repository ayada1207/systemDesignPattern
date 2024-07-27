package syncronization;


import java.util.concurrent.locks.ReentrantLock;

public class Subtracter implements Runnable {

    private Count count;

    private ReentrantLock mutex;

    public Subtracter(Count count, ReentrantLock mutex) {
        this.count = count;
        this.mutex = mutex;
    }

    @Override
    public void run() {
        mutex.lock();
        for(int i=0;i<1000;i++){
               count.setCount(count.getCount() - 1);
           }
        mutex.unlock();
        System.out.println("Subtracter: "+
                count.getCount() +" - "+
                Thread.currentThread().getName());
    }

//    @Override
//    public void run() {
//        synchronized (Count.class){
//            for(int i=0;i<100;i++){
//                count.setCount(count.getCount() - 1);
//                System.out.println("Subtracter: "+
//                        count.getCount() +" - "+
//                        Thread.currentThread().getName());
//            }
//        }
//    }
}
