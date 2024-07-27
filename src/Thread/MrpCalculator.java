package Thread;

import java.util.concurrent.Callable;

public class MrpCalculator implements Callable<Integer> {
    private int productId;

    public MrpCalculator(int id) {
        productId = id;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println("MRP for Product ID : " + productId +
                ", found with thread : " +
                Thread.currentThread().getName());
        Thread.sleep(5000);
        return 100;

    }
}
