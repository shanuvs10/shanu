import java.util.*;

class small {
    int n, m, cout, a;


    void input() {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
    }

    void calcu()
    {
        
    }
    int sum(int n){
        int sum=0;
        int d=0;
        while (n>0) {
            d=n%10;
            sum+=d;
            n/=10;
        }
        return sum;
    }

    void disply() {
        System.out.println("the required number = " + a);
        System.out.println("total no of digits = " + cout);
    }

    public static void main(String[] args) {
        small obj = new small();
        obj.input();
        int q = obj.m;
        int w =obj.n;
        if (q<1000||q>10000||w<1||w>99) {
            System.out.println("Invalid Input");
            
        }
        else{
           for (int i= q ;obj.sum(i)!=w ; i++); 
        }
        obj.disply();
    }

}