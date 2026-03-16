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
}
