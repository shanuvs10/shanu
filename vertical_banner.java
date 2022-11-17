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
            if(big<s[i].length()){
                big=s[i].length();
            }
        }
        System.out.println(big);
    }
    void print(){
        for (int i = 0; i <n; i++) {
            //System.out.println(s[i]);
            for (int j = 0; j < big; j++) {
                if (s[i].length()<big) {
                    System.out.print(s[i].charAt(j));
                }
                else{
                    System.out.println(s[i].charAt(j));
                }
            }
        }
    }
    public static void main(String[] args) {
        vertical_banner obj = new vertical_banner();
        obj.input();
        obj.print();
    }
}
