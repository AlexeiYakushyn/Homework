import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

import java.io.*;

/**
 * Created by alexei.yakushyn on 03.09.2017.
 */
public class ConvertXMLtoJSON {

    public static final int PRETTY_PRINT_INDENT_FACTOR = 4;
    public static final String TEST_XML_STRING = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n" +
            "<trucks>\n" +
            "    <superWeightTruck weightClass=\"Really Huge\">\n" +
            "        <truckName type=\"Cement Truck\">Kayaba Rocket</truckName>\n" +
            "        <truckName type=\"Truck Tractor\">Peterbilt 386</truckName>\n" +
            "        <truckName type=\"Dump Truck\">Belaz 75710</truckName>\n" +
            "        <truckName type=\"Sleeper Cab\">New Cascadia</truckName>\n" +
            "    </superWeightTruck>\n" +
            "</trucks>";

    public void xmlToJSON() {

        try {
            JSONObject xmlJSONObject = XML.toJSONObject(TEST_XML_STRING);
            String jsonPrettyPrintString = xmlJSONObject.toString(PRETTY_PRINT_INDENT_FACTOR);

            File file = new File("E:\\ProgrammFiles\\hillel\\Homework\\jSONwriteRead\\src\\trucksJSON_test.json");
            ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(file));

            stream.writeObject(jsonPrettyPrintString);

        } catch (JSONException je) {
            System.out.println(je.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
