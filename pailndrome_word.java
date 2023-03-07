import java.util.Scanner;

public class pailndrome_word {
    String strin;
    static String s;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        strin=sc.nextLine();   
        strin=strin.toUpperCase();
        strin=strin.trim();
        strin=strin+" ";
        s=strin;
    }
    void calc(){
        String s=strin,tem;
        System.out.println(s);
        s=s.substring(0,s.length()-1);
        int k=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' '||s.charAt(i)=='.'||s.charAt(i)=='?'){
                tem=s.substring(k,i); 
                tem=tem.trim();
                System.out.print(change(tem)+" ");
                k=i;
            }
        }
    }
    String change(String word){
        String fin="";
        if(word.charAt(word.length()-2)==word.charAt(word.length()-1)){
            fin=word;
            for (int i =word.length()-3; i >=0; i--) {
                fin=fin+word.charAt(i);
            }
        }
        else{
            fin=word;
            for (int i =word.length()-2; i >=0; i--) {
                fin=fin+word.charAt(i);
            }
        }
        return fin;
    }
    public static void main(String[] args) {
        int flag=0;
        pailndrome_word obj = new pailndrome_word();
        obj.input();
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
        }
        else{
            System.out.println("Invalid Statement");
            System.exit(0);
        }
        
    }
}
