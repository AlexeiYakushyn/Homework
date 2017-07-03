import java.util.Scanner;

/**
 * Created by alexei.yakushyn on 7/3/17.
 */
public class MainClass {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input brick edges : x, y, z");
        BrickInDaWall brickJack = new BrickInDaWall(scn.nextDouble(), scn.nextDouble(), scn.nextDouble());
        System.out.println("Set the hole diameter");
        double d = scn.nextDouble();
        brickJack.setDiameter(d);
        brickJack.solution(d);
        System.out.println(brickJack.solution(d));
    }
}
