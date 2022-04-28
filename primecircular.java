import java.util.*;
public class primecircular {
    String s;
    int a;
    void input ()
    {
        Scanner sc = new Scanner(System.in);
        s=sc.nextLine();
        a=sc.nextInt();
    }
    void calc()
    {
        primecircular obj2 =new primecircular();
        for (int i=0; i<=a.length(); i++); i++>)
        {

        }
        if (obj2.Prime(a)) {
            System.out.println("true");
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
