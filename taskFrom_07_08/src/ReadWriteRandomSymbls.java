import java.io.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by alexei.yakushyn on 13.08.2017.
 */

public class ReadWriteRandomSymbls {

    public static final String FILENAME = "D:\\myjava\\homework7\\Homework\\taskFrom_07_08\\src\\testFile.txt";

    public static void main(String[] args) throws IOException {

        ArrayList<Character> rndmSmbls = new ArrayList<>();

        Random rndm = new Random();

        String smbls = "0123456789abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < 2000000; i++) {
            rndmSmbls.add(smbls.charAt(rndm.nextInt(smbls.length())));
        }

        System.out.println(rndmSmbls);

        BufferedReader file = new BufferedReader(new FileReader(FILENAME));
        if (!FILENAME.isEmpty()) {
            BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME));
            for (int i = 0; i < rndmSmbls.size(); i++) {
                char str = rndmSmbls.get(i);
                writer.write(str);

            }
            writer.flush();
            writer.close();
            file.close();
        }
    }
}
