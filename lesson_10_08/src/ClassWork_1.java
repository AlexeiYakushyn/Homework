import java.io.*;
import java.util.ArrayList;

/**
 * Created by java2 on 10.08.17.
 */
public class ClassWork_1 {

    public static final String FILENAME = "/home/java2/IdeaProjects/Homework1/lesson_10_08/inputOutput.txt";

    public static void main(String[] args) throws IOException{

        //RandomAccessFile file = new RandomAccessFile(FILENAME, "rw");
        BufferedReader file = new BufferedReader(new FileReader(FILENAME));

       // String str = file.readLine();
        ArrayList<String> strings = new ArrayList<>();
        String line;
        while ((line = file.readLine()) != null) {
            strings.add(line);
        }
        System.out.println(strings);

        strings.add(2, "BLABLABLA");
        System.out.println(strings);

        BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME));

        for (int i = 0; i < strings.size(); i++) {
            String string = strings.get(i);
            writer.write(string);
            writer.newLine();
        }
        writer.flush();
        writer.close();
        file.close();


    }
}
