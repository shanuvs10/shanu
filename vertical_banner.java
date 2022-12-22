import java.util.*;

public class vertical_banner {
    String s[];
    int big, n;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N : ");
        n = sc.nextInt();
        s = new String[n];
        System.out.println("Enter the String :");
        for (int i = 0; i < s.length; i++) {
            System.out.println("Team " + (i + 1) + " :");
            s[i] = sc.next();
            if (big < s[i].length()) {
                big = s[i].length();
            }
        }
        
    }

    void print(){
        int l = 0;
        for (int i = 0; i < n; i++)
        {
            if (s[i].length() > l)
            l = s[i].length(); 
        }
        for (int i = 0; i < l; i++)
        { 
            for (int j = 0; j < n; j++)
            { int len = s[j].length();
                if (i >= len)
                System.out.print(" \t"); 
                else 
                System.out.print(s[j].charAt(i) + "\t"); 
                }
        System.out.println(); 
        }
    }

    public static void main(String[] args) {
        vertical_banner obj = new vertical_banner();
        obj.input();
        obj.print();
    }
}
