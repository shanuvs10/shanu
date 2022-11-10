import java.util.Scanner;

public class common_word {
    String strin,a[];
    int l;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        strin=sc.nextLine();
        
        strin=strin.toUpperCase();
        strin.trim();
        //strin=" "+strin;
        for (int i = 0; i < strin.length(); i++) {
            if (strin.charAt(i)=='.'||strin.charAt(i)=='?'||strin.charAt(i)=='!') {
                System.out.println("Invalid Statement");
                System.exit(0);
            }
            if (strin.charAt(i)==' ') {
                a=new String [l++];
            }
        }

    }
}
