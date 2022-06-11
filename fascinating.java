import java.util.Scanner;

public class fascinating {
    int m,n;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m");
        m = sc.nextInt();// Geting m from user
        System.out.println("Enter n");
        n = sc.nextInt();// Geting n from user
    }

    boolean nocheck(String s) 
    {
        //String s="123456789";
        int t=0;
        int c=0;boolean checks=false;
        for (int i=0;i<s.length();i++)
        {
            for(int j=1;j<=9;j++)
            {
                t =Character.getNumericValue(s.charAt(i));
                if (j==t) {
                    c++;
                    break;
                }
                
            }
        }
        if (c==9) {
            checks=true;
            //System.out.println(true);
            c=0;
        }
        return checks;
    }


    String number(int p)
    {
        int a=0;String q="";
        for (int i=1; i<=3; i++)
        {
            a=p*i;
            q=a+q;
        }
        return q;
    }

    void checksntom() 
    {
        fascinating obj2 = new fascinating();
        for (;m<n;m++)
        {
            String l="";
            l= obj2.number(m);
            if (obj2.nocheck(l)) {
                System.out.println(m);
            }
        }
    }
    public static void main(String[] args) {
        fascinating obj = new fascinating();
        obj.input();
        obj.checksntom();
    }
}
