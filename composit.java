import java.util.*;

class composit {
    int n, m, c = 0;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m");
        m = sc.nextInt();// Geting m from user
        System.out.println("Enter n");
        n = sc.nextInt();// Geting n from user
    }

    boolean comp(boolean co) // method for finding composit no
    {
        for (int i = m; i <= n; i++) {
            co = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    co = true;
                    break;
                }
            }
        }
        return co;

    }

    void magic() {
        int num;
        while (m <= n)// finding magin no
        {
            num = m;
            while (num > 9) {
                int s = 0;
                while (num != 0) {
                    int d = num % 10;
                    num /= 10;
                    s += d;
                }
                num = s;
            }
            m++;
            if (num == 1) {
                c++;
                System.out.print(m + "  ");
            }
        }
        System.out.println("");
        System.out.println("Frequency of the composite integer is : " + c);

    }

    public static void main(String[] args) {
        composit obj = new composit();
        obj.input();
        if (obj.comp(true)) {
            obj.magic();
        } else {
            System.out.println("INVALID INPUT");
        }

    }
}