import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by alexei.yakushyn on 20.07.2017.
 */
public class MainIntBox {

    public static void main(String[] args) throws IOException {
        BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));
        IntegerBox integerBox1 = new IntegerBox();

        System.out.println("Lets fill our box by numbers. Enter capacity");
        int a = Integer.parseInt(rdr.readLine());
        integerBox1.setSizeofBox(a);
        System.out.println("Now our box looks like");
        //integerBox1.setSizeofBox();
        integerBox1.printBox();

    }
}
