import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;

/**
 * Created by alexei.yakushyn on 19.09.2017.
 * Consumer read files from BlockingQueue, count how many times there are vowels appears and write em to collection.
 */
public class Consumer implements Runnable {

    protected BlockingQueue<String> blockingQueue = null;

    public Consumer(BlockingQueue<String> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }
    @Override
    public void run() {
        Producer prod = new Producer(blockingQueue);
        int count = 0;
            try (BufferedReader reader = new BufferedReader(new FileReader(prod.getbQ().take()))) {
                String line = null;
                while ((line = reader.readLine()) != null) {
                 char[] tmp = line.toCharArray();
                    char letter = 'a';
                    for (char c : tmp) {
                        if (c == letter) {
                            count++;
                        }
                    }
                }
                System.out.println(count);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

    }
}

