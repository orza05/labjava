package ex3;

public class PerecheNumere {
    private int x;
    private int y;

    public PerecheNumere(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public PerecheNumere() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "("+x+","+y+")";
    }

    public int cmmdc(){
        int a=x;
        int b=y;
        while(a!=b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
        }

        public boolean sumaegala(){
        int sumax=0;
        int sumay=0;
        int a=x;
        int b=x;
        while(a!=0){
            sumax=sumax+a%10;
            a=a/10;
        }
        while(b!=0){
            sumay=sumay+b%10;
            b=b/10;
        }
        return (sumax==sumay);
    }

    public boolean cifrepare(){
        int cifx=0;
        int cify=0;
        int a=x;
        int b=x;
        while(a!=0){
            if(a%10%2==0){
                cifx++;
                a=a/10;
            }

        }
        while(b!=0){
            if(b%10%2==0){
                cify++;
                b=b/10;
            }
        }
        return(cifx==cify);
    }

    public boolean fibo(){
        int a=x;
        int b=y;
        while(b>a){
            int c=b;
            b=a+b;
            a=c;

        }
        return(a==x && b==y);
    }

}
