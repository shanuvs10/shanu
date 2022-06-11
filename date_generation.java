import javax.lang.model.util.ElementScanner14;

public class date_generation {
    
    boolean leap_year(int year)
    {
        boolean q=false;
        if (year % 4==0) {
            q=true;
        }
        return q; 
    }
    void yearcount(int n)
    {
        int i=0;
        int a=0,tem=0;
        int month_no[]={31,28,31,30,31,30,31,31,30,31,30,31};
        for(;i >= month_no.length;i++) {
            tem=tem+month_no[i];
            a=tem-a;

        }
        return ;
    }
    public static void main(String[] args) {
        date_generation obj =new date_generation();
        System.out.println(obj.leap_year(2018));
    }
}
