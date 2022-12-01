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
                
            }
            a=new int[c+1];
            b= new String [c+1];
            System.out.println(c);
    }
    int pot(String s){
        int num=0;
        for (int i = 0; i < s.length(); i++) {
            num=num+s.charAt(i);
        }
        return num;
    }
    void calc(){
        String s=strin,tem;
        s=s.substring(0,s.length()-1);
        int k=0,big=0;
        String temps="";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' '){
                tem=s.substring(k,i); 
                tem=tem.trim();
                if(pot(s)>=big){
                    temps=temps+tem;
                    big=pot(s);
                }
                }
                
            }
            System.out.println(temps);
    }
    void display(){
        for (int i = 1; i < a.length; i++) {
            System.out.println(b[i]);
        }
    }
    void sort() {
        int tem;String tems;
        int k=0;
        for (int i = 1; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                if (a[j] > a[j + 1]) {
                    tem = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tem;
                    tems = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = tems;
                }
            }
        }
    }

    
    public static void main(String[] args) {
        potential_word obj=new potential_word();
        obj.input();
        obj.calc();
        //obj.display();
        //System.out.println(obj.pot("DO"));
    }
}
