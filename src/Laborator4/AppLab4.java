package Laborator4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class AppLab4 {
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
    }
}
