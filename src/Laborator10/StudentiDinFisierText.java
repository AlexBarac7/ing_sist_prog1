package Laborator10;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class StudentiDinFisierText implements IStudentiImport{
    @Override
    public void doImport(String f)
    {
        File file = new File(f);
        try (Scanner sc = new Scanner(file)){
            while (sc.hasNextLine())
            {
                String line = sc.nextLine();
                System.out.println(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
