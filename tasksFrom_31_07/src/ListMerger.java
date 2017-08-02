import java.util.*;

/**
 * Created by alexei.yakushyn on 02.08.2017.
 */
public class ListMerger {

    private ArrayList<Integer> result;

//    public ArrayList<Integer> ListMerger() {
//        return this.result;
//    }

    public ArrayList<Integer> newList(List listA, List listB) {

        if (listA == null) {
            throw new NullPointerException("List a is null");
        }
        if (listB == null) {
            throw new NullPointerException("List b is null");
        }
        if (listA.isEmpty()) {
            return new ArrayList<>(listA);
        } else if (listB.isEmpty()) {
            return new ArrayList<>(listB);
        } else {
           this.result = new ArrayList<>(listA.size() + listB.size());
            for (int i = 0; i < result.size(); i++) {
                if ((result.get(i) % 2) == 0) {
                    result.add(result.indexOf(listA));
                } else {
                    result.add(result.indexOf(listB));
                }
            }
            return result;
        }
    }
}
