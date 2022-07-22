import java.util.Scanner;

public class prime_adem_no {
    int n,m;
    int c;
    boolean p;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter INPUT m : ");
        m = sc.nextInt();// Geting n from user
        System.out.println("Enter INPUT n : ");
        n = sc.nextInt();// Geting m from user
    }
    boolean primeno(int z){
        int c=0;
        for(int i=1;i<= z; i++){
            if (z%i==0) {
                c++;
            }
        }
        return c==2;
    }
    int reverse(int x){
        int t,s=0;
        for(;x>0;x/=10){
            t=x%10;
            s=(s*10)+t;
            
        }
       
       return s;
    }
    boolean adam_no(int q){
        int sqq= q*q;
        int revq= reverse(q);
        int sqrevq=revq*revq;
        int rev=reverse(sqq);
        return rev == sqrevq;
    }
    void calc(){
        if (m >= n) {
            System.out.println("INVALID INPUT");
            return;
        }
        System.out.println("the integer are");
        while (m<=n) {
            if (primeno(m)&&adam_no(m)) {
                System.out.print(m+" ");
                c++;
            }
            m++;
        }
        System.out.println("");
        if (c == 0) {
            System.out.println("NIL");
        }
        System.out.println("Frequency of prime_adem integer is : "+c);
    }
    public static void main(String[] args) {
        prime_adem_no obj = new prime_adem_no(); 
        obj.input();
        obj.calc();
    }
}
