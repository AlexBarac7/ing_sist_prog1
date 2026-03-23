import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
void main() {
    Student s1 = new Student(112, "Ioan", "Popa", "TI21/1");
    Student s2 = new Student(112, "Maria", "Oprea", "TI21/2");
    Student s3 = new Student(120, "Alis", "Popa", "TI21/2");
    Student s4 = new Student(122, "Mihai", "Vecerdea", "TI22/1");
    Student s5 = new Student(122, "Eugen", "Uritescu", "TI22/2");
    List<Student> students = new ArrayList<>();
    students.add(s1);
    students.add(s2);
    students.add(s3);
    students.add(s4);
    students.add(s5);
    for (int i = 0; i < students.size(); i++) {
        IO.println(students.get(i));
    }
    boolean exista = students.contains(new Student(120, "Alis", "Popa", "TI21/2"));
    IO.println(exista);
    exista = students.contains(new Student(112, "Maria", "Popa", "TI21/2"));
    IO.println(exista);
    File file = new File("studenti_in.txt");
    List<String> studenti = new ArrayList<>();
    try (Scanner sc = new Scanner(file)) {
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
            studenti.add(line);
        }
        Collections.sort(studenti);
        try{
            writeSmallTextFile(studenti, "studenti_out.txt");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    catch (Exception e) {
        e.printStackTrace();
    }
}
static void writeSmallTextFile(List<String> lines, String fileName) throws IOException {
    Path path = Paths.get(fileName);
    Files.write(path, lines);
}