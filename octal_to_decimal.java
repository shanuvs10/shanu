import java.util.*;
public class octal_to_decimal {
    int n,m,a[][];

    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number M: ");
        m=sc.nextInt();
        System.out.println("Enter the number N: ");
        n=sc.nextInt();
        if (m>0&&m<10&&n>2&&n<6) {
            a=new int [m][n];
        System.out.println("Enter the matrix");
           for (int i = 0; i < m; i++) {
            System.out.println("enter the elements for row "+(i+1));
               for (int j = 0; j < n; j++) {
                   a[i][j]=sc.nextInt();
                   
               }
           }
        }
        else {
            System.out.println("Invalid M or N");
            System.exit(0);
        }
    }

    void print()
    {int s=0,p=0;
        for (int i = 0; i < m; i++) {
               for (int j = 0; j < n; j++) {
                   System.out.print(a[i][j]+"\t");
                   p=n-1;
                   s=s+(a[i][j]*(int)Math.pow(8, p));
                   System.out.println(s);
                   System.out.println(a[i][j]*(int)Math.pow(8, p));
                   p--;
               }
               System.out.print(s);
               System.out.println("");
           }
    }

    public static void main(String[] args) {
        octal_to_decimal obj = new octal_to_decimal();
        obj.input();
        obj.print();
    }
}
