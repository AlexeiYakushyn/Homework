import java.util.Random;

/**
 * Created by alexei.yakushyn on 20.07.2017.
 */
public class IntegerBox {
    private static int n;
    private static int[] intBox = new int[n];

    public int setSizeofBox(int num) {
        n = num;
        return n;
    }

    public int[] fillArray(int n){
        Random rnd = new Random();
        for (int i = 0; i < intBox.length; i++){
            intBox[i] = rnd.nextInt(n);
        }
        return intBox;
    }

    public int sum() {
        int sum = 0;
        for (int i = 0; i < intBox.length; i++) {
            sum += intBox[i];
        }
        return sum;
    }

    public int size() {
        return intBox.length;
    }

    public double average() {
        return sum() / size();
    }

    public void printBox() {
        fillArray(n);
        for (int i = 0; i < intBox.length; i++) {
            System.out.print(intBox[i] + " ");
        }

    }

    @Override
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        result = (int) (PRIME * result + average());
        return result;
    }


}
