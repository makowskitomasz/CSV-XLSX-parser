package pl.edu.agh.kis.pz1.util;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ReaderXLSX {

    public List<Bill> bills = new ArrayList<>();
    public List<FakturaWiersz> fakturaWierszList = new ArrayList<>();
    public void parserOfXLSX(){
        try{
            String P_3A, P_3B, P_5B, P_1, P_6,P_2A, P_2B, P_12, P_9B;
            BigDecimal P_13_1, P_14_1, P_15, P_8B, P_9A, P_11;
            int counter = 0;
            FileInputStream file = new FileInputStream("/home/tomaszmakowski/ProgramowanieZaawansowane/Projekt3/faktury-sprzedazowe-test-2023.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet) {
                if(counter == 0){
                    counter += 1;
                    continue;
                }
                P_3A = String.valueOf(row.getCell(0));
                P_3B = String.valueOf(row.getCell(1));
                P_5B = String.valueOf(row.getCell(2));
                P_1 = String.valueOf(row.getCell(3));
                P_6 = String.valueOf(row.getCell(4));
                P_2A = String.valueOf(row.getCell(5));
                P_13_1 = BigDecimal.valueOf(row.getCell(8).getNumericCellValue());
                P_14_1 = BigDecimal.valueOf(row.getCell(9).getNumericCellValue());
                P_15 = BigDecimal.valueOf(row.getCell(10).getNumericCellValue());
                P_2B = String.valueOf(row.getCell(5));
                P_12 = String.valueOf(row.getCell(9));
                P_8B = BigDecimal.valueOf(row.getCell(7).getNumericCellValue());
                P_9A = BigDecimal.valueOf(row.getCell(8).getNumericCellValue());
                P_11 = BigDecimal.valueOf(row.getCell(13).getNumericCellValue());
                P_9B = String.valueOf(row.getCell(12));
                bills.add(new Bill(P_3A, P_3B, P_5B, P_1, P_6, P_2A, P_13_1, P_14_1, P_15));
                fakturaWierszList.add(new FakturaWiersz(P_2B, P_12, P_8B, P_9A, P_9B, P_11));
            }
            file.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}
