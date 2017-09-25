import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by alexei.yakushyn on 22.09.2017.
 */
public class MainPC {

    public static void main(String[] args) throws InterruptedException {

        String dir = "E:\\ProgrammFiles\\hillel\\Homework\\testProdCons\\src\\source\\";
        BlockingQueue sharedQueue = new LinkedBlockingQueue();

        Thread prodThread = new Thread(new Producer(sharedQueue, dir));
        Thread consThread = new Thread(new Consumer(sharedQueue, dir, 'i'));

        prodThread.start();
        Thread.sleep(1000);
        consThread.start();
    }
}