import java.util.*;
public class matrix_sort {

    int m,n,a[][],b[],c[][];

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number M: ");
        m=sc.nextInt();
        System.out.println("Enter the number N: ");
        n=sc.nextInt();
        if (m>3&&m<10) {
            a=new int [m][n];
        System.out.println("Enter the matrix");
           for (int i = 0; i < m; i++) {
               for (int j = 0; j < n; j++) {
                   a[i][j]=sc.nextInt();
                   
               }
           }
        }
        else {
            System.out.println("Invalid M");
            System.exit(0);
        }
        
       }

       void sort(){
        int tem;c=new int[m][m];
        b=new int [(m-2)*(m-2)];int k=0;
        for (int i = 1; i < m-1; i++) {
            for (int j = 1; j < m-1; j++) {
                b[k]=a[i][j];
                k++;
            }
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
        
       }

    public static void main(String[] args) {
        matrix_sort obj = new matrix_sort();
        obj.input();
    }
}
