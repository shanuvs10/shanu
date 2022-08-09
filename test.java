public class test {
   

private void run(String s) {
    String w,t;
        w = s;
        int a;
        int i = 0;

        //primecircular obj2 = new primecircular();

        for (i = 0; i <s.length(); i++)
        {
            a = Integer.parseInt(w);
            //System.out.println(a+"a");
            t = Character.toString(w.charAt(0));
            //System.out.println(t+'t');
            w = w.concat(t);
            //System.out.println(w+"c");
            w=w.substring(1, w.length());
            //System.out.println(w+"r");
            w = w.trim();
            System.out.println(w);
            //System.out.println("1");
        }
} 
void testerforcartoon(int n){
    if (n<=1000) {
      int y=n,q,s,c=0;int i=48;
         while (y>0) {

             q=y/i;
             y=y-(q*i);
             s=q*i;
             if (i>=6&&q!=0) {
                System.out.println(q+"*"+i+" = " +s);
                c=q+c;
             }
             if (q!=0&&i<6) {
                 System.out.println("the remaining box = "+q+"*"+i+" = " +s);
                 c++;
             }
             i=i/2;
         }
         System.out.println("total no of cartons = "+c); 
        } 
        else{
            System.out.println("INVALID INPUT");
        }
}
boolean primeno(int m){
    boolean q=false;
    int c=0;
    for(int i=1;i<= m; i++){
        if (m%i==0) {
            c++;
        }
    }
    if (c==2) {
        q=true;
    }
    return q;
}
void goldb(int n){
    int s;
    for (int i=n; i>0; i--) {
        if(primeno(i)) {
           for(int j=i; j>0; j--) {
            if(primeno(j)) {
                s=i+j;
                if (s==n) {
                    System.out.println(j+" , "+i);
                }
            }
            //System.out.print('*');
        }
        //System.out.println();
    }
    }  }  
 void fac(){
    String ss="123456789";
        int t=0,b=0;
        int c=0;boolean checks=false;
        System.out.println("21");
        for (char i='1';i<='9';i++ ) {
            for (char j = 0; j < ss.length(); j++) {
                System.out.print(i+"  ");
                t=ss.charAt(j);
                if (i==t) {
                    
                }
            }
            System.out.println();
        }
        if (c==9) {
            checks=true;
            c=0;
        }
        System.out.println(checks);
        
 }
 void stringing()
 {
    String s1="run", s2="childlikeness", s3 ="among us";
 String s=s1.charAt(0)+s2.substring(6,7)+(s1.concat(s2).charAt(3))+s2.charAt(s2.indexOf('k'))+"  "+s1.charAt((8-6+5-4-9+7-3+4-2))+
s3.charAt(s1.indexOf('n'))+s2.charAt(3)+s2.charAt(s2.lastIndexOf('l'));
System.out.println(s);
 }
public static void main(String[] args) {
    test obj = new test();
    obj.stringing();
}
}
