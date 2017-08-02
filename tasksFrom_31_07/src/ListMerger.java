import java.util.*;

/**
 * Created by alexei.yakushyn on 02.08.2017.
 */
public class ListMerger {
    public ArrayList<Integer> result;

    public ListMerger(ArrayList<Integer> listA, ArrayList<Integer> listB) {
        this.newList(listA, listB);
    }


    public ArrayList newList(List listA, List listB) {


        ArrayList<Integer> result = new ArrayList<>(listA.size() + listB.size());

        if (listA == null) {
            throw new NullPointerException("listA is null");
        }
        if (listB == null) {
            throw new NullPointerException("listB is null");
        }
        if (listA.isEmpty()) {
            return new ArrayList<Integer>(listB);
        } else if (listB.isEmpty()) {
            return new ArrayList<Integer>(listA);
        } else {
            for (int i = 0; i < result.size(); i++) {
                if ((result.get(i) % 2) == 0) {
                    result.addAll(listA);
                } else {
                    result.addAll(listB);
                }
            }
            return result;
        }
    }
}

