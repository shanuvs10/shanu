import java.util.Scanner;

public class common_word {
    public static void main(String args[]) {
        String x = "";
        int d = 0, b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String n = sc.nextLine();
        String a[] = new String[100];
        int l = n.length();
        for (int i = 0; i < l; i++) {
            char ch = n.charAt(i);
            if (ch == '.' || ch == '?' || ch == '!') {
                b++;
            }
        }
        if (b == 2) {
            for (int i = 0; i < l; i++) {
                char ch = n.charAt(i);
                if (ch == '.' || ch == '?' || ch == '!') {
                    n = (n.substring(0, i + 1)) + (n.substring(i + 2, l));
                    System.out.println(n.substring(0, i + 1));
                    System.out.println(n.substring(i + 1));
                    break;
                }
            }
            for (int i = 0; i < l - 1; i++) {
                char ch = n.charAt(i);
                if (ch != '.' && ch != '?' && ch != '!' && ch != ' ') {
                    x = x + ch;
                } else {
                    a[d] = x;
                    d++;
                    x = "";
                }
            }
            System.out.println("COMMON WORDS FREQUENCY");
            for (int i = 0; i < d; i++) {
                int c = 1;
                for (int j = i + 1; j < d; j++) {
                    if (a[i].equals(a[j])) {
                        for (int k = j; k < d - 1; k++)
                            a[k] = a[k + 1];
                        d--;
                        c++;
                    }
                }
                if (c > 1)
                    System.out.println(a[i] + "\t\t" + c);
            }
        } else {
            System.out.print("INVALID INPUT");
        }
    }
}
