import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by alexei.yakushyn on 26.07.2017.
 */
public class MainThirdElementFromEnd {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);

        for (int i = 0; i < 10; i++) {
            list.add(i);
            System.out.print(list.get(i) + " ");
        }

       // System.out.println(list.size());

        Iterator<Integer> itrtr = list.iterator();
        ThirdElementFromEnd element = new ThirdElementFromEnd(itrtr);
        System.out.println("Third element from end is " + element.getThirdElementFromTheEnd(list));

    }
}
