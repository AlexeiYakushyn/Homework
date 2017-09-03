/**
 * Created by alexei.yakushyn on 03.09.2017.
 */
public class Main {
    public static void main(String[] args) {
        ConvertXMLtoJSON convertXMLtoJSON = new ConvertXMLtoJSON();

        convertXMLtoJSON.xmlToJSON();

        WriteJSON writeJSON = new WriteJSON();
        writeJSON.writeJSON();
    }
}
