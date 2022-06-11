public class fascinating {
    void nocheck() 
    {
        String s="123456789";
        char r=' ',t=' ';
        int c=0;boolean checks=false;
        for (int i=0;i<s.length();i++)
        {
            System.out.println("1");
            for(int j=1;j<=9;j++)
            {
                System.out.println("2");
                r=s.charAt(i);
                t=(char)j;
                if (t==r) {
                    System.out.println("3");
                    c++;
                }
                
            }
        }
        if (c==9) {
            checks=true;
            System.out.println(true);
        }
        //return checks;
    }

    String number(int n)
    {
        int a=0;String q="";
        for (int i=1; i<=3; i++)
        {
            a=n*i;
            q=a+q;
        }
        return q;
    }
    public static void main(String[] args) {
        fascinating obj = new fascinating();
        obj.nocheck();
        System.out.println(obj.number(273));
    }
}
