package ex1;

public class Copiatoare extends Echipamente {
    private int p_ton;
    private FormatCopiere formatCopiere;

    public Copiatoare(String denumire, int nr_inv, int pret, String zona_mag, Situatie situatie, int p_ton, FormatCopiere formatCopiere) {
        super(denumire, nr_inv, pret, zona_mag, situatie);
        this.p_ton = p_ton;
        this.formatCopiere = formatCopiere;
    }

    public int getP_ton() {
        return p_ton;
    }

    public FormatCopiere getFormatCopiere() {
        return formatCopiere;
    }

    public void setP_ton(int p_ton) {
        this.p_ton = p_ton;
    }

    public void setFormatCopiere(FormatCopiere formatCopiere) {
        this.formatCopiere = formatCopiere;
    }

    @Override
    public String toString() {
        return super.toString() + "Copiatoare{" + "p_ton= " + p_ton + ", formatCopiere= " + formatCopiere + "}";
    }
}