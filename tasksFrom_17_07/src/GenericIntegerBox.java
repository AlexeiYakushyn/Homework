/**
 * Created by java2 on 24.07.17.
 */
/*public class GenericIntegerBox<T> {
    public class IntegerBox {
        private T n;
        // private static int num;

        private T intBox;

        public void setSizeofBox(T num) {
            this.n = num;
            System.out.println(n);
        }

        public T[] fillArray() {
            intBox = new T[];
            int z;
            for (int i = 0; i < intBox.length; i++) {
                z = (T) (Math.random() * n);
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
}*/
