import java.util.Scanner;

public class date_generation {

  int dayno, year, dayadd, day;
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
    if(year%400==0 || (year%100!=0 && year%4==0)){
     arr[1] = 29;
    }
  }

  int findmonth(int n) {
    int i=0,month=0;
    day=dayno;
        while(day>arr[i])
        {
            day-=arr[i];
            i++;
        }
        month=i;
    return month;
  }

  void calc() {
    display(findmonth(dayno));
    System.out.println("Days after "+dayadd);
    int nexday=dayno+dayadd;
    display(findmonth(nexday));
  }

  void display(int p){
    String suf;
    if(day%10==1 && day/10!=1)
            suf="ST";
        else if(day%10==2 && day/10!=1)
            suf="ND";
        else if(day%10==3 && day/10!=1)
            suf="RD";
        else
            suf="TH";
        System.out.println(day+suf+" "+
        name[p]+" "+year);
  }

  public static void main(String[] args) {
    date_generation obj = new date_generation();
    obj.input();
    obj.calc();
  }
}
