import java.util.*;

class isbn {
    String a;
    int n, sum;
    boolean tem;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the code");
        a = sc.nextLine();
    }

    void calc() {
        if (a.length() == 10) {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == 'x' || a.charAt(i) == 'X')
                    n = 10;
                else
                    n = Integer.parseInt(Character.toString(a.charAt(i)));
                sum += (n * (a.length() - i));
            }

        }

    }

    void print() {
        if(a.length()!=10)
        System.out.println("INVALID INPUT");
        else{
        System.out.println("sum " + sum);
          if (sum % 11 == 0)
            System.out.println("leaves no remainder -valid isbn code ");
          else
            System.out.println("INVALID INPUT");
        }
    }

    public static void main(String[] args) {
        isbn obj = new isbn();
        obj.input();
        obj.calc();
        obj.print();
    }
}