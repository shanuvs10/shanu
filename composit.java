import java.util.*;
class composit
{
    int n,m,c=0;
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
        int num;
        while(m<=n)
        {num=m;
            while(num>9)
            {
                int s=0;
                while(num!=0)
                {
                    int d =num%10;
                    num/=10;
                    s+=d;
                }
                num=s;
            }
            m++;
            if(num==1)
            {
                c++;
                System.out.println(num+"");
            }
        }

    }
    public static void main(String[] args) {
        composit obj =new composit();
        obj.input();
        obj.magic();
    }
}