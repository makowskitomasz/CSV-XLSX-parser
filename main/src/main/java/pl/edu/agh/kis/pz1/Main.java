package pl.edu.agh.kis.pz1;

import pl.edu.agh.kis.pz1.util.ReaderCSV;
import pl.edu.agh.kis.pz1.util.WriterXML;

public class Main {
    public static void main(String[] args) {
        String fileName = "billFromXLSX.xml";
        int fileType = 0;
        WriterXML writerXML = new WriterXML();
        writerXML.writeXML(fileType, fileName);

    }
}
