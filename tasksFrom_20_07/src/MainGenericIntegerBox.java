import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by alexei.yakushyn on 26.07.2017.
 */
public class MainGenericIntegerBox {
    public static void main(String[] args) throws IOException {
        Integer [] box = new Integer[] {5, 8, 3, 57, 0, 1, 22};
        GenericIntegerBox<Integer> intBox = new GenericIntegerBox<>(box);
        System.out.println("Sum of array elements is " + intBox.sum());
        System.out.println("Average is " + intBox.average());
        System.out.println("Size of Box is " + intBox.size());
    }
}
