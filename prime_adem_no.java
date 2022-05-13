import java.util.Scanner;

public class prime_adem_no {
    int n,m;
    int c;
    boolean p;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter INPUT n : ");
        n = sc.nextInt();// Geting n from user
        System.out.println("Enter INPUT m : ");
        m = sc.nextInt();// Geting m from user
    }
    boolean primeno(int m){
        boolean q=false;
        int c=0;
        for(int i=1;i<= m; i++){
            if (m%i==0) {
                c++;
            }
        }
        if (c==2) {
            q=true;
        }
        return q;
    }
    int reverse(int n){
        int t=0,y=0; int p=0;
        for (int i = n; i >0; i/=10) {
            t=i%10;
            y=(10*y)+t;
        }
        if (n==y) {
             p =y;
       }
       System.out.println(p);
       return p;
    }
    boolean adam_no(int q){
        int n=q;
        int nn=n*n;
        int rn=reverse(n);
        int rnn=reverse(nn);
        int srnn=reverse((int)Math.sqrt(rnn));
        if (n==rn&&srnn==rnn) {
            p= true;
        }
        return p;
    }
    void calc(){
        System.out.println("the integer are");
        for (int i = m; i < n; i++) {
            if (primeno(i)&&adam_no(i)) {
                System.out.print(i+"\t");
                c++;
            }
        }
        System.out.println("Frequency of prime_adem integer is : "+c);
    }
    public static void main(String[] args) {
        prime_adem_no obj = new prime_adem_no(); 
        //obj.input();
        obj.adam_no(103);
        //obj.calc();
    }
}
