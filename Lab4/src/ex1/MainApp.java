package ex1;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.Integer;

public class MainApp {

    public static void main(String[] args) throws IOException {
        List<Echipamente> echipamente = new ArrayList<Echipamente>();
        BufferedReader buff = new BufferedReader(new InputStreamReader(new FileInputStream("src/ex1/echipamente.txt")));
        String s;
        int n = 0;

        while ((s = buff.readLine()) != null) {
            String[] x = s.split(";");
            int nr_inv = Integer.parseInt(x[1]);
            int pret = Integer.parseInt(x[2]);
            Situatie situatie = Situatie.valueOf(x[4]);
            if (s.contains("copiator")) {
                int ppm = Integer.parseInt(x[5]);
                int p_car = Integer.parseInt(x[6]);
                ModTiparire modTiparire = ModTiparire.valueOf(x[8]);
                echipamente.set(n, new Imprimante(x[0], nr_inv, pret, x[3], situatie, ppm, x[7], p_car, modTiparire));
            }
        }


    }
}
