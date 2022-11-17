import java.util.Scanner;

public class pailndrome_word {
    String strin;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        strin=sc.nextLine();   
        strin=strin.toUpperCase();
        strin=strin.trim();
        strin=strin+" ";
        for (int i = 0; i < strin.length(); i++) {
            if (strin.charAt(i)=='.'||strin.charAt(i)=='?'||strin.charAt(i)=='!') {
                System.out.println("Invalid Statement");
                System.exit(0);
            }
        }
    }
    void calc(){
        String s=strin,tem;
        int k=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' '){
                tem=s.substring(k,i); 
                tem=tem.trim();
                System.out.println(tem);
                //System.out.println(change(tem));
                k=i;
            }
        }
    }
    String change(String word){
        String fin="";
        if(word.charAt(word.length()-2)==word.charAt(word.length()-1)){
            fin=word;
            
            for (int i =word.length()-2; i >0; i--) {
                fin=""+word.charAt(i);
            }
        }
        else{
            fin=word;
            for (int i =word.length()-1; i >0; i--) {
                fin=""+word.charAt(i);
            }
        }
        return fin;
    }
    public static void main(String[] args) {
        pailndrome_word obj = new pailndrome_word();
        //obj.input();
        //obj.calc();
        System.out.println(obj.change("the"));
        
    }
}
