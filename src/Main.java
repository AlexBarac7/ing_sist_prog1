import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;

import java.io.*;

public void writeToXls(Set<Student> studenti, String fileName) {

    try {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Studenti");
        int rowIndex = 0;
        Row header = sheet.createRow(rowIndex++);
        header.createCell(0).setCellValue("ID");
        header.createCell(1).setCellValue("Nume");
        header.createCell(2).setCellValue("Prenume");
        header.createCell(3).setCellValue("Grupa");
        for (Student s : studenti) {
            Row row = sheet.createRow(rowIndex++);
            row.createCell(0).setCellValue(s.getNrMatricol());
            row.createCell(1).setCellValue(s.getNume());
            row.createCell(2).setCellValue(s.getPrenume());
            row.createCell(3).setCellValue(s.getFormatieDeStudiu());
        }

        FileOutputStream out = new FileOutputStream(fileName);
        workbook.write(out);
        out.close();
        workbook.close();
    }
    catch (Exception e) {
        e.printStackTrace();
    }
}

public List<Student> readFromXls(String fileName) {

    List<Student> lista = new ArrayList<>();

    try {
        FileInputStream file = new FileInputStream(fileName);
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(0);
        int rowIndex = 0;
        for (Row row : sheet) {
            if (rowIndex == 0)
                rowIndex++;
            else
            {
                int id = (int) row.getCell(0).getNumericCellValue();
                String nume = row.getCell(1).getStringCellValue();
                String prenume = row.getCell(2).getStringCellValue();
                String formatieDeStudiu = row.getCell(3).getStringCellValue();
                lista.add(new Student(id, nume, prenume, formatieDeStudiu));
                rowIndex++;
            }
        }

        workbook.close();
        file.close();

    } catch (Exception e) {
        e.printStackTrace();
    }
    return lista;
}

void main() {
    /* List<StudentiBursieri> bursieri = new ArrayList<>();
    bursieri.add(new StudentiBursieri(1025,"Andrei","Popa","ISM141/2", 8.70, 725.50));
    bursieri.add( new StudentiBursieri(1024,"Ioan","Mihalcea","ISM141/1", 9.80, 801.10));
    bursieri.add( new StudentiBursieri(1026,"Anamaria","Prodan","TI131/1", 8.90, 745.50));
    bursieri.add( new StudentiBursieri(1029,"Bianca","Popescu","TI131/1,", 9.10, 780.80));
    try{
        FileWriter fw = new FileWriter("bursieri_out.txt");
        fw.write(bursieri.toString());
        fw.close();
    }
    catch (IOException e) {
        e.printStackTrace();
    }
    */
    //4.a
    Set<Student> studenti = new HashSet<>();
    studenti.add(new Student(1024, "Ioan", "Mihalcea", "ISM141/1"));
    studenti.add(new Student(1025, "Andrei", "Popa", "ISM141/2"));
    studenti.add(new Student(1026, "Anamaria", "Prodan", "TI131/1"));
    studenti.add(new Student(1029, "Bianca", "Popescu", "TI131/1"));
    String xlsFileName = "src/laborator8_students.xlsx";
    writeToXls(studenti, xlsFileName);

    //4.b
    List<Student> studentsFromXls = readFromXls(xlsFileName);
    System.out.println("\nStudenti cititi din xlsx:");
    for(Student st: studentsFromXls) {
        System.out.print(st);
    }
}

