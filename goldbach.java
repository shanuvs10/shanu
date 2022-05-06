import java.util.Scanner;

public class goldbach {
    int n;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter INPUT : ");
        n = sc.nextInt();
    }

    boolean primeno(int m) {
        boolean q = false;
        int c = 0;
        for (int i = 1; i <= m; i++) {
            if (m % i == 0) {
                c++;
            }
        }
        if (c == 2) {
            q = true;
        }
        return q;
    }

    void goldb() {
        int s;
        for (int i = n; i > 0; i--) {
            if (primeno(i)) {
                for (int j = i; j > 0; j--) {
                    if (primeno(j)) {
                        s = i + j;
                        if (s == n) {
                            System.out.println(j + " , " + i);
                        }
                    }
                }
            }
        }

    }
    void output(){
        if (n>9&&n<50) {
            if (n%2==0) {
                goldb();
            } else {
                System.out.println("Invalid input. Number is odd");
            }
        } else {
            System.out.println("Invalid input. Number out of range");
        }
    }
    public static void main(String[] args) {
        goldbach obj =new goldbach();
        obj.input();
        obj.output();
    }
}
