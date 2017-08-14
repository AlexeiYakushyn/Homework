import java.io.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by alexei.yakushyn on 13.08.2017.
 */

public class ReadWriteRandomSymbls {

    public static final String FILENAME = "E:\\ProgrammFiles\\Homework\\Homework\\taskFrom_07_08\\src\\testFile.txt";

    public static void main(String[] args) throws IOException {

        ArrayList<Character> rndmSmbls = new ArrayList<>();

        Random rndm = new Random();

        String smbls = "0123456789abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < 2000000; i++) {
            rndmSmbls.add(smbls.charAt(rndm.nextInt(smbls.length())));
        }

       // System.out.println(rndmSmbls);

        BufferedReader file = new BufferedReader(new FileReader(FILENAME));
        BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME));

        if (!FILENAME.isEmpty()) {
            for (int i = 0; i < rndmSmbls.size(); i++) {
                char str = rndmSmbls.get(i);
                writer.write(str);

            }
            writer.flush();
            writer.close();
            file.close();
        }

        long startFR, endFR;

        startFR = System.nanoTime();
        try (FileReader reader = new FileReader(FILENAME)) {
            int c;
            while ((c = reader.read()) != -1) {

               // System.out.print((char) c);

            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        endFR = System.nanoTime();

        System.out.println("FileReader speed is " + (endFR - startFR) + " nanoSec");

        long startBFR, endBFR;
        startBFR = System.nanoTime();
        try (BufferedReader file1 = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            while ((line = file.readLine()) != null) {
               // System.out.println();
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        endBFR = System.nanoTime();
        System.out.println("BufferedReader speed is " + (endBFR - startBFR) + " nanoSec");
    }
}
