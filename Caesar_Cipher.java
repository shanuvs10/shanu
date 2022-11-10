import java.util.Scanner;
public class Caesar_Cipher {

String str;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        str=sc.nextLine();
        if (str.length()<3&&str.length()>100) {
            System.exit(0);
        }
    }
    void modify(){
        for(int i=0;i<str.length();i++){
            if (Character.isLetter(str.charAt(i))) {
                if ((str.charAt(i)>='A'&& str.charAt(i)<='M')||(str.charAt(i)>='a'&& str.charAt(i)<='m')) {
                    System.out.print((char)((int)str.charAt(i)+13));
                }
                else{
                    System.out.print((char)((int)str.charAt(i)-13));
                }
            }
            else{
                System.out.print(str.charAt(i));
            }
        }
    }
    public static void main(String[] args) {
        Caesar_Cipher obj = new Caesar_Cipher();
        obj.input();
        System.out.println("he cipher text is ");
        obj.modify();
    }
}
