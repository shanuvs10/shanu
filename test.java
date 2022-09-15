public class test {
   int sum;

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
 void biggest()
 {
    int m[][]=new int[3][3];
    int big=0;
    m[0][0]=1;m[0][1]=2;m[0][2]=3;
    m[1][0]=4;m[1][1]=5;m[1][2]=6;
    m[2][0]=7;m[2][1]=8;m[2][2]=9;
    
    
    for (int i = 0; i < m.length; i++) {
        for (int j = 0; j < m[i].length; j++) {
            if (m.length-i==j) {
                if (m[i][j]>big) {
                    big=m[i][j];
                }
            }
        }
    }
    System.out.println("big is " +big);
 }

 int dig(int n){
    
    if(n<=0){
        return 0;
    }
    else {
        sum=+dig(n/10)%10;
        System.out.println(sum);
        return sum;
    }
 }
public static void main(String[] args) {
    test obj = new test();
    System.out.println(obj.dig(198));
}
}
