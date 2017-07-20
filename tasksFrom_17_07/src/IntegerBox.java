import java.util.Random;

/**
 * Created by alexei.yakushyn on 20.07.2017.
 */
public class IntegerBox {
    private static int n;
   // private static int num;

    private static int[] intBox;

    public void setSizeofBox(int num) {
        this.n = num;
        System.out.println(n);
    }

    public int[] fillArray() {
       // Random rnd = new Random();
        intBox = new int[n];
        int z;
        for (int i = 0; i < intBox.length; i++) {
            z = (int) (Math.random()* n);
            intBox[i] = z;
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
        fillArray();
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
