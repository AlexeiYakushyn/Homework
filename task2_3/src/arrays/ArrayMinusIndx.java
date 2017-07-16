package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by alexei.yakushyn on 7/16/17.
 */
public class ArrayMinusIndx {
    private static int[] sourceMass = new int[20];
    private static int[] resultMass = new int[sourceMass.length - 1];

    public static int[] ArrayMinusIndx(int a) {

        int count = 0;
        for (int i = 0; i < sourceMass.length; i++) {

            if (i != a - 1) {
                resultMass[count] = sourceMass[i];
                count++;
            }
        }
        for (int i = 0; i < resultMass.length; i++) {
            System.out.print(resultMass[i] + " ");
        }
        return resultMass;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));

        Random rnd = new Random();
        for (int i = 0; i < sourceMass.length; i++) {
            sourceMass[i] = rnd.nextInt(20);
        }
        for (int i = 0; i < sourceMass.length; i++) {
            System.out.print(sourceMass[i] + " ");
        }
        System.out.println("");
        System.out.println("Input the element to delete");
        int a = Integer.parseInt(rdr.readLine());
        System.out.println("The result array is");
        ArrayMinusIndx(a).toString();
    }
}
