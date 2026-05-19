package Laborator10.decorator;

import Laborator10.IStudentiExport;
import Laborator10.Studenti;

import java.util.List;

public class TimeExecutionDecorator extends TimeExecution{
    private List<Studenti> studenti;
    public TimeExecutionDecorator(IStudentiExport exporter, List<Studenti> studenti){
        super(exporter);
        this.studenti = studenti;
    }

    public long executionTime() {
        long execTime = super.executionTime(studenti);
        return execTime;
    }
}
