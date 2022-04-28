public class test {
   public static void main(String[] args) {
       test obj = new test();
       obj.run("1234");
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
}
