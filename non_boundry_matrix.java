import java.util.*;
public class non_boundry_matrix {
    int m,a[][],b[],c[][];
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
        k=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
               if(i==0||j==0||i==m-1||j==m-1)
               {
                   c[i][j]=a[i][j];
               }
               else
               {
                   c[i][j]=b[k++];
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
                System.out.print(c[i][j]+ "\t");
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
                    System.out.print(c[i][j]+ "\t");
                    sum+=c[i][j];
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
