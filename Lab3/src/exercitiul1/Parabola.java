package exercitiul1;
import java.lang.Math;
class Parabola {
    private final int a;
    private final int b;
    private final int c;

    public Parabola(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    public String toString() {
        return "f(x)=" +a+ "x^2+" + b +"x+"+c;
    }
    public double[] varf(){
        double x=-b/(2.0*a);
        double y=(-b*b+4*a*c)/(4.0*a);
        return new double[]{x,y};
    }
    public static double[] mijloc(Parabola P1, Parabola P2){
        double[] vp1=P1.varf();
        double[] vp2=P2.varf();
        double x=vp1[0]+vp2[0];
        double y=vp1[1]+vp2[1];
        return new double[]{x/2.0,y/2.0};

    }
    public static double lungime(Parabola P1,Parabola P2){
        double[] vp1=P1.varf();
        double[] vp2=P2.varf();
        double distx=vp1[0]-vp2[0];
        double disty=vp1[1]-vp2[1];
        return  Math.hypot(distx,disty);
    }
}
