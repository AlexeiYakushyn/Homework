import java.io.*;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

/**
 * Created by alexei.yakushyn on 30.08.2017.
 */

public class CreateXmlFileStAX {

    public void createFileStAX() {

        try {
            StringWriter stringWriter = new StringWriter();

            XMLOutputFactory xMLOutputFactory = XMLOutputFactory.newInstance();
            XMLStreamWriter xMLStreamWriter = xMLOutputFactory.createXMLStreamWriter(stringWriter);

            xMLStreamWriter.writeStartDocument();
            xMLStreamWriter.writeStartElement("Cars");

            xMLStreamWriter.writeStartElement("car");
            xMLStreamWriter.writeAttribute("Make","Ford");
            xMLStreamWriter.writeAttribute("Model","Fiesta");

            xMLStreamWriter.writeStartElement("Seats");
            xMLStreamWriter.writeCharacters("4");
            xMLStreamWriter.writeEndElement();

            xMLStreamWriter.writeStartElement("Interior");
            xMLStreamWriter.writeCharacters("Cloth");
            xMLStreamWriter.writeEndElement();

            xMLStreamWriter.writeStartElement("car1");
            xMLStreamWriter.writeAttribute("Make","Porsche");
            xMLStreamWriter.writeAttribute("Model","911");

            xMLStreamWriter.writeStartElement("Seats");
            xMLStreamWriter.writeCharacters("2");
            xMLStreamWriter.writeEndElement();

            xMLStreamWriter.writeStartElement("Interior");
            xMLStreamWriter.writeCharacters("Leaser");
            xMLStreamWriter.writeEndElement();

            xMLStreamWriter.writeEndElement();
            xMLStreamWriter.writeEndDocument();

            xMLStreamWriter.flush();
            xMLStreamWriter.close();

            File file = new File("E:\\ProgrammFiles\\hillel\\Homework\\xml_parsers\\carsStAX.xml");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));

            String xmlString = stringWriter.getBuffer().toString();

            writer.write(xmlString);

            writer.close();
            stringWriter.close();

        } catch (XMLStreamException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
