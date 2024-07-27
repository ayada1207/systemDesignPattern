package Thread;

import java.time.LocalDateTime;
import java.util.concurrent.*;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        NumberPrinter nmbPrinter = new NumberPrinter(10);
//        Thread th = new Thread(nmbPrinter);
//        th.start();
//        System.out.println("Hello World from thread : "
//                + Thread.currentThread().getName());
//
//
//        Executor executor = Executors.newFixedThreadPool(10);
//        for(int i=0;i<100;i++){
//            NumberPrinter nmb = new NumberPrinter(i);
//            executor.execute(nmb);
//        }

//        MrpCalculator mrp = new MrpCalculator(10);
//        DiscountCalculator discount = new DiscountCalculator(15);
//        ExecutorService executorService = Executors.newFixedThreadPool(2);
//        Future<Integer> mrpCalculated = executorService.submit(mrp);
//        Future<Double> discountPrice = executorService.submit(discount);
//        System.out.println("Print before call from thread : "
//                + Thread.currentThread().getName()
//                + ", Time : " + LocalDateTime.now());
//        // blocking call, until this won't executed everything is blocked
//        int mrpCal = mrpCalculated.get();
//
//        System.out.println("Print after call from thread : "
//                + Thread.currentThread().getName()
//                + ", Time : " + LocalDateTime.now());
//        double discountCalc = discountPrice.get();
//
//        double finalPrice = mrpCal - (mrpCal * discountCalc/100);
//        System.out.println("Final price : " + finalPrice + ", " +
//                "from thread : " + Thread.currentThread().getName());



    }
}
