package exercitiul1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class MainApp {
    public static void main(String[] args)throws IOException{
        BufferedReader input = new BufferedReader(new FileReader("out/production/Lab2/exercitiul1/judete_in.txt"));
        BufferedReader citire = new BufferedReader(new InputStreamReader(System.in));
        String[] judet = new String[41];
        String jud;
        int i;
        for( i=0;i<judet.length;i++) {
            judet[i] = input.readLine();
        }
        Arrays.sort(judet);
        System.out.println("Judetele sortate sunt: ");
        for( i=0;i<judet.length;i++){
            System.out.println(judet[i]);
        }
        System.out.println("Introduceti judetul cautat: ");
        jud= citire.readLine();
        int poz=Arrays.binarySearch(judet, jud);
        System.out.println("Judetul se afla la pozitia: " + poz);

    }
}
