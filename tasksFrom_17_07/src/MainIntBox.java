import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by alexei.yakushyn on 20.07.2017.
 */
public class MainIntBox {

    public static void main(String[] args) throws IOException {
       //переделать на Arraylist с дженериками (<T extends Number>  .add(T a)))
        BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));
        IntegerBox integerBox1 = new IntegerBox();

        System.out.println("Lets fill our box by numbers. Enter capacity");
        int a = Integer.parseInt(rdr.readLine());
        integerBox1.setSizeofBox(a);
        System.out.println("Now our box looks like");
        integerBox1.printBox();
        System.out.println("");
        System.out.println("Now lets get sum of elements in our Box. \nAnd sum is " + integerBox1.sum());
        System.out.println("Arithmetical mean of elements in our Box size " + integerBox1.size() + " is " + integerBox1.average());

    }
}
