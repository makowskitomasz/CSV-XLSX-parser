package pl.edu.agh.kis.pz1;

import pl.edu.agh.kis.pz1.util.WriterXML;

/**
 * @author tomaszmakowski
 * @version 1.0
 *
 */
public class Main {

    /**
     * @param args
     * main method of program that chooses the type of reader and writes a xml file
     */
    public static void main(String[] args) {
        String fileName = "billFromCSV.xml";
        int fileType = 1;
        WriterXML writerXML = new WriterXML();
        writerXML.writeXML(fileType, fileName, "faktury-sprzedazowe-test-2023.csv");

    }
}
