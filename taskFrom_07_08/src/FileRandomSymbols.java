import java.io.*;

/**
 * Created by alexei.yakushyn on 09.08.2017.
 */
public class FileRandomSymbols {


    private static String testFile = "E:\\ProgrammFiles\\Homework\\Homework\\taskFrom_07_08\\src\\testFile.txt";
    File file = new File(testFile);
    private static String randomText;


    public String  randomGen() {
        String symbols = "qwerty";
        StringBuilder randString = new StringBuilder();
        int count = (int) (Math.random() * 2000000);
        for (int i = 0; i < count; i++)
            randString.append(symbols.charAt((int) (Math.random() * symbols.length())));
       return randomText = String.valueOf(randString);
    }


    public void writeInFile(String testFile, String randomText) throws IOException {

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());

            try {
                out.print(randomText);

            } finally {
                out.close();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(testFile)));
//        String test = reader.readLine();

        FileRandomSymbols rndsmbl = new FileRandomSymbols();

       rndsmbl.writeInFile(testFile, randomText);
        System.out.println(randomText);




    }
}
