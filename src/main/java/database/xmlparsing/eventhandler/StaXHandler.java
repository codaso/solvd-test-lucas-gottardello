package database.xmlparsing.eventhandler;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class StaXHandler {
    public StringBuffer processXMLFile(File xmlFile) throws FileNotFoundException, XMLStreamException {
        //stringbuffer is like a string, but thread safe
        StringBuffer rawXML = new StringBuffer();
        //create an event reader out of an inputStream of a file
        XMLEventReader xmlEventReader = XMLInputFactory.newInstance().createXMLEventReader(new FileInputStream(xmlFile));
        XMLEvent event = null;
        Characters characters = null;
        while (xmlEventReader.hasNext()) {
            event = xmlEventReader.nextEvent();
            switch (event.getEventType()) {
                case XMLStreamConstants.START_ELEMENT: {
                    rawXML.append("<" + ((StartElement) event).getName().getLocalPart() + ">");
                    break;
                }
                case XMLStreamConstants.CHARACTERS: {
                    characters = ((Characters) event);
                    if (!characters.isWhiteSpace() || characters.isIgnorableWhiteSpace()) {
                        rawXML.append(characters.getData());
                    }
                    break;
                }
                case XMLStreamConstants.END_ELEMENT: {
                    rawXML.append("</" + ((EndElement) event).getName().getLocalPart() + ">");
                    break;
                }

            }
        }
        return rawXML;
    }
}
