import java.util.*;
public class matrix_mirror {
    int m,a[][],b[][];
    
      void input(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number M: ");
         m=sc.nextInt();
         a=new int [m][m];
         b=new int [m][m];
         System.out.println("Enter the matrix");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j]=sc.nextInt();
                }
            }
        }
        void mirror(){
            int t=m-1;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    b[i][j]=a[i][t--];
                }
                t=m-1;
            }
        }
        void print(){
            if (m>2&&m<20) {
                System.out.println("Original Matrix");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(a[i][j]+"\t");
                }
                System.out.println("");
            }
            System.out.println("Mirror image Matrix");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(b[i][j]+"\t");
                }
                System.out.println("");
            }
            } else {
                System.out.println("Size out range");
            }
            
        }
        public static void main(String[] args) {
            matrix_mirror obj =new matrix_mirror();
            obj.input();
            obj.mirror();
            obj.print();
        }
    }


