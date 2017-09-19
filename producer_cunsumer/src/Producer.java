import java.io.File;
import java.util.concurrent.BlockingQueue;

/**
 * Created by alexei.yakushyn on 19.09.2017.
 * Producer read directory and put files in BlockingQueue
 */
public class Producer implements Runnable {
    public static final String PATH = "D:\\com.hillel.core\\Homework\\producer_cunsumer\\src\\sourse\\";
    protected BlockingQueue<String> bQ = null;

    private BlockingQueue<String> readDir(String path) {
        File dir = new File(path);
        path = PATH;
        File[] fList = dir.listFiles();
        for (File file : fList) {
            if (file.isFile()) {
                bQ.add(file.getAbsolutePath());
            }
        }
        return bQ;
    }

    @Override
    public void run() {

    }
}
