public class Student {
    int nrMatricol;
    String prenume, nume;
    String formatieDeStudiu;
    public Student(int nrMatricol, String prenume, String nume, String formatieDeStudiu) {
        this.nrMatricol = nrMatricol;
        this.prenume = prenume;
        this.nume = nume;
        this.formatieDeStudiu = formatieDeStudiu;
    }
    @Override
    public String toString() {

        return prenume +  " " + nume + "\n" + "Grupa: " + formatieDeStudiu + "\n" +  "nr matricol: " + nrMatricol;
    }
}