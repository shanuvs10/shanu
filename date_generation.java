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
    String yearcount(int n)
    {
        int month_no[]={31,28,31,30,31,30,31,31,30,31,30,31};
        if () {
            
        }
    }
    public static void main(String[] args) {
        date_generation obj =new date_generation();
        System.out.println(obj.leap_year(2018));
    }
}
