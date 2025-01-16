package exercitiul3;
import java.sql.SQLOutput;
import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduceti numarul: ");
        int numar= scanner.nextInt();

        int i,d=2;
        for(i=1;i<=numar;i++)
            if(numar%i==0)
                System.out.println(i);

        boolean prim=true;
        for(d=2;d<=numar/2;d++)
            if(numar%d==0){
                prim=false;
                break;
            }
        if(prim)
            System.out.println("Numarul "+numar+" este prim");
        else
            System.out.println("Numarul "+numar+" nu este prim");
    }
}
