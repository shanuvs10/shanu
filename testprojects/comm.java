package testprojects;

import java.util.Scanner;

public class comm {
    public static void main(String args[]) {
        String x = "";
        int h = 0, z = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String n = sc.nextLine();
        String a[] = new String[100];
        int l = n.length();
        for (int i = 0; i < l; i++) {
            char ch = n.charAt(i);
            if (ch == '.' || ch == '?' || ch == '!') {
                z++;
            }
        }
        if (z == 2) {
            for (int i = 0; i < l; i++) {
                char ch = n.charAt(i);
                if (ch == '.' || ch == '?' || ch == '!') {
                    String p = (n.substring(0, i + 1));
                    String m = (n.substring(i + 2, l));
                    n = p + m;
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
                    a[h] = x;
                    h++;
                    x = "";
                }
            }
            System.out.println("COMMON WORDS FREQUENCY");
            for (int i = 0; i < h; i++) {
                int c = 1;
                for (int j = i + 1; j < h; j++) {
                    if (a[i].equals(a[j])) {
                        for (int k = j; k < h - 1; k++)
                            a[k] = a[k + 1];
                        h--;
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
