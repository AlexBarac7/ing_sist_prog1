package Laborator10.decorator;

import Laborator10.IStudentiExport;
import Laborator10.Studenti;

import java.util.List;

public class TimeExecution implements ITimeExecution {
    private IStudentiExport exporter;

    public TimeExecution(IStudentiExport exporter) {
        this.exporter = exporter;
    }

    @Override
    public long executionTime(List<Studenti> studenti) {
        long startTime = System.currentTimeMillis();
        exporter.doExport(studenti);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Execution time: " + executionTime + " ms");
        return executionTime;
    }
}
