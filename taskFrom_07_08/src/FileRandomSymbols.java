/**
 * Created by alexei.yakushyn on 09.08.2017.
 */
public class FileRandomSymbols {

   /* public void CreatePassword(int length) {
        String symbols = "qwerty";
        StringBuilder randString = new StringBuilder();
        int count = (int) (Math.random() * 30);
        for (int i = 0; i < count; i++)
            randString.append(symbols.charAt((int) (Math.random() * symbols.length())));

        System.out.println(randString);
    }*/

    public static void main(String[] args) {
        String symbols = "qwerty";
        StringBuilder randString = new StringBuilder();
        int count = (int) (Math.random() * 2000000);
        for (int i = 0; i < count; i++)
            randString.append(symbols.charAt((int) (Math.random() * symbols.length())));

        System.out.println(randString);
    }
}
