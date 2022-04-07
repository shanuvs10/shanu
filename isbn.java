import static java.lang.Integer.parseInt;

import java.util.*;
class isbn
{
    String a;
    int n,sum;
    boolean tem;
    void input()
    {
        Scanner sc =new Scanner(System.in);
        a=sc.nextLine();
    }
    boolean check()
    {
        
        if(a.length()==10)
        {
            for(int i=0;i<a.length();i++)
            {
                if(Character.toString(a.charAt(i)).equalsIgnoreCase("X"))
                tem = true;
                System.out.println("invalid input");
                break;

            }
        }
        return tem;
    }
    void calc()
    {
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='x'||a.charAt(i)=='X')
            n=10;
            else
            {
                n=Integer.parseInt(Character.toString(a.charAt(i)));
            }
            sum+=(n*(a.length()-i));
        }

    }
    void prit()
    {
        System.out.println("sum "+sum);
        if(sum%11==0)
        System.out.println("leaves no remainder -valid isbn code ");
    }
    public static void main(String[] args) {
        isbn obj =new isbn();
        obj.input();
        if(obj.check()==false)
        {
            obj.calc();
        }
        
    }
}