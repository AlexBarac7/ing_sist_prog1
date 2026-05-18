package Laborator10;

import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;

import java.io.*;
import java.util.List;

public class StudentiInFisierXlsx implements IStudentiExport {
    private String filename;
    public StudentiInFisierXlsx(String filename) {
        this.filename = filename;
    }
    @Override
    public void doExport(List<Studenti> studenti) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Studenti");
        int rowIndex = 0;
        Row header = sheet.createRow(rowIndex++);
        header.createCell(0).setCellValue("Prenume");
        header.createCell(1).setCellValue("Nume");
        header.createCell(2).setCellValue("Grupa");
        header.createCell(3).setCellValue("ID");
        for (Studenti s : studenti) {
            Row row = sheet.createRow(rowIndex++);
            row.createCell(0).setCellValue(s.getPrenume());
            row.createCell(1).setCellValue(s.getNume());
            row.createCell(2).setCellValue(s.getFormatieDeStudiu());
            row.createCell(3).setCellValue(s.getNrMatricol());
        }
        try (FileOutputStream file = new FileOutputStream(filename)) {

            workbook.write(file);
            workbook.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}