import java.util.*;
public class potential_word {
    String strin;int a[];
    String b[];
    static String s;
    void input(){
        int c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        strin=sc.nextLine();   
        strin=strin.toUpperCase();
        strin=strin.trim();
        strin=strin+" ";
        s=strin;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' '){
                c++;
                }
                
            }System.out.println(c);
    }
    int pot(String s){
        int num=0;
        for (int i = 0; i < s.length(); i++) {
            num=num+(int)s.chartAt(i);
        }
        return num;
    }
    void calc(){
        String s=strin,tem;
        s=s.substring(0,s.length()-1);
        int k=0,c=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' '){
                tem=s.substring(k,i); 
                tem=tem.trim();
                pot(s);
                }
                
            }
        
        
        System.out.println("");
        System.out.println("No of words beginning and ending with a vowel : "+c);
    }
    
    public static void main(String[] args) {
        potential_word obj=new potential_word();
        obj.input();
    }
}
