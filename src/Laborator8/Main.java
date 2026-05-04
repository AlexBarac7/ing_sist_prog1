package Laborator8;

import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;

import java.io.*;

public class Main {
    static void main() {

        try {
            FileInputStream file = new FileInputStream(new File("src/Laborator8/laborator8_input.xlsx"));
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(0);
            XSSFWorkbook workbook2 = new XSSFWorkbook();
            XSSFSheet sheet2 = workbook2.createSheet("Medie_aritmetica");
            int rowIndex = 0;
            int cellIndex;
            for (Row row : sheet) {
                Row row2 = sheet2.createRow(rowIndex++);
                cellIndex = 0;
                for (Cell cell : row) {
                    Cell cell2 = row2.createCell(cellIndex++);

                    switch (cell.getCellType()) {
                        case STRING:
                            cell2.setCellValue(cell.getStringCellValue());
                            System.out.print(cell.getStringCellValue() + "\t");
                            break;

                        case NUMERIC:
                            cell2.setCellValue(cell.getNumericCellValue());
                            System.out.print((int)cell.getNumericCellValue() + "\t");
                            break;
                        default:
                            cell2.setCellValue("");
                    }
                }
                System.out.println();
            }


            FileOutputStream outFile = new FileOutputStream(new File("src/Laborator8/laborator8_output2.xlsx"));
            workbook2.write(outFile);
            outFile.close();
            workbook2.close();
            workbook.close();
            file.close();
        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}