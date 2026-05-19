package Laborator10;

import java.util.List;

public class StudentiInConsola implements IStudentiExport{
    @Override
    public void doExport(List<Studenti> students){
        students.stream().forEach(System.out::println);
    }

}
