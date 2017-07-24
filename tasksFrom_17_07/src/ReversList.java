import java.util.*;


/**
 * Created by java2 on 24.07.17.
 */
public class ReversList {
    public static void main(String[] args) {

        List<Integer> original = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            original.add(i);
        }
        System.out.println(original);
        ReversList reversList = new ReversList();
        List<Integer> reversed = reversList.reverse(original);
        for (int i = 0; i < 10; i++) {
            reversed.add(i);
        }
        System.out.println(reversed);


    }

    public List<Integer>  reverse(List<Integer> original) {
        Collections.reverse(original);
        return original;
    }
}


