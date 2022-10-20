import java.util.Scanner;
public class words_vovel {
String strin;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        strin=sc.next();
        strin=strin.toUpperCase();
        //strin=" "+strin;
        for (int i = 0; i < strin.length(); i++) {
            if (strin.charAt(i)=='.'||strin.charAt(i)=='?'||strin.charAt(i)=='!') {
                System.out.println("Invalid Statement");
                System.exit(0);
            }
        }
    }
    boolean check(String ch)
    {
        ch.trim();
        if (ch.charAt(0)=='A'||ch.charAt(0)=='E'||ch.charAt(0)=='I'||ch.charAt(0)=='O'||ch.charAt(0)=='U') {
            if (ch.charAt(ch.length()-1)=='A'||ch.charAt(ch.length()-1)=='E'||ch.charAt(ch.length()-1)=='I'||ch.charAt(ch.length()-1)=='O'||ch.charAt(ch.length()-1)=='U') {
                System.out.println("-checks-");
                return true;
            }
        }
        return false;
    }
    void words(String s)
    {
        int k=0,c=0;
        System.out.println(66);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==' ') {
                System.out.println(55);
                System.out.println(s.substring(k, i));
                if (check(s.substring(k, i))) {
                    System.out.println("1");
                    c++;
                }
                k=i+1;
            }
        }
        System.out.println("No of words beginning and ending with a vowel : "+c);
    }

    void display()
    {
        words(strin);
    }
    public static void main(String[] args) {
        words_vovel obj = new words_vovel();
        obj.input();
        obj.display();
        //obj.words("WHER ARE YOU NOW AEIOU OU YOU ");
    }
}
