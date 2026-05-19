package Laborator10;

import Laborator10.decorator.TimeExecutionDecorator;

import java.util.Arrays;
import java.util.List;

public class AplicatieCuDecorator {
    static void main(String[] args) {
        List<Studenti> studentiCuNote = Arrays.asList(
                new Studenti(1024,"Ioan","Mihalcea","ISM141/1", 10),
                new Studenti(1026,"Anamaria","Prodan","TI131/1", 8.90),
                new Studenti(1029,"Bianca","Popescu","TI131/1,", 10),
                new Studenti(1029,"Maria","Pana","TI131/2,", 4.10),
                new Studenti(1029,"Gabriela","Mohanu","TI131/2,", 7.33),
                new Studenti(1029,"Marius","Nasta","TI131/2,", 3.20),
                new Studenti(1029,"Marius","Nasta","TI131/1,", 5.12),
                new Studenti(1029,"Andrei","Dobrescu","TI131/2,", 2.22)
        );
        List<IStudentiExport> strategies = Arrays.asList(
                new StudentiInConsola(),
                new StudentiInFisierText("studentiStrategyText.txt"),
                new StudentiInFisierXlsx("studentiStrategyExcel.xlsx")
        );
        for (IStudentiExport strategy : strategies) {
            TimeExecutionDecorator decorator = new TimeExecutionDecorator(strategy, studentiCuNote);
            long time = decorator.executionTime();
           // System.out.println("Execution time: " + time + " ms for " + strategy);

        }
    }
}
