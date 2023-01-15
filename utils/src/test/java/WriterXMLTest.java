import org.junit.Test;
import pl.edu.agh.kis.pz1.util.JPK;
import pl.edu.agh.kis.pz1.util.WriterXML;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.IOException;

import static org.apache.commons.io.FileUtils.delete;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class WriterXMLTest {
    WriterXML writerXML = new WriterXML();

    @Test
    public void writerObjectCalled(){
        assertNotNull(writerXML);
    }

    @Test
    public void writeXMLWorksCorrectly() throws JAXBException, IOException {
        File myFile = new File("test.xml");
        JAXBContext context = JAXBContext.newInstance(JPK.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(new JPK(0), myFile);
        assertTrue(myFile.exists());
        delete(myFile);
    }
}
