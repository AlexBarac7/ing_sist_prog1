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
        IO.print(students.get(i));
    }
    boolean exista = students.contains(new Student(120, "Alis", "Popa", "TI21/2"));
    IO.println(exista);
    exista = students.contains(new Student(112, "Maria", "Popa", "TI21/2"));
    IO.println(exista);
    File file = new File("C:\\Users\\Alex\\Desktop\\ing.sist.prog1\\src\\Laborator3\\studenti_in.txt");

    List<Student> studenti = new ArrayList<>();
    try (Scanner sc = new Scanner(file)) {
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] elemente =  line.split(",");
            System.out.println(line);
            int nrMatricol = Integer.parseInt(elemente[0]);
            String prenume = elemente[1];
            String nume = elemente[2];
            String grupa = elemente[3];
            Student  student = new Student(nrMatricol, prenume, nume, grupa);
            studenti.add(student);
        }
        try{
            FileWriter fw = new FileWriter("C:\\Users\\Alex\\Desktop\\ing.sist.prog1\\src\\Laborator3\\studenti_out.txt");
            studenti.sort(Comparator.comparing(Student::getNume));
            fw.write(studenti.toString());
            studenti.sort(Comparator.comparing(Student::getFormatieDeStudiu).thenComparing(Student::getNume));
            fw.write("\n");
            fw.write(studenti.toString());
            fw.close();
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