import java.util.ArrayList;

/**
 * Created by alexei.yakushyn on 02.08.2017.
 */
public class MainListMerger {


    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> result;

        double x;
        for (int i = 0; i < 5; i++) {
            x = Math.random() * 100;
            list1.add((int) x);
        }
        for (int i = 0; i < 5; i++) {
            x = Math.random() * 100;
            list2.add((int) x);
        }
        System.out.println(list1);
        System.out.println(list2);

        ListMerger merger = new ListMerger(list1, list2);

        result = merger.newList(list1, list2);

        System.out.println(result);
    }
}

