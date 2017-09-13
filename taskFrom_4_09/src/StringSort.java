import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by alexei.yakushyn on 07.09.2017.
 */
public class StringSort implements Comparator<String> {

    public List<String> stringSort(List<String> strings) {

        List<String> wrongValue = new ArrayList<String>();
        wrongValue.add("transfer error, collection can't be null");

        if (strings == null) {
            return wrongValue;
        }

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i) == "") {
                System.out.println("Empty strings will be deleted");
                strings.remove(i);
            }
        }

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i) == null) {
                System.out.println("element can't be null!");
                strings.remove(i);
            }
        }

        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        return strings;
    }

    @Override
    public int compare(String o1, String o2) {
        return 0;
    }
}
