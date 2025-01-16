package ex1;

public class Imprimante extends Echipamente{
    private int ppm;
    private String rezolutie;
    private int p_car;
    private ModTiparire modTiparire;

    public Imprimante(String denumire, int nr_inv, int pret, String zona_mag,Situatie situatie,int ppm, String rezolutie,int p_car, ModTiparire modTiparire){
        super(denumire, nr_inv,pret,zona_mag,situatie);
        this.ppm=ppm;
        this.p_car=p_car;
        this.modTiparire =modTiparire;
        this.rezolutie=rezolutie;
    }
    public int getPpm(){
        return ppm;
    }
    public int getP_car(){
        return p_car;
    }

    public String getRezolutie() {
        return rezolutie;
    }

    public ModTiparire getModTiparire() {
        return modTiparire;
    }

    public void setPpm(int ppm) {
        this.ppm = ppm;
    }

    public void setRezolutie(String rezolutie) {
        this.rezolutie = rezolutie;
    }

    public void setP_car(int p_car) {
        this.p_car = p_car;
    }

    public void setModTiparire(ModTiparire modTiparire) {
        this.modTiparire = modTiparire;
    }
    @Override
    public String toString(){
        return super.toString()+"Imprimante{"+"ppm= "+ppm+", rezolutie= "+rezolutie+", p_car= "+p_car+", modTiparire= "+modTiparire+"}";
    }
}
