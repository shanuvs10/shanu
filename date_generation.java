import java.util.Scanner;

public class date_generation {

  int dayno, year, dayadd;
  int arr[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
  String name[] = {
    "JANUARY",
    "FEBRUARY",
    "MARCH",
    "APRIL",
    "MAY",
    "JUNE",
    "JULY",
    "AUGUST",
    "SEPTEMBER",
    "OCTOBER",
    "NOVERMBER",
    "DECEMBER",
  };

  void input() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Day no. ");
    dayno = sc.nextInt();
    System.out.println("Enter the year ");
    year = sc.nextInt();
    System.out.println("Enter the Day to be added ");
    dayadd = sc.nextInt();
    if(year % 4 == 0)
     arr[1] = 29;
  }

  void yearcount(int n) {
    int i = 0;
    int a = 0, tem = 0;
    for (; i >= arr.length; i++) {
      tem = tem + arr[i];
      a = tem - a;
    }
    return;
  }

  void calc() {
    //IF IT IS A LEAP YEAR FEBRURAY SHOULD HAVE 29 DAYS
    if(year%400==0 || (year%100!=0 && year%4==0))
        month_days[1]=29;

        i=0;
   //FIND THE DATE CORRESPONDING TO THE DAY NUMBER
        day=day_number;
        while(day>month_days[i])
        {
            day-=month_days[i];
            i++;
        }
        month=i;
        //ADD SUFFIX AS PER THE DAY
        if(day%10==1 && day/10!=1)
            suffix="ST";
        else if(day%10==2 && day/10!=1)
            suffix="ND";
        else if(day%10==3 && day/10!=1)
            suffix="RD";
        else
            suffix="TH";
        System.out.println("OUTPUT:");
        //FIRST PART OF THE OUTPUT
        System.out.println(day+suffix+" "+
        month_names[month]+" "+year);

        //TO CALCULATE DATE AFTER N DAYS
        day_after=day_number+n;
        i=0;
        while(day_after>month_days[i])
        {
            day_after-=month_days[i];
            i++;
            if(i==12){
            i=0;
            year++;
            if(year%400==0 || (year%100!=0 && year%4==0))
                month_days[1]=29;
            }
        }
        day=day_after;
        month=i;
        //ADD SUFFIX AS PER THE DAY
        if(day%10==1 && day/10!=1)
            suffix="ST";
        else if(day%10==2 && day/10!=1)
            suffix="ND";
        else if(day%10==3 && day/10!=1)
            suffix="RD";
        else
            suffix="TH";
       //SECOND PART OF THE OUTPUT
        System.out.println(day+suffix+" "+
        month_names[month]+" "+year);
  }

  public static void main(String[] args) {
    date_generation obj = new date_generation();
    obj.input();
  }
}
