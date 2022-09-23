package database.xmlparsing.streamwriter;

import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

public class XMLStreamWriterHandler {
    String[][] tutorial = {{"factory method", "abstract factory"}, {"introduction to JMS", "point to point"}};

    public void writeXML(XMLStreamWriter xmlSW) throws XMLStreamException {
        xmlSW.writeStartDocument("1.0");
        //
        xmlSW.writeStartElement("channel");
        xmlSW.writeAttribute("name", "someAttribute");
        //populateTopic
        populateTopic(xmlSW, "Object Oriented Design Patterns", tutorial[0]);
        populateTopic(xmlSW, "Java Message Service", tutorial[1]);
        xmlSW.writeEndElement();
        //
        xmlSW.writeEndDocument();
        xmlSW.flush();
    }

    public void populateTopic(XMLStreamWriter xmlSW, String topic, String[] tutorial) throws XMLStreamException {
        xmlSW.writeStartElement("topic");
        xmlSW.writeAttribute("name", topic);
        int i = 0;
        while (i < tutorial.length) {
            xmlSW.writeStartElement("tutorial");
            xmlSW.writeCharacters(tutorial[i++]);
            xmlSW.writeEndElement();
        }
        xmlSW.writeEndElement();
    }
}
