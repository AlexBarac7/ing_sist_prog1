package Laborator10;

import java.util.List;

public class Exporter {
    private IStudentiExport strategyInstance;
    public void setStrategy(IStudentiExport strategyInstance){
        this.strategyInstance = strategyInstance;
    }
    void startExport(List<Studenti> students)
    {
        strategyInstance.doExport(students);
    }
}