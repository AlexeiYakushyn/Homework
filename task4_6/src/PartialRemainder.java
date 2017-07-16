import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by alexei.yakushyn on 7/16/17.
 */
public class PartialRemainder {
    public static void main(String[] args) throws IOException {
        BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input the dividend a");
        int a = Integer.parseInt(rdr.readLine());
        System.out.println("Input the divider b");
        int b = Integer.parseInt(rdr.readLine());

        int partial = a;
        int remainder = 0;
        while (partial > b){
            partial = partial - b;
            remainder++;
        }
        System.out.println("The quotient of a divided by b is " + remainder);
        System.out.println("The remainder of dividing a by b is " + partial);
    }
}
