package Laborator10;

import java.util.List;

public class StudentiInConsola implements IStudentiExport{
    @Override
    public void doExport(List<Studenti> students){
        for (Studenti s : students)
            System.out.println(s);

    }

}
