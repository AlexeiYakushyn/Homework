import java.io.*;

/**
 * Created by java2 on 27.07.17.
 */
public class Lesson_12 {

    public static void main(String[] args) throws IOException {

        String file = "/home/java2/IdeaProjects/Homework1/myFile.txt";
        File file1 = new File(file);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileWriter writer = new FileWriter(file);


        while (true) {
            String s = reader.readLine();
            writer.append(s);
            writer.append('\n');
            writer.flush();
            break;
        }


    }
}