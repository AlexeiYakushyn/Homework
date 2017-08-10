import java.io.*;
import java.util.Stack;

/**
 * Created by java2 on 10.08.17.
 */
public class ClassWork {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(new File("/home/java2/IdeaProjects/Homework1/lesson_10_08/inputOutput.txt")));


        Stack<String> strings = new Stack<>();
        String str;
        while ((str = reader.readLine()) != null) {
            strings.push(str);
        }

        while (!strings.empty()) {
            System.out.println(strings.pop());
        }

       //  System.out.println(strings.peek());

    }

}
