import java.util.*;
public class vertical_banner {
    String s[];

    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the N : ");
        s=new String[sc.nextInt()];
        System.out.println("Enter the String :"); 
        for (int i = 0; i < s.length; i++) {
            System.out.println("Team "+(i+1)+" :");
            s[i]=sc.next();
        }
    }
    void print(){
        for (int i = 0; i < s.length; i++) {
            
        }
    }
}
