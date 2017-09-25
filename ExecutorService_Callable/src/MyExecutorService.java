import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by alexei.yakushyn on 25.09.2017.
 */
public class MyExecutorService extends Thread {

    private BlockingQueue sharedQueue;
    private String dir;
    private Character ch;
    public static int count = 0;


    public MyExecutorService(BlockingQueue sharedQueue, String dir, Character ch) {
        this.sharedQueue = sharedQueue;
        this.dir = dir;
        this.ch = ch;
    }

    public void executor() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(new Runnable() {
            public void run() {
                String line = null;
                while (true) {
                    try {
                        BufferedReader rdr = new BufferedReader(new FileReader(String.valueOf(sharedQueue.take())));
                        while ((line = rdr.readLine()) != null) {
                            char[] tmpChar = line.toCharArray();
                            for (Character chr : tmpChar) {
                                if (chr == ch) {
                                    count++;
                                }
                            }
                        }
                        System.out.println(count);
                        if (sharedQueue.size() == 0) break;

                    } catch (InterruptedException | FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        executor.shutdown();
    }
}
