package ex1;

public class SistemeDeCalcul extends Echipamente {
    private String tip_mon;
    private int vit_proc;
    private String c_hdd;
    private SistemeDeOperare sistemeDeOperare;

    public SistemeDeCalcul(String denumire, int nr_inv, int pret, String zona_mag, Situatie situatie, String tip_mon, int vit_proc, String c_hdd, SistemeDeOperare sistemeDeOperare) {
        super(denumire, nr_inv, pret, zona_mag, situatie);
        this.tip_mon = tip_mon;
        this.vit_proc = vit_proc;
        this.c_hdd = c_hdd;
        this.sistemeDeOperare = sistemeDeOperare;
    }

    public String getTip_mon() {
        return tip_mon;
    }

    public int getVit_proc() {
        return vit_proc;
    }

    public String getC_hdd() {
        return c_hdd;
    }

    public SistemeDeOperare getSistemeDeOperare() {
        return sistemeDeOperare;
    }

    public void setTip_mon(String tip_mon) {
        this.tip_mon = tip_mon;
    }

    public void setVit_proc(int vit_proc) {
        this.vit_proc = vit_proc;
    }

    public void setC_hdd(String c_hdd) {
        this.c_hdd = c_hdd;
    }

    public void setSistemeDeOperare(SistemeDeOperare sistemeDeOperare) {
        this.sistemeDeOperare = sistemeDeOperare;
    }

    @Override
    public String toString() {
        return super.toString() + "SistemeDeCalcul{" + "tip_mon= " + tip_mon + ", vit_proc= " + vit_proc + ", c_hdd= " + c_hdd + ", sistemeDeOperare= " + sistemeDeOperare + "}";
    }
}