import java.util.Scanner;
public class words_vovel {
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
    int check(String charte)
    {
        char temp1,temp2;
        temp1=charte.charAt(0);
        temp2=charte.charAt((charte.length())-1);
        if ((temp1=='A'||temp1=='E'||temp1=='I'||temp1=='O'||temp1=='U')&&(temp2=='A'||temp2=='E'||temp2=='I'||temp2=='O'||temp2=='U')) {
                return 1;
            }
        
        return 0;
    }

    void calc(){
        String s=strin,tem;
        s=s.substring(0,s.length()-1);
        int k=0,c=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' '){
                tem=s.substring(k,i); 
                tem=tem.trim();
                if(check(tem)==1){
                    System.out.print(tem +" ");
                    c++;
                }
                k=i;
            }
        }
        k=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' '){
                tem=s.substring(k,i); 
                tem=tem.trim();
                if(check(tem)==0){
                    System.out.print(tem +" ");
                }
                k=i;
            }
        }
        System.out.println("");
        System.out.println("No of words beginning and ending with a vowel : "+c);
    }
    public static void main(String[] args) {
        int flag=0;
        words_vovel obj = new words_vovel();
        obj.input();
        //obj.calc();
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
