package exercitiul1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("lungime=");
        int lungime=scanner.nextInt();
        System.out.print("latime=");
        int latime=scanner.nextInt();
        int perimetru, arie;
        perimetru=2*lungime+2*latime;
        arie=lungime*latime;
        System.out.println("Perimetrul este "+perimetru);
        System.out.println("Aria este "+arie);
        scanner.close();

    }
}
