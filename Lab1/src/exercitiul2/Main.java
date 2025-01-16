package exercitiul2;
import java.io.*;
import java.util.Scanner;
import java.io.FileWriter;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner inputScanner=new Scanner(new File("src/exercitiul2/in.txt"));
        FileWriter outputScanner=new FileWriter("src/exercitiul2/out.txt");
        int numar,suma=0,numere_citite=0,val_min=Integer.MAX_VALUE,val_max=Integer.MIN_VALUE;
        float media=0;
        while(inputScanner.hasNext()) {
            numar = inputScanner.nextInt();
            suma = suma + numar;
            numere_citite++;

            if (numar < val_min) val_min = numar;
            if (numar > val_max) val_max = numar;

            media = (float) suma / numere_citite;

        }
            System.out.println("Suma este: "+suma);
            System.out.println("Media este: "+media);
            System.out.println("Valoarea minima este: "+val_min);
            System.out.println("Valoarea maxima este: "+ val_max);

            outputScanner.write("Suma este: "+suma+"\n");
            outputScanner.write("Media este: "+media+"\n");
            outputScanner.write("Valoarea minima este: "+val_min+"\n");
            outputScanner.write("Valoarea maxima este: "+ val_max+"\n");

            outputScanner.close();


    }
}
