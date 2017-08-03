import java.util.ArrayList;

public class MainNumberPairs {
    public static void main(String[] args) {
        ArrayList<Integer> mass = new ArrayList<>(10);
        mass.add(5);
        mass.add(3);
        mass.add(2);
        mass.add(6);
        mass.add(4);
        mass.add(0);
        mass.add(8);
        mass.add(7);
        mass.add(1);
        mass.add(9);
        System.out.println(mass);
        NumberPairs pairs = new NumberPairs();
        pairs.findPair(mass, 9);
    }
}
