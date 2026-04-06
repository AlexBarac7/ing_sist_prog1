import java.util.Objects;

public class StudentiBursieri extends Student{
    double nota;
    double cuantumBursa;
    public StudentiBursieri(int nrMatricol, String prenume, String nume, String formatieDeStudiu, double nota, double cuantumBursa) {
        super(nrMatricol, prenume, nume, formatieDeStudiu);
        this.nota = nota;
        this.cuantumBursa = cuantumBursa;
    }
    @Override
    public String toString() {

        return prenume +  " " + nume + " " + formatieDeStudiu + " " + nrMatricol + " "  + " " + nota + " " + cuantumBursa + "\n";
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
        return Objects.hash(prenume, nume, formatieDeStudiu, cuantumBursa);
    }
}
