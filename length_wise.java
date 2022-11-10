import java.util.Scanner;

public class length_wise {
    String strin,a[];
    int l;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        strin=sc.nextLine();
        
        strin=strin.toUpperCase();
        strin.trim();
        strin=strin+" ";
        for (int i = 0; i < strin.length(); i++) {
            if (strin.charAt(i)=='.'||strin.charAt(i)=='?'||strin.charAt(i)=='!') {
                System.out.println("Invalid Statement");
                System.exit(0);
            }
            if (strin.charAt(i)==' ') {
                a=new String [l++];
            }
        }

    }
    void split(){
        System.out.println(l);int k=0;
        for (int i = 0; i < strin.length(); i++) {
            if(strin.charAt(i)==' '){
                for (int j = k; j < a.length; j++) {
                    a[j]=strin.substring(k,i);
                }    
                k=i;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        length_wise obj = new length_wise();
        obj.input();
        obj.split();
    }
}
