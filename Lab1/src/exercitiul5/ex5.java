package exercitiul5;
import java.util.Random;
public class ex5 {
    public static void main(String[] args) {
        Random rand=new Random();
        int numar=rand.nextInt(20);
        System.out.println("Numar=" + numar);
        int a=0,b=1,c;

        boolean fibo=false;
        for(int i=0;i<9;i++){
            if(i==0)
                if(a==numar){
                    fibo=true;
                    break;
                }
            if(i==1)
                if(b==numar){
                    fibo=true;
                    break;
                }
            c=a+b;
            a=b;
            b=c;

            if(c==numar){
                fibo=true;
                break;
            }
        }
        if(fibo)
            System.out.println("Numarul "+numar+" apartine sirului Fibonacci");
        else
            System.out.println("Numarul "+numar+" nu apartine sirului Fibonacci");


    }
}
