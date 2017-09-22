import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;

/**
 * Created by alexei.yakushyn on 22.09.2017.
 */
public class Consumer implements Runnable {

    private final BlockingQueue sharedQueue;
    private Character ch;
    private String dir;
    public static int count = 0;

    // private HashMap<Integer, String> words;

    public Consumer(BlockingQueue sharedQueue, String dir, Character ch) {
        this.sharedQueue = sharedQueue;
        this.dir = dir;
        this.ch = ch;
    }

    @Override
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

            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
