import java.util.*;

public class cartoon { 
    int n;   
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input ");
        n=sc.nextInt();//Geting n from user
    }
    void calc()
    {
        if (n<=1000) {
            int y=n,q,s,c=0;int i=48;
               while (y>0) {
      
                   q=y/i;
                   y=y-(q*i);//calculating the next no
                   s=q*i;
                   if (i>=6&&q!=0) {
                      System.out.println(q+"*"+i+" = " +s);
                      c=q+c;
                   }
                   if (q!=0&&i<6) {
                       System.out.println("the remaining box = "+q+"*"+i+" = " +s);
                       c++;
                   }
                   i=i/2;//updating i
               }
               System.out.println("total no of cartons = "+c); 
              } 
              else{
                  System.out.println("INVALID INPUT");//print for invalid Input
              }
    }
    public static void main(String[] args) {
        cartoon obj = new cartoon();
        obj.input();
        obj.calc();
    }
}
