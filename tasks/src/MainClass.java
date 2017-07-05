import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by alexei.yakushyn on 04.07.2017.
 */
public class MainClass {
    public static void main(String[] args) throws IOException {

        BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input diameter of the hole");
        double n = Double.parseDouble(num.readLine());
        System.out.println("Input the brick dimensions x, y , z");
        double n1 = Double.parseDouble(num.readLine());
        double n2 = Double.parseDouble(num.readLine());
        double n3 = Double.parseDouble(num.readLine());

        BrickInDaWall brick = new BrickInDaWall(n1, n2, n3);

        System.out.println(brick.solution(n1, n2, n3, n));
    }
}