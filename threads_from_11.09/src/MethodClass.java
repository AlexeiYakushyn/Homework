/**
 * Created by alexei.yakushyn on 13.09.2017.
 */
public class MethodClass {

    public static int count = 0;

//    public int getCount() {
//        return this.count;
//    }

    public void method() {
        count++;
        System.out.println("Count equals: " + count);
    }
}
