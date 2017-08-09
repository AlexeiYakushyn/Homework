import java.io.File;
import java.io.IOException;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by alexei.yakushyn on 08.08.2017.
 */
public class DirHierarchy {
    public static void main(String[] args) {

        Path testFilePath = Paths.get("/home/heorhi/testfile.txt");
        System.out.println("Printing file information: ");
        System.out.println("\t file name: " + testFilePath.getFileName());
        System.out.println("\t root of the path: " + testFilePath.getRoot());
        System.out.println("\t parent of the target: "
                + testFilePath.getParent());
    }
}
