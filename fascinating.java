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
        String ss="123456789";
        int t=0;
        int c=0;boolean checks=false;
        System.out.println("21");
        for (int i=1;i<=9;i++)
        {
            for(int j=0;j<ss.length();j++)
            {
                t =Character.getNumericValue(ss.charAt(j));
                if (i==t) {
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
        String q="";
        int n1=p;
        int n2=p*2;
        int n3=p*3;
        q=String.valueOf(n1)+String.valueOf(n2)+String.valueOf(n3);
        return q;
    }

    void checksntom() 
    {
        fascinating obj2 = new fascinating();
        int counting=0;
        System.out.println("The fascinating numbers are");
        for (;m<n;m++)
        {
            String l="";
            l= obj2.number(m);
            if (obj2.nocheck(l)) {
                System.out.print(m+"\t");
                counting++;
            }
        }
        System.out.println("");
        System.out.println("The  frequency of fascinating numbers is "+counting);
    }
    public static void main(String[] args) {
        fascinating obj = new fascinating();
        //System.out.println(nocheck("21"));
        //obj.input();
        //obj.checksntom();
    }
}
