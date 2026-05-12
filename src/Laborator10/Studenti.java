package Laborator10;

import java.util.Objects;

public class Studenti {
    protected int nrMatricol;
    protected String prenume;
    protected String nume;
    protected String formatieDeStudiu;
    protected double nota;
    public Studenti(int nrMatricol, String prenume, String nume, String formatieDeStudiu, double nota) {
        this.nrMatricol = nrMatricol;
        this.prenume = prenume;
        this.nume = nume;
        this.formatieDeStudiu = formatieDeStudiu;
        this.nota = nota;
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
    public double getNota(){
        return nota;
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
        return this.prenume.equals(((Studenti)obj).prenume) && this.nume.equals(((Studenti)obj).nume) &&
                this.formatieDeStudiu.equals(((Studenti)obj).formatieDeStudiu);
    }
    @Override
    public int hashCode() {
        return Objects.hash(prenume, nume, formatieDeStudiu);
    }
}
