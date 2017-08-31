/**
 * Created by alexei.yakushyn on 31.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        CreateXmlFileDOM createXmlFileDOM = new CreateXmlFileDOM();
        createXmlFileDOM.createDOMXml();

        CreateXmlFileStAX createXmlFileStAX = new CreateXmlFileStAX();
        createXmlFileStAX.createFileStAX();
    }
}
