package Laborator10;

import java.util.List;

public class Exporter {
    void startExport(IStudentiExport strategyInstance, List<Studenti> students)
    {
        strategyInstance.doExport(students);
    }
}