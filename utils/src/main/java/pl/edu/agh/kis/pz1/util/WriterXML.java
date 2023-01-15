package pl.edu.agh.kis.pz1.util;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;

public class WriterXML {
    public void writeXML(int i, String fileName){
        try{
            File myFile = new File(fileName);
            JAXBContext context = JAXBContext.newInstance(JPK.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(new JPK(i), myFile);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
