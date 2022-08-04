import java.util.*;
public class Symmeterric_matrix {
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
       boolean symmetry(){
        int c=0;boolean p= false;
         for (int i = 0; i < m; i++) {
             for (int j = 0; j < m; j++) {
                 if(a[i][j]==a[j][i])
                 {
                     c++;
                 }
             }
         }
         if (c==(m*m)) {
            p=true;
         }
         return p;
       }
       void diagonal(){
        int suml=0,sumr=0,l=m-1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if(i==j)
                {
                    suml+=a[i][j];
                }
                sumr+=a[i][l-i];
            }
        }
        System.out.println("The sum of left diagonal = "+suml);
        System.out.println("The sum of right diagonal = "+sumr);
       }

    void print () {
        if (m>2&&m<20) {
            System.out.println("Original Matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println("");
        }
        if(symmetry())
        {
            System.out.println("the given matrix is symmeetric");
        }
        else
        {
            System.out.println("the given matrix is not symmetry");
        }
        diagonal();
        } else {
            System.out.println("Size out range");
        }
    }
    public static void main(String[] args) {
        Symmeterric_matrix obj = new Symmeterric_matrix();
        obj.input();
        obj.print();

    }
}



