import java.util.*;

class small {
    int n, m;
    int cout;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m");
        m = sc.nextInt();
        System.out.println("Enter n");
        n = sc.nextInt();

    }

    void calc() {
        small obj1 = new small();
        if (m < 100 || m > 10000 || n < 1 || n > 99) {
            System.out.println("Invalid Input");
        } else {
            int i = m;
            while (obj1.sum(i) != n) {
                i++;
            }

            System.out.println("the no required is " + i);
            for (int q = i; q > 0; q /= 10) {
                cout++;
            }
            System.out.println("Total no of digits is " + cout);
        }

    }


    int sum(int n) {
        int sum = 0;
        int d = 0;
        while (n > 0) {
            d = n % 10;
            sum += d;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        small obj = new small();
        obj.input();
        obj.calc();

    }

}
