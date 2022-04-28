import java.util.*;
public class primecircular {
    String s;
    char t;
    int a;
    void input ()
    {
        Scanner sc = new Scanner(System.in);
        s=sc.nextLine();
        a=sc.nextInt();
    }
    void calc()
    {
        String w;
        w=s;
        int i=0;
        primecircular obj2 =new primecircular();
        while (1>0) {
            
        
        for (i=0; i<=s.length(); i++); 
        {
            t=s.charAt(i);
            w=w+t;
            w=w.replace(s.charAt(s.length()),' ');
            w=w.trim();
            System.out.println(w);
         }
         if (obj2.Prime(a)) {
            System.out.println("true");
        }
      }

    }
    boolean Prime(int n)
    {
        boolean q= false;
        int co=0;
        for (int i=1; i<=n ; i++) {
            if (n%i==0) {
                co++;
            }
        }
        if (co==2) {
            q=true;
        }
        return q;
    }
    public static void main(String[] args) {
        primecircular obj =new primecircular();
        obj.input();
        obj.calc();
    }
}
