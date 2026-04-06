package Laborator4;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Stream;
import java.util.Scanner;

public class AppLab4 {
    public static float gasesteNota(String prenume, String nume, HashMap<Integer, Studenti> tineri) {
        for (Studenti s : tineri.values()) {
            if (s.getPrenume().equals(prenume) && s.getNume().equals(nume)) {
                return s.getNota();
            }
        }
        return 0.0f;
    }

    public static void main() {
        HashMap<String, Integer> varste = new HashMap<>();
        varste.put("Ioan", 21);
        varste.put("Maria", 22);
        varste.put("Victor", 20);
        varste.put("Simina", 20);
        varste.put("Marius", 21);
        varste.put("Mihai", 21);
        varste.put("Daniela", 23);
        varste.put("Vlad", 19);
        varste.put("Iulia", 19);
        Map<String, String> adrese = Map.of("Ioan", "Sibiu", "Maria", "Bucuresti", "Victor",
                "Cluj", "Simina", "Alba-Iulia", "Marius", "Medias", "Mihai", "Cisnadie", "Daniela", "Sibiu");
        Stream<String> stream = varste.keySet().stream();
        stream.forEach((value) -> {
            System.out.println(value);
        });
        HashMap<String, Tanar> tineri;
        tineri = new HashMap<>();
        Set entries = varste.entrySet();
        Iterator iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            String nume =  (String) entry.getKey();
            int varsta =  (Integer) entry.getValue();
            String adresa =  adrese.get(nume);
            Tanar tanar = new Tanar(nume, varsta, adresa);
            tineri.put(nume, tanar);
        }
        for (Tanar t : tineri.values()) {
            System.out.println(t);
        }
        HashMap<Integer, Studenti> studenti = new HashMap<>();
        File file = new File("C:\\Users\\Alex\\Desktop\\ing.sist.prog1\\src\\Laborator4\\studenti_in.txt");
        File fisier = new File("C:\\Users\\Alex\\Desktop\\ing.sist.prog1\\src\\Laborator4\\note_anon.txt");
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
               // System.out.println(line);
                String[] date = line.split(",");
                int nrMat = Integer.parseInt(date[0]);
                String prenume = date[1];
                String nume = date[2];
                String grupa = date[3];
                Studenti st =  new Studenti(nrMat, prenume, nume, grupa);
                studenti.put(nrMat, st);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        try (Scanner scanner = new Scanner(fisier)){
            while (scanner.hasNextLine()) {
                String ln = scanner.nextLine();
                String[] note = ln.split(",");
                int nrMat = Integer.parseInt(note[0]);
                float nota = Float.parseFloat(note[1]);
                Studenti st = studenti.get(nrMat);
                if (st!=null) {
                    st.setNota(nota);
                }
            }
        }
        catch (IOException e2) {
            e2.printStackTrace();
        }
        for (Studenti s : studenti.values()) {
            System.out.print(s);
        }
        float notaM = gasesteNota("Bianca", "Popescu", studenti);
        float notaN = gasesteNota("Ioan", "Popa", studenti);
        float notaP = gasesteNota("Paul", "Mohanu", studenti);
        System.out.println(notaM);
        System.out.println(notaN);
        System.out.println(notaP);
    }
}
