package ex1;
import java.time.LocalDate;
public class Angajat {
    private String nume;
    private String post;
    private float salariu;
    private LocalDate data_angajare;

    public Angajat(String nume, String post, float salariu, LocalDate data_angajare) {
        this.nume = nume;
        this.post = post;
        this.salariu = salariu;
        this.data_angajare = data_angajare;
    }

    public Angajat() {
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public float getSalariu() {
        return salariu;
    }

    public void setSalariu(float salariu) {
        this.salariu = salariu;
    }

    public LocalDate getData_angajare() {
        return data_angajare;
    }

    public void setData_angajare(LocalDate data_angajare) {
        this.data_angajare = data_angajare;
    }

    @Override
    public String toString() {
        return "Angajat{" +"nume='" + nume + '\'' +
                ", post='" + post + '\'' +
                ", salariu=" + salariu +
                ", data_angajare=" + data_angajare +
                '}';
    }
}
