import java.util.*;
public class vertical_banner {
    String s[];
    int big,n;

    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the N : ");
        n=sc.nextInt();
        s=new String[n];
        System.out.println("Enter the String :"); 
        for (int i = 0; i < s.length; i++) {
            System.out.println("Team "+(i+1)+" :");
            s[i]=sc.next();
            if(big<s.length){
                big=s.length;
            }
        }
    }
    void print(){
        for (int i = 0; i <big; i++) {
            for (int j = 0; j < n; j++) {
                
            }
        }
    }
    public static void main(String[] args) {
        vertical_banner obj = new vertical_banner();
        obj.input();
        obj.print();
    }
}
