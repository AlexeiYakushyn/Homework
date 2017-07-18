/**
 * Created by alexei.yakushyn on 18.07.2017.
 */
public class LongestWord {
    public static void main(String[] args) {
        String longestWord = "";
        for (int i = 0; i < args.length; i++) {
            if (args[i].length() > longestWord.length()) {
                longestWord = args[i];
            }
        }
        System.out.println("Longest word is " + longestWord);
    }
}

