import java.util.Scanner;

public class common_word {
    String strin;
    String a[];int h=0;
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
        for (int i = 1; i < a.length; i++) {
            System.out.println(a[i]+" ");
        }

    }
  /*   void display(){
        int l=n.length();
        for(int i=0;i<l-1;i++){
            char ch=n.charAt(i);
            if(ch!='.'&&ch!='?'&&ch!='!'&&ch!=' ')
            {x=x+ch;}
            else{
            a[h]=x;
            h++;
            x="";}}
            System.out.println("COMMON WORDS FREQUENCY");
        for(int i=0;i<h;i++){
            int c=1;
            for(int j=i+1;j<h;j++){
            if(a[i].equals(a[j]))
            {for(int k=j;k<h-1;k++)
            a[k]=a[k+1];
            h--;
            c++;}}
            if(c>1)
            System.out.println(a[i]+"\t\t"+c);}}
    }*/
    void calc(){
        int c=0,b=0;
        for (int i = 0; i < a.length ; i++){
            for (int j = i; j < a.length ; j++){
                if (a[i].equals(a[j])) {
                        c++;
                }
            }
            
            if (c>1) {
               System.out.println(a[i]+" = "+ c);  
            }
            c=0; 
            }
        }
    public static void main(String[] args) {
        common_word obj = new common_word();
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
           //obj.display();
        }
        else{
            System.out.println("Invalid Statement");
            System.exit(0);
        }
    }
}
