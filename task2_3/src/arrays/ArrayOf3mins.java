package arrays;

import java.util.Arrays;
import java.util.Random;
/**
 * Created by alexei.yakushyn on 06.07.2017.
 * Дан массив целых чисел (несортированный, с повторами).
 * Найти три наименьших числа в нем.
 * Возвращать массив размером 3 с этими числами.
 */

public class ArrayOf3mins {
    public static void main(String[] args) {
        int[] arrOfmins = new int[20];
        Random rnd = new Random();
        for (int i = 0; i < arrOfmins.length; i++) {
            arrOfmins[i] = rnd.nextInt(20);
        }
        for (int i = 0; i < arrOfmins.length; i++) {
            System.out.print(arrOfmins[i] + " ");
        }

        int min1 = arrOfmins[0];
        int min2 = arrOfmins[0];
        int min3 = arrOfmins[0];
        for (int i = 0; i < arrOfmins.length; i++) {
            if (arrOfmins[i] < min1) {
                min3 = min2;
                min2 = min1;
                min1 = arrOfmins[i];
            }else if (arrOfmins[i] < min2){
                min3 = min2;
                min2 = arrOfmins[i];
            }else if (arrOfmins[i]<min3){
                min3=arrOfmins[i];
            }
        }
        int[] mins = {min1, min2, min3};

        System.out.println("\nArray of 3 min elements is " + Arrays.toString(mins));
    }
}
