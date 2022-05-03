import java.util.*;

public class cartoon { 
    int n;   
    void input()
    {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
    }
    void calc()
    {
        int y=n;
           for (int i=1; y>0; i++) {
               y=y/48;
           }
    }
}
