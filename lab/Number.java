package lab;

import java.util.*;
public class Number {
    String s;
    public static void main(String[] args) {
        Number obj = new Number();
        obj.input();
        obj.calc();
    }
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        s=sc.nextLine();
        String st="";
        System.out.println("");
        for (int i = 0; i <s.length(); i++) {
            char ch=s.charAt(i);
            if (Character.isDigit(ch)) {
                st=st+ch;
            } else {
                System.out.println("INVALID INPUT");
                System.exit(0);
            }
        }
        s=st;
    }
    void calc(){
        int in=1,dn=1;
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i)<s.charAt(i+1)) {
                System.out.println(1);
              in++ ;
            }
        }
        for (int i = 0; i < s.length()-1; i++) {
             if(s.charAt(i)>s.charAt(i+1)) {
                dn++;
            }
        }
        if (in==s.length()) {
            System.out.println(s+" IS AN INCREASING NUMBER");
        } else if(dn==s.length())  {
            System.out.println(s+" IS A DECREASING NUMBER");
        }else{
            System.out.println(s+" IS A BOUNCY NUMBER");
        }
    }
}

