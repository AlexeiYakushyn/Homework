import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static java.lang.Integer.*;
import static java.lang.Integer.parseInt;
import static java.util.Arrays.*;

/**
 * Created by alexei.yakushyn on 26.07.2017.
 */
// Найти в коллекции все пары чисел, сумма которых равна заданному числу

public class NumberPairs {

    public void findPair(ArrayList<Integer> mass, int sum) {
        Collections.sort(mass);

        System.out.println(mass);
        int first = 0;
        int last = mass.size() - 1;

        while (mass.get(first) < mass.get(last)) {
            int s = mass.get(first) + mass.get(last);
            if (s == sum) {
                System.out.println(mass.get(first) + " " + mass.get(last));
                first++;
                last--;
            } else {
                if (s < sum) first++;
                last--;
            }
        }
    }
}


