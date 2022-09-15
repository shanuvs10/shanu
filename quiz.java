import java.util.*;
public class quiz {
    int N,c[]; char a[][], b[];
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number N: ");
        N=sc.nextInt();
        if (N>3&&N<11) {
            a=new char [N][5];
            b = new char [5];
            c = new int [5];
           for (int i = 0; i < N; i++) {
               for (int j = 0; j < 5; j++) {
                   System.out.print("Participant "+(i+1)+" : ");
                   a[i][j]=sc.next().charAt(0);
                   
               }
               System.out.println("");
           }
           System.out.print("key : ");
           for (int i = 0; i < 5; i++) {
               b[i]=sc.next().charAt(0);
           }
        }
        else {
            System.out.println("Input size out of range");
            System.exit(0);
        }
    }
    void check()
    { 
        int big=0,no=0,count=0,k=0;
        
        System.out.println("Score ");

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 5; j++) {
                if (a[i][j]==b[j]) {
                    c[i]++;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.println("Participant "+(i+1)+" = "+c[i]);
            if (c[i]>big) {
                big=c[i];
            }
        }

        System.out.println("Highest Score : ");
        for (int i = 0; i < 5; i++) {
            if (c[i]==big) {
                no=i;
            }
        }
        System.out.println("Participant "+(no+1));

    }

    public static void main(String[] args) {
        quiz obj=new quiz();
        obj.input();
        obj.check();
    }
}
