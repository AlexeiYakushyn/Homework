import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Integer.*;
import static java.lang.Integer.parseInt;

/**
 * Created by alexei.yakushyn on 26.07.2017.
 */
// Найти в коллекции все пары чисел, сумма которых равна заданному числу

public class NumberPairs {

    public void findPair(ArrayList<Integer> list, int sum) {
        ArrayList<Integer> mass = new ArrayList<>();
        Arrays.sort(new ArrayList[]{list});

        int first = 0;
        int last = list.size() - 1;

        while (list.get(first) < list.get(last)) {
            int s = list.get(first) + list.get(last);
            if (s == sum) {
                System.out.println(list.get(first) + " " + list.get(last));
                first++;
                last--;
            } else {
                if (s < sum) first++;
                else last--;
            }
        }
        System.out.println(first + " " + last);
    }
}


