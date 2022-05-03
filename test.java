public class test {
   public static void main(String[] args) {
       test obj = new test();
       obj.testerforcartoon(140);
   }

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
    int y=n,q,s,c=0;int i=48;
         while (y>0) {

             q=y/i;
             y=y-(q*i);
             s=q*i;
             if (q!=0) {
                System.out.println(q+"*"+i+" = " +s);
                c=q+c;
             }
             i=i/2;
         }
         System.out.println("total no of cartons = "+c);  
}
}
