package database.xmlparsing.streamwriter;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.ByteArrayOutputStream;
import java.io.StringReader;
import java.io.StringWriter;

public class DriverXMLWriter {
    public static String indentationXML(int indentation, String rawxml) throws TransformerException {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        transformerFactory.setAttribute("indent-number", indentation);
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        StreamResult streamResult = new StreamResult(new StringWriter());
        transformer.transform(new StreamSource(new StringReader(rawxml)), streamResult);

        return streamResult.getWriter().toString();
    }

    public static void main(String[] args) throws XMLStreamException, TransformerException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        XMLStreamWriter xmlSW = (XMLOutputFactory.newInstance()).createXMLStreamWriter(byteArrayOutputStream);
        (new XMLStreamWriterHandler()).writeXML(xmlSW);
        System.out.println(indentationXML(4, byteArrayOutputStream.toString()));
    }
}
