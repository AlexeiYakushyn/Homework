import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by alexei.yakushyn on 7/12/17.
 * Написать программу, которая будет считать n-ный элемент последовательности Трибоначчи
 * (каждый следующий элемент - сумма трех предыдущих).
 * И циклом, и рекурсивно. Сравнить быстродействие.
 */
public class Tribonacci {
    public static int tribonacciRecursion(int num) {
        if (num <= 0) {
            System.out.println("Wrong number");
            return 0;
        } else if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 0;
        }
        if (num == 2) {
            return 1;
        }
        if (num == 3) {
            return 1;
        }
        return tribonacciRecursion(num - 1) + tribonacciRecursion(num - 2) + tribonacciRecursion(num - 3);
    }

    public static int tribonacciCycle(int num) {
        int num1 = 0, num2 = 1, num3 = 1;
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 0;
        }
        if (num == 2) {
            return 1;
        } else {
            int trbnc = 0, i = 3;
            while (i < num) {
                trbnc = num1 + num2 + num3;
                num1 = num2;
                num2 = num3;
                num3 = trbnc;
                i++;
            }
            return trbnc;
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader scn = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter index of the tribonacci number");
        int num = Integer.parseInt(scn.readLine());

        Tribonacci trbncc = new Tribonacci();

        long startRec = System.nanoTime();
        System.out.println("The tribonacci number calculated by recursion is " + trbncc.tribonacciRecursion(num));
        long endRec = System.nanoTime();
        long runtimeRec = endRec - startRec;
        System.out.println("Recursion runtime is " + runtimeRec + " nanoseconds");

        System.out.println("");

        long startCycle = System.nanoTime();
        System.out.println("The tribonacci number calculated by cycle is " + trbncc.tribonacciCycle(num));
        long endCycle = System.nanoTime();
        long runtimeCycle = endCycle - startCycle;
        System.out.println("Cycle runtime is " + runtimeCycle + " nanoseconds");

        if (runtimeRec > runtimeCycle) {
            System.out.println("\nCycle works faster!");
        } else if (runtimeRec < runtimeCycle) {
            System.out.println("\nRecursion works faster!");
        } else System.out.println("\nBoth methods works great.");

    }
}
