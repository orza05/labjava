package ex1;

public class Echipamente {
    private String denumire;
    private int nr_inv;
    private int pret;
    private String zona_mag;
    private Situatie situatie;


    public Echipamente(String denumire, int nr_inv, int pret, String zona_mag, Situatie situatie) {
        this.denumire = denumire;
        this.nr_inv = nr_inv;
        this.pret = pret;
        this.zona_mag = zona_mag;
        this.situatie = situatie;
    }

    public String getDenumire() {
        return denumire;
    }

    public int getNr_inv() {
        return nr_inv;
    }

    public int getPret() {
        return pret;
    }

    public String getZona_mag() {
        return zona_mag;
    }

    public Situatie getSituatie() {
        return situatie;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setNr_inv(int nr_inv) {
        this.nr_inv = nr_inv;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public void setZona_mag(String zona_mag) {
        this.zona_mag = zona_mag;
    }

    public void setSituatie(Situatie situatie) {
        this.situatie = situatie;
    }

    @Override
    public String toString() {
        return "Echipamente{" + "denumire= " + denumire + ", nr_inv= " + nr_inv + ", pret= " + pret + ", zona_mag= " + zona_mag + ",situatie=" + situatie + "}";
    }
}
