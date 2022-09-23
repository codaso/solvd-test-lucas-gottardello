package database.xmlparsing;

import javax.xml.XMLConstants;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.transform.stax.StAXSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.FileInputStream;

public class StaXValidation {

    public static void main(String[] args) {
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        //String pathXML = "src/main/resources/xml/player.xml";
        //String pathXSD = "src/main/resources/xml/player.xsd";

        String pathXML2 = "src/main/resources/xml/players.xml";
        String pathXSD2 = "src/main/resources/xml/players.xsd";
        try {
            XMLEventReader reader = xmlInputFactory.createXMLEventReader(new FileInputStream(pathXML2));
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema xsd = factory.newSchema(new File(pathXSD2));
            Validator validator = xsd.newValidator();
            validator.validate(new StAXSource(reader));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
