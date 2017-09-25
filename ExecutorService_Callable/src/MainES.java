import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by java2 on 25.09.17.
 */
public class MainES {

    public static void main(String[] args) {

        String dir = "/home/java2/IdeaProjects/Homework1/ProdCons/src/source";
        BlockingQueue sharedQueue = new LinkedBlockingQueue();

        Thread prodThread = new Thread(new Producer(sharedQueue, dir));
        prodThread.start();
        MyExecutorService executorService = new MyExecutorService(sharedQueue, dir, 'a');
        executorService.executor();
    }
}
