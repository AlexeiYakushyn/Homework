import java.io.File;
import java.util.concurrent.BlockingQueue;

/**
 * Created by alexei.yakushyn on 22.09.2017.
 */
public class Producer implements Runnable {

    private final BlockingQueue sharedQueue;
    private String dir;


    public Producer(BlockingQueue sharedQueue, String dir) {
        this.sharedQueue = sharedQueue;
        this.dir = dir;
    }

    @Override
    public void run() {
        File myFolder = new File(dir);
        File[] folders = myFolder.listFiles();
        for (int i = 0; i < folders.length; i++) {
            if (!(folders[i].isDirectory())) {
                try {
                    sharedQueue.put(folders[i]);
                    System.out.println(Thread.currentThread().getName() + " " + sharedQueue.size());
                  //  Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
