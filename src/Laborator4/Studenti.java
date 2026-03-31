package Laborator4;

import java.util.Objects;

public class Studenti {
    int nrMatricol;
    String prenume, nume;
    String formatieDeStudiu;
    float nota;
    public Studenti(int nrMatricol, String prenume, String nume, String formatieDeStudiu) {
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
    public float getNota() {
        return nota;
    }
    public void setNota(float nota) {
        this.nota = nota;
    }
    @Override
    public String toString() {

        return prenume +  " " + nume + " " + formatieDeStudiu + " " + nrMatricol + " " + nota +  "\n";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        return this.prenume.equals(((Studenti)obj).prenume) && this.nume.equals(((Studenti)obj).nume) &&
                this.formatieDeStudiu.equals(((Studenti)obj).formatieDeStudiu)  &&  this.nota == ((Studenti)obj).nota;
    }
    @Override
    public int hashCode() {
        return Objects.hash(prenume, nume, formatieDeStudiu, nota);
    }
}
