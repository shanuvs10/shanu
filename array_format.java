import java.util.*;
public class array_format {
    int a[],b[][],n,tem;

    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the N");
        n=sc.nextInt();
        a=new int [n];
        b=new int [n][n];
        System.out.println("Enter the elements of single dimsional array");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
    }
    void sort()
    {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(a[j]>a[j+1])
                {
                    tem = a[j];
                    a[j]=a[j+1];
                    a[j+1]=tem;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        
    }
    void matrix()
    {
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < a.length; j++) {
                    b[i][j]=a[j];    
                }
            }
        }

    


    public static void main(String[] args) {
        array_format obj=new array_format();
        obj.input();
        obj.sort();
    }
}
