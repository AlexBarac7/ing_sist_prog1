package Laborator10;

import java.util.Arrays;
import java.util.List;

public class AplicatieCuStrategy {
    static void main() {
        List<Studenti> studenti = Arrays.asList(
                new Studenti(1025,"Andrei","Popa","ISM141/2", 8.70),
                new Studenti(1024,"Ioan","Mihalcea","ISM141/1", 10),
                new Studenti(1026,"Anamaria","Prodan","TI131/1", 8.90),
                new Studenti(1029,"Bianca","Popescu","TI131/1,", 10),
                new Studenti(1029,"Maria","Pana","TI131/2,", 4.10),
                new Studenti(1029,"Gabriela","Mohanu","TI131/2,", 7.33),
                new Studenti(1029,"Marius","Nasta","TI131/2,", 3.20),
                new Studenti(1029,"Marius","Nasta","TI131/1,", 5.12),
                new Studenti(1029,"Andrei","Dobrescu","TI131/2,", 2.22)
        );
        //a
        IStudentiExport strategyConsole = new StudentiInConsola();
        Exporter exporter = new Exporter();
        System.out.println("Studenti afisati in consola");
        exporter.setStrategy(strategyConsole);
        exporter.startExport(studenti);

        //b
        String TxtFileName = "src/Laborator10/studentiStrategyText.txt";
        StudentiInFisierText strategyFisierText = new StudentiInFisierText(TxtFileName);
        exporter.setStrategy(strategyFisierText);
        exporter.startExport(studenti);

        //c
        String ExcelFileName = "src/Laborator10/studentiStrategyExcel.xlsx";
        StudentiInFisierXlsx strategyFisierExcel = new StudentiInFisierXlsx(ExcelFileName);
        exporter.setStrategy(strategyFisierExcel);
        exporter.startExport(studenti);

        //d
        StudentiDinFisierText IStrategyText = new StudentiDinFisierText();
        Importer importer = new Importer();
        importer.startImport(IStrategyText, TxtFileName);

        //e
        System.out.println("Studenti importati din fisierul Excel");
        StudentiDinFisierXlsx IStrategyExcel = new StudentiDinFisierXlsx();
        importer.startImport(IStrategyExcel, ExcelFileName);
    }
}
