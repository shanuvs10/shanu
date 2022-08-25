import java.util.*;
public class non_boundry_matrix {
    int m,a[][],b[][];
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number M: ");
        m=sc.nextInt();
        a=new int [m][m];
        System.out.println("Enter the matrix");
           for (int i = 0; i < m; i++) {
               for (int j = 0; j < m; j++) {
                   a[i][j]=sc.nextInt();
                   
               }
           }
       }
        
       void sort() {
        b=new int [m][m];int k=0,big=0;
        int c[]=new int[(m-1)*(m-1)];
        int key=a[1][1];int tem;
        for (int i = 1; i < m-1; i++) {
            for (int j = 1; j < m-1; j++) {
                c[k++]=a[i][j];
            }
        }
        for (int i = 0; i <c.length; i++) {
            for (int j = 0; j <c.length; j++) {
                if (big>c[i]) {
                    tem=c[i];
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (i==0 ||j==0||i==m-1||j==m-1) {
                    b[i][j]=a[i][j];
                }
            }
        }
    }

    void display()
    {
        System.out.println("ORIGINAL");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j]+ "\t");
            }
            System.out.println("");
        }

        System.out.println("REARRANGED");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(b[i][j]+ "\t");
            }
            System.out.println("");
        }
    }

    void diadonal(){
        int sum=0;
        System.out.println("DIAGIONAL");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (i==j||i+j==m-1) {
                    System.out.print(b[i][j]+ "\t");
                    sum+=b[i][j];
                }
                else
                System.out.print("\t");
                
            }
            System.out.println("");
        }
        System.out.println(sum);
    }
      public static void main(String[] args) {
        non_boundry_matrix obj =new non_boundry_matrix();
        obj.input();
        obj.sort();
        obj.display();
        obj.diadonal();
      } 

}
