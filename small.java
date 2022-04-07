import java.util.*;
class small
{
    int n,m,cout,a;
    void input ()
    {
        Scanner sc =new Scanner (System.in);
        m=sc.nextInt();
        n=sc.nextInt();
    }
    void calcu()
    {
        a=m-n;
        for(int i=a;i>0;i/=10)
        {
            cout++;
        }
    }
    void disply()
    {
        System.out.println("the required number = "+a);
        System.out.println("total no of digits = "+cout);
    }
    public static void main(String[] args) 
    {
        small obj =new small();
        obj.input();
        obj.calcu();
        obj.disply();
    }
    
}