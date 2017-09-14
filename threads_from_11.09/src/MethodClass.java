/**
 * Created by alexei.yakushyn on 13.09.2017.
 */
public class MethodClass {

    private int count = 0;

    public int getCount() {
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void method() {
        count++;
        System.out.println("Count equals: " + count);
    }
}
