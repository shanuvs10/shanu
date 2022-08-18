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
       void rear(){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (i!=0 &&j!=0 &&i!=m-1&&j!=m-1) {
                    
                }
            }
        }
       }
       

}
