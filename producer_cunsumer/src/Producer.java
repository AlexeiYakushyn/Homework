import java.io.File;
import java.util.concurrent.BlockingQueue;

/**
 * Created by alexei.yakushyn on 19.09.2017.
 * Producer read directory and put files in BlockingQueue
 */
public class Producer implements Runnable {

    public static final String PATH = "E:\\ProgrammFiles\\hillel\\Homework\\producer_cunsumer\\src\\source\\";

    protected BlockingQueue<String> bQ = null;

    public Producer(BlockingQueue<String> bQ) {
        this.bQ = bQ;
    }

    @Override
    public void run() {
        File dir = new File(PATH);
        File[] fList = dir.listFiles();
        for (File file : fList) {
            if (file.isFile()) {
                try {
                    bQ.put(file.getAbsolutePath());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public BlockingQueue<String> getbQ() {
        return this.bQ;
    }
}
