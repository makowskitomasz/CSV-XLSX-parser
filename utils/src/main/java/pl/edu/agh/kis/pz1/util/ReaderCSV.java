package pl.edu.agh.kis.pz1.util;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.Reader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class ReaderCSV {

    public List<Bill> bills = new ArrayList<>();
    public List<FakturaWiersz> fakturaWierszList = new ArrayList<>();

    public BigDecimal stringToDecimal(String value){
        value = value.replace(",", ".");
        value = value.replace("zł", "");
        value = value.replaceAll("\u00A0", "");
        value = value.trim();
        return new BigDecimal(value);
    }
    public void parserOfCSV(){
        try{
            String P_3A, P_3B, P_5B, P_1, P_6,P_2A, P_2B, P_12, tmp, P_9B;
            BigDecimal P_13_1, P_14_1, P_15, P_8B, P_9A, P_11;
            Reader in = new FileReader("/home/tomaszmakowski/ProgramowanieZaawansowane/Projekt3/faktury-sprzedazowe-test-2023.csv");
            Iterable<CSVRecord> records = CSVFormat.EXCEL.withDelimiter('\t').parse(in);
            int counter = 0;
            for (CSVRecord record : records) {
                if(counter == 0){
                    counter += 1;
                    continue;
                }
                P_3A = record.get(0);
                P_3B = record.get(1);
                P_5B = record.get(2);
                P_1 = record.get(3);
                P_6 = record.get(3);
                P_2A = record.get(5);
                P_13_1 = stringToDecimal(record.get(8));
                P_14_1 = stringToDecimal(record.get(9));
                P_15 = stringToDecimal(record.get(10));
                P_2B = record.get(5);
                P_12 = record.get(9);
                P_8B = stringToDecimal(record.get(7));
                P_9A = stringToDecimal(record.get(8));
                P_11 = stringToDecimal(record.get(13));
                P_9B = record.get(2);
                bills.add(new Bill(P_3A, P_3B, P_5B, P_1, P_6, P_2A, P_13_1, P_14_1, P_15));
                fakturaWierszList.add(new FakturaWiersz(P_2B, P_12, P_8B, P_9A, P_9B, P_11));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}