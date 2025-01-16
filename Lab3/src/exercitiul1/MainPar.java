package exercitiul1;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class MainPar {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        List<Parabola> parab=new ArrayList<>();

        while(input.hasNextInt()){
            int a=input.nextInt();
            int b=input.nextInt();
            int c=input.nextInt();
            Parabola P=new Parabola(a,b,c);
            parab.add(P);
        }
        for(Parabola P:parab){
            System.out.println(P);
            double[] varf=P.varf();
            System.out.println("Varf:("+varf[0]+","+varf[1]+")");

        }
        int i,j;
        for(i=0;i<parab.size()-1;i++){
            for(j=i+1;j<parab.size();j++){
                Parabola P1=parab.get(i);
                Parabola P2=parab.get(j);
                double[] mijloc=Parabola.mijloc(P1,P2);
                double lungime=Parabola.lungime(P1,P2);
                System.out.println("Mijlocul:"+(i+1)+"si"+(j+1)+":("+mijloc[0]+","+mijloc[1]+")");


            }
        }
    }
}
