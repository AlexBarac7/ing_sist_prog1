package Laborator10;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class StudentiInFisierText implements IStudentiExport{
    private String filename;
    public StudentiInFisierText(String filename){
        this.filename = filename;
    }
    @Override
    public void doExport(List<Studenti> studenti)
    {
        try (FileWriter w = new FileWriter(filename))
        {
            w.write("Studenti in fisier text" + "\n");
            for (Studenti s : studenti)
                w.write(s.toString() + "\n");
        } catch (IOException e) {
            System.out.println("Eroare");
            e.printStackTrace();
        }
    }
}
