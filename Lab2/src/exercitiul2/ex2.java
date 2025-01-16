package exercitiul2;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Random;
import java.lang.String;


class Vers{
    private final String vers;
    public Vers(String v)
    {
        this.vers=v;
    }
    public String getString()
    {
        return this.vers;
    }
    public int getNrCuv()
    {
        String[] prelucrare;

        prelucrare = this.vers.split(" ");

        return prelucrare.length;
    }
    public int getNrVoc()
    {
        int nr = 0;
        for(int i = 0;i < this.vers.length(); i++)
        {
            if(vers.charAt(i) == 'a' || vers.charAt(i) == 'A' || vers.charAt(i) == 'e' || vers.charAt(i) == 'E' || vers.charAt(i) == 'i' || vers.charAt(i) == 'I' ||
                    vers.charAt(i) == 'o' || vers.charAt(i) == 'O' || vers.charAt(i) == 'u' || vers.charAt(i) == 'U')
            {
                nr++;
            }
        }

        return nr;
    }
    public boolean ultLitera(String lettersGroup)
    {
        return vers.substring(this.vers.length() - lettersGroup.length(), this.vers.length()).equals(lettersGroup);
    }

    public void setUpper()
    {
        Random rand = new Random();

        if(rand.nextDouble() < 0.1)
            this.vers.toUpperCase();
    }
}
public class ex2 {
    public static void main(String[] args) throws IOException {
        BufferedReader tastat = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader input = new BufferedReader(new FileReader("src/Lab2/cantec_in.txt"));
        BufferedWriter output = new BufferedWriter(new FileWriter("src/Lab2/cantec_out.txt"));

        Vers[] v = new Vers[4];
        String lettersGroup;

        System.out.println("Introduceti gruparea de litere: ");
        lettersGroup = tastat.readLine();

        for(int i = 0; i < 4; i++)
        {
            v[i] = new Vers(input.readLine());
            if(v[i].ultLitera(lettersGroup))
                output.write("*");
            output.write(v[i].getNrCuv() + " ");
            output.write(v[i].getNrVoc() + " ");
            v[i].setUpper();
            output.write(v[i].getString());
            output.newLine();
        }
        output.close();
    }
}
