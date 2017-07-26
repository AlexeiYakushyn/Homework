import static java.lang.reflect.Array.newInstance;

/**
 * Created by java2 on 24.07.17.
 */

// Переписать контейнер для чисел из прошлого задания на java generics.

public class GenericIntegerBox<T extends Number> {

        private T n;

        private T[] intBox;

        GenericIntegerBox(T[] m){
            this.intBox = m;
        }

        public T setSizeofBox(T num) {
            this.n = num;
            System.out.println(n);
            return n;
        }

      /*  public int[] fillArray() {
            intBox = new T[(int) n];
            int z;
            for (int i = 0; i < intBox.length; i++) {
                z = (int) (Math.random() * (int)n);
                intBox[i] = z;
            }
            return intBox;
        }
*/
        public int sum() {
            int sum = 0;
            for (int i = 0; i < intBox.length; i++) {
               // sum += intBox[i];
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
            //fillArray();
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
