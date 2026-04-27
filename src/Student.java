import java.util.Objects;

public class Student {
    protected final int nrMatricol;
    protected final String prenume;
    protected final String nume;
    protected final String formatieDeStudiu;
    public Student(int nrMatricol, String prenume, String nume, String formatieDeStudiu) {
        this.nrMatricol = nrMatricol;
        this.prenume = prenume;
        this.nume = nume;
        this.formatieDeStudiu = formatieDeStudiu;
    }
    public int getNrMatricol() {
        return nrMatricol;
    }
    public String getPrenume() {
        return prenume;
    }
    public String getNume() {
        return nume;
    }
    public String getFormatieDeStudiu() {
        return formatieDeStudiu;
    }
    @Override
    public String toString() {

        return prenume +  " " + nume + " " + formatieDeStudiu + " " + nrMatricol + " "  +  "\n";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        return this.prenume.equals(((Student)obj).prenume) && this.nume.equals(((Student)obj).nume) &&
                this.formatieDeStudiu.equals(((Student)obj).formatieDeStudiu);
    }
    @Override
    public int hashCode() {
        return Objects.hash(prenume, nume, formatieDeStudiu);
    }
}