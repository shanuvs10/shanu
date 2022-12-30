import java.util.*;
class mobius
{
    int n;
    void input(){
        Scanner sc = new Scanner (System.in);
        n=sc.nextInt();
    }
    int M(int N){
        int c=0,t=0;
        System.out.println(n+" = ");
        for(int i=2;i<=N;){
            if(N%i==0){
                if(t==i){
                    System.out.println(i+" ");
                    return 0;}
                N=N/i;
                t=i;
                c++;
                System.out.println(i+" ");
                i=2;
            
            }
            else
            i++;
        }
        System.out.println("NUMBER OF DISTINCT PRIME FACTORS = "+c);
        if(c==1){
            System.out.println("NO PRIME FACTOR");
            System.exit(0);
        }
        if(c>1)
        return (int)Math.pow(-1,c);
        return 0;
    }
    void display(){
        if(M(n)==0){
           System.out.println("DUPLICATE PRIME FACTORS");
           System.out.println("M("+n+") = "+ M(n));
        }
        else
        System.out.println("M("+n+") = "+ M(n));
    }
    public static void main(String[]args){
        mobius obj = new mobius();
        obj.input();
        obj.display();
    }
}