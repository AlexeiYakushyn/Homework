/**
 * Created by alexei.yakushyn on 13.09.2017.
 */
public class ThreadClass implements Runnable {



    @Override
    public void run() {
        System.out.println("Thread started work " + Thread.currentThread().getName());
        MethodClass method = new MethodClass();

        for (int i = 0; i < 50; i++) {
            method.method();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        System.out.println("Thread stopped " + Thread.currentThread().getName());
    }
}
