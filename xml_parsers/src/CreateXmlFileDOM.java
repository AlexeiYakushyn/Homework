import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.io.File;

/**
 * Created by alexei.yakushyn on 30.08.2017.
 */

public class CreateXmlFileDOM {

    public void createDOMXml() {

        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();

            // root element
            Element rootElement = doc.createElement("trucks");
            doc.appendChild(rootElement);

            // superTruck element
            Element superWeightTruck = doc.createElement("superWeightTruck");
            rootElement.appendChild(superWeightTruck);

            // setting attribute
            Attr attr = doc.createAttribute("weightClass");
            attr.setValue("Really Huge");
            superWeightTruck.setAttributeNode(attr);

            // truck element
            Element truckName = doc.createElement("truckName");
            Attr attrType = doc.createAttribute("type");
            attrType.setValue("Cement Truck");
            truckName.setAttributeNode(attrType);
            truckName.appendChild(doc.createTextNode("Kayaba Rocket"));
            superWeightTruck.appendChild(truckName);

            Element truckName1 = doc.createElement("truckName");
            Attr attrType1 = doc.createAttribute("type");
            attrType1.setValue("Truck Tractor");
            truckName1.setAttributeNode(attrType1);
            truckName1.appendChild(doc.createTextNode("Peterbilt 386"));
            superWeightTruck.appendChild(truckName1);

            Element truckName2 = doc.createElement("truckName");
            Attr attrType2 = doc.createAttribute("type");
            attrType2.setValue("Dump Truck");
            truckName2.setAttributeNode(attrType2);
            truckName2.appendChild(doc.createTextNode("Belaz 75710"));
            superWeightTruck.appendChild(truckName2);

            Element truckName3 = doc.createElement("truckName");
            Attr attrType3 = doc.createAttribute("type");
            attrType3.setValue("Sleeper Cab");
            truckName3.setAttributeNode(attrType3);
            truckName3.appendChild(doc.createTextNode("New Cascadia"));
            superWeightTruck.appendChild(truckName3);

            // write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("E:\\ProgrammFiles\\hillel\\Homework\\xml_parsers\\trucksDOM.xml"));
            transformer.transform(source, result);


        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }
}
