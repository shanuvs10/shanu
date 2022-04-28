import java.util.*;

public class primecircular {
    String s;
    String t;
    int a,count=0;

    void input() {
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();//Geting input from user
    }

    void calc() {
        String w;
        w = s;
        int i = 0;
        primecircular obj2 = new primecircular();

        for (i = 0; i <s.length(); i++)// calculating the prime circular no
        {
            a = Integer.parseInt(w);
            if (obj2.Prime(a)) {
                count++;
            } 
            t = Character.toString(w.charAt(0));
            w = w.concat(t);
            w=w.substring(1, w.length());
            w = w.trim();
            System.out.println(w);

        }

    }

    boolean Prime(int n) {//boolean method
        boolean q = false;
        int co = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {//prime no checking
                co++;
            }
        }
        if (co == 2) {
            q = true;
        }
        return q;
    }
    void print(){
        if (count==s.length()) {//checks the prime circular
            System.out.println(s+" is a circular prime ");
        } else {
            System.out.println(s+" is not a circular prime ");
        }
    }

    public static void main(String[] args) {
        primecircular obj = new primecircular();
        obj.input();
        obj.calc();
        obj.print();
    }
}
