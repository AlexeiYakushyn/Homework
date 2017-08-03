import java.util.*;

/**
 * Created by alexei.yakushyn on 02.08.2017.
 */

public class ListMerger {

    public ListMerger(ArrayList<Integer> listA, ArrayList<Integer> listB) {
        this.newList(listA, listB);
    }

    public ArrayList<Integer> newList(List listA, List listB) {


        ArrayList<Integer> result = new ArrayList<>();

        if (listA == null) {                                    // from here
            throw new NullPointerException("listA is null");
        }
        if (listB == null) {
            throw new NullPointerException("listB is null");
        }
        if (listA.isEmpty()) {

            return new ArrayList<Integer>(listB);

        } else if (listB.isEmpty()) {

            return new ArrayList<Integer>(listA);               // to here, found this block on StackOverFlow;

        } else {

            for (int i = 0; i < listA.size(); i++) {

                result.add((Integer) listA.get(i));
                result.add((Integer) listB.get(i));
            }
        }
        return result;
    }
}

