import org.json.simple.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.util.HashMap;

/**
 * Created by alexei.yakushyn on 03.09.2017.
 */
public class WriteJSON {

    public void writeJSON() {

        JSONObject jsonObject = new JSONObject();

        HashMap type = new HashMap();
        type.put("type", "Cement Truck");
        type.put("content", "Kayaba Rocket");
        HashMap type1 = new HashMap();
        type1.put("type", "Truck Tractor");
        type1.put("content", "Peterbilt 386");
        HashMap type2 = new HashMap();
        type2.put("type", "Dump Truck");
        type2.put("content", "Belaz 75710");
        HashMap type3 = new HashMap();
        type3.put("type", "Sleeper Cab");
        type3.put("content", "New Cascadia");

        JSONArray truckName = new JSONArray();
        truckName.add(type);
        truckName.add(type1);
        truckName.add(type2);
        truckName.add(type3);

        jsonObject.put("trucks", new JSONObject()
                .put("superWeightTruck", new JSONObject()
                        .put("weightClass", "Really Huge")
                        .put("truckName", truckName))
        );

        File file = new File("D:\\myjava\\com.hillel.core\\Homework\\jSONwriteRead\\src\\trucksJSON.json");

        try {

            ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(file));
            stream.writeObject(jsonObject.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

