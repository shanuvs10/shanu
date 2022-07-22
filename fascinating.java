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
        //String ss="1234596871";
        int t=0;
        int c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0,c=0;boolean checks=false;
        //System.out.println("21");
        for (int i=0;i<s.length();i++)
        {
              t =Character.getNumericValue(s.charAt(i));
                if (t==1) {
                    c1++;
                }else if(t==2) {
                    c2++;
                }else if(t==3) {
                    c3++;
                }else if(t==4) {
                    c4++;
                }else if(t==5) {
                    c5++;
                }else if(t==6) {
                    c6++;
                }else if(t==7) {
                    c7++;
                }else if(t==8) {
                    c8++;
                }else if(t==9) {
                    c9++;
                }
        }
        c=c1+c2+c3+c4+c5+c6+c7+c8+c9;
        if (c==9&&c1==1&&c2==1&&c3==1&&c4==1&&c5==1&&c6==1&&c7==1&&c8==1&&c9==1) {
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
        int counting=0;
        System.out.println("The fascinating numbers are");
        while (m<n) {
            if(nocheck(number(m)))
            {
                System.out.print(m+"\t");
                counting++;
            }
            m++;
        }
        if (counting==0) {
            System.out.println("NIL");
        }
        System.out.println("");
        System.out.println("The  frequency of fascinating numbers is "+counting);
    }
    public static void main(String[] args) {
        fascinating obj = new fascinating();
        //obj.nocheck("21");
        obj.input();
        obj.checksntom();
    }
}
