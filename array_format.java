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
            for (int j = 0; j < a.length-1-i; j++) {
                if(a[j]>a[j+1])
                {
                    tem = a[j];
                    a[j]=a[j+1];
                    a[j+1]=tem;
                }
            }
        }
        System.out.println("Sorted Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] +"\t");
        }
        System.out.println("");
        
    }
    void matrix()
    {
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < a.length; j++) {
                    b[i][j]=a[j];    
                }
            }
        }

    void change(){
        for (int i = 0; i < b.length; i++) {
            for (int j = a.length-1; j >i; j--) {
                b[i][j]=a[j-i-1];
            }
        }
    }
    void display(){
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < a.length; j++) {
                    System.out.print (b[i][j]);  
                }
                System.out.println("");
            }
        }
    
     
    public static void main(String[] args) {
        array_format obj=new array_format();
        obj.input();
        obj.sort();
        obj.matrix();
        obj.change();
        obj.display();
    }
}
