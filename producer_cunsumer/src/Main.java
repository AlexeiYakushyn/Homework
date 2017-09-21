import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by alexei.yakushyn on 21.09.2017.
 */
public class Main {
    public static void main(String[] args) {
        BlockingQueue blockingQueue = new ArrayBlockingQueue(10);

        Producer p = new Producer(blockingQueue);
        Consumer c1 = new Consumer(blockingQueue);
        Consumer c2 = new Consumer(blockingQueue);
        Consumer c3 = new Consumer(blockingQueue);
        Thread producer = new Thread(p);
        producer.start();
        Thread consumer1 = new Thread(c1);
        consumer1.start();
        Thread consumer2 = new Thread(c2);
        consumer2.start();
        Thread consumer3 = new Thread(c3);
        consumer3.start();

        try {
            producer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        consumer1.interrupt();
        consumer2.interrupt();
    }
}
