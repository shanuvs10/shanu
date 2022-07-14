import java.util.Scanner;

public class date_generation {
    int dayno,year,dayadd;
    int arr[]={31,28,31,30,31,30,31,31,30,31,30,31};
    String name[]={"JANUARY", "FEBRUARY","MARCH",
    "APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER",
    "OCTOBER","NOVERMBER","DECEMBER"};
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Day no. ");
        dayno= sc.nextInt();
        System.out.println("Enter the year ");
        year= sc.nextInt();
        System.out.println("Enter the Day to be added ");
        dayadd= sc.nextInt();

    }
    
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
    void calc()
    {
        if ((dayno<=366&&dayno>=1)&&(year>99&&year<10000)&&(dayadd>0&&dayadd<=100)) {
            if (leap_year(year)) {
                
            } else {
                
            }
        }
    }
    public static void main(String[] args) {
        date_generation obj =new date_generation();
        
    }
}
