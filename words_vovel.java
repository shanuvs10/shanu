import java.util.Scanner;
public class words_vovel {
String strin;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        strin=sc.nextLine();
        
        strin=strin.toUpperCase();
        strin.trim();
        strin=" "+strin;
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
        char s=ch.charAt(0);
        char e=ch.charAt((ch.length())-1);
        System.out.println(s+e);
        if ((s=='A'||s=='E'||s=='I'||s=='O'||s=='U')&&(e=='A'||e=='E'||e=='I'||e=='O'||e=='U')) {
                System.out.println("-checks-");
                return true;
            }
        
        return false;
    }
    void words(String s)
    {
        int k=0,c=0;
        System.out.println(66);
        for (int i = 0; i < s.length(); i++) {
            System.out.println("44");
            if (s.charAt(i)==' ') {
                System.out.println(55);
                System.out.println(s.substring(k, i));
                if (check(s.substring(k, i))) {
                    System.out.println("1");
                    c++;
                }
                k=i;
            }
        }
        System.out.println("No of words beginning and ending with a vowel : "+c);
    }

    void display()
    {
        words(strin);
    }

    void calc(){
        String s=strin,tem;
        int k=0,c=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' '){
                tem=s.substring(k,i);
                if(check(tem)){
                    c++;
                }
                k=i;
            }
        }
        System.out.println("vovels "+c);
    }
    public static void main(String[] args) {
        words_vovel obj = new words_vovel();
        obj.input();
        obj.calc();
        //obj.display();
        //System.out.println((obj.check("OUO")));
        //obj.words("WHER ARE YOU NOW AEIOU OU YOU ");
    }
}
