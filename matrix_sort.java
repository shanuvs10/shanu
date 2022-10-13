import java.util.*;
public class matrix_sort {

    int m,n,a[][],b[],c[][];

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number M: ");
        m=sc.nextInt();
        System.out.println("Enter the number N: ");
        n=sc.nextInt();
        if (m>2&&m<10&&n>2&&n<10) {
            a=new int [m][n];
        System.out.println("Enter the matrix");
           for (int i = 0; i < m; i++) {
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

       void sort() {
        int tem;c=new int[m][n];
        b=new int [n];int k=0;
        for (int p = 0; p < m; p++) {
            for (int j = 0; j < n; j++) {
                b[k]=a[p][j];
                //System.out.print(b[k]);
                k++;
            }
        
        for (int i = 0; i < k-1; i++) {
            for (int j = 0; j < k-1-i; j++) {
               if(b[j]>b[j+1])
               {
                   tem = b[j];
                   b[j]=b[j+1];
                   b[j+1]=tem;
               }
            }
        }
        k=0;
            for (int j = 0; j < n; j++) {
               c[p][j]=b[k];
               k++;
            }
        
        k=0;
    }
    }

       void print()
       {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c[i][j]+"\t");
                
            }
            System.out.println("");
        }
       }

    public static void main(String[] args) {
        matrix_sort obj = new matrix_sort();
        obj.input();
        obj.sort();
        obj.print();
    }
}
