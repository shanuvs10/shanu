import java.util.*;
public class potential_word {
    String strin;
    String a[];
    static String s;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        strin=sc.nextLine();   
        strin=strin.toUpperCase();
        strin=strin.trim();
        strin=" "+strin+" ";
        s=strin;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='.'||s.charAt(i)=='?'||s.charAt(i)=='!') {
                strin=strin.substring(0, i);
            }
        }
        a = strin.split(" ");

    }
    int pot(String s){
        int num=0;
        for (int i = 0; i < s.length(); i++) {
            num=num+s.charAt(i);
        }
        return num;
    }
    void calc(){
        for (int i = 1; i < a.length; i++) {
            System.out.println(a[i]+" = "+pot(a[i]));
        }
        for (int i = 0; i < a.length - 1; i++){
            for (int j = 0; j < a.length - i - 1; j++){
                if (pot(a[j]) > pot(a[j + 1])) {
                    String temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            }
        }
        
    
    void display(){
        for (int i = 1; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }
  

    
    public static void main(String[] args) {
        potential_word obj=new potential_word();
        int flag=0;
        obj.input();
        s=s.trim();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='.'||s.charAt(i)=='?'||s.charAt(i)=='!'||s.charAt(i)==' '||Character.isLetter(s.charAt(i))) {
                flag=1;
            }
            else{
                flag=0;
            }
            
        }
        if(flag==1){
           obj.calc(); 
           obj.display();
        }
        else{
            System.out.println("Invalid Statement");
            System.exit(0);
        }
    }
}
