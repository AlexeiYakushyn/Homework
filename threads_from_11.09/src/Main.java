/**
 * Created by alexei.yakushyn on 13.09.2017.
 */
public class Main {
    public static void main(String[] args) {

        ThreadClass thread1 = new ThreadClass();
        ThreadClass thread2 = new ThreadClass();
        new Thread(thread1, "Thread1").start();

        new Thread(thread2, "Thread2").start();
    }
}
