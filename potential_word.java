import java.util.*;
import java.io.*;
public class potential_word {
    String strin;int b[];
    String a[];
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
        for (int i = 0; i < a.length - 1; i++)
            for (int j = 0; j < a.length - i - 1; j++)
                if (pot(a[j]) > pot(a[j + 1])) {
                    so
                    String temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
    }
    void display(){
        for (int i = 1; i < a.length; i++) {
            System.out.println(b[i]);
        }
    }
  

    
    public static void main(String[] args) {
        potential_word obj=new potential_word();
        //obj.input();
        //obj.calc();
        //obj.display();
        System.out.println(obj.pot("h"));
    }
}
