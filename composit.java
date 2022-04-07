import java.util.*;
class composit
{
    int n,m;
    void input()
    {
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
    }
    int comp(int q)
    {
        int a=q;
        int c=0;
        for(int i=1;i<=a;a/=10)
        {
            if(a%i==0)
            c++;
        }
        if(c!=1||c!=2)
        q=1;
        return q; 
    }
    void magic()
    {
        int a=0;
        while(m<=n)
        {
            int q=m;

             while(q>0)
             {
               a=a+(q%10);
               a*=10;
               q/=10;
            }
            m++;
        }
    }
}