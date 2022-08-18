import java.util.*;

public class matrix_rotation {

  int m, a[][];

  void input() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number M: ");
    m = sc.nextInt();
    a = new int[m][m];
    System.out.println("Enter the matrix");
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < m; j++) {
        a[i][j] = sc.nextInt();
      }
    }
  }

  void rotate() {
    for (int i = 0; i < m; i++) {
      for (int j = m - 1; j >= 0; j--) {
        System.out.print(a[j][i] + "\t");
      }
      System.out.println("");
    }
  }

  void sum() {
    int s = 0;
    s = a[0][0] + a[m - 1][0] + a[0][m - 1] + a[m - 1][m - 1];
    System.out.println("sum of conner is " + s);
  }

  void print() {
    if (m < 2 || m > 10) {
      System.out.println("INVALID INPUT");
    } else {
      System.out.println("Original matrix");
      for (int i = 0; i < m; i++) {
        for (int j = 0; j < m; j++) {
          System.out.print(a[i][j] + "\t");
        }
        System.out.println("");
      }
      System.out.println("Rotarted matrix");
      rotate();
      sum();
    }
  }

  public static void main(String[] args) {
    matrix_rotation obj = new matrix_rotation();
    obj.input();
    obj.print();
  }
}
