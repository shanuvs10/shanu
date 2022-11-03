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
    
    void cha(){
        for(int i=n-1,r=0;i>=0;i--,r++)
        {
            for(int j =0;j<=i;j++)
            {
                b[r][j]=a[j];
            }
            for(int k=n-1;k>i;k--)
            {
                b[r][k]=a[k-i-1];
            }
        }
    }

    void display(){
        System.out.println(" ");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < a.length; j++) {
                    System.out.print (b[i][j]+"\t");  
                }
                System.out.println("");
            }
        }
    
     
    public static void main(String[] args) {
        array_format obj=new array_format();
        obj.input();
        obj.sort();
        obj.cha();
        obj.display();
    }
}
