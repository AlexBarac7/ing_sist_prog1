package Laborator3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lab3 {
    public static void main(String[] args) {
        File file =  new File("in.txt");
        List<String> lista_linii = new ArrayList<>();
        List<String> lista_puncte = new ArrayList<>();
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] linii = line.split("\n");
                String[] puncte = line.split("\\.");
                for (String l : linii)
                    lista_linii.add(l);
                for (String p : puncte) {
                    lista_puncte.add(p);
                }
            }
            for (String s1 : lista_linii){
                String nou1 = s1 + "\n";
                System.out.print(nou1);
            }
            for (String s2 : lista_puncte){
                String nou2 = s2 + "\n";
                System.out.print(nou2);
            }
            try{
                writeSmallTextFile(lista_linii, "out.txt");
                writeSmallTextFile(lista_puncte, "out.txt");
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Hmmm");
            e.printStackTrace();
        }

    }
    static void writeSmallTextFile(List<String> lines, String fileName) throws IOException {
        Path path = Paths.get(fileName);
        Files.write(path, lines);
    }
}
