import java.util.Scanner;

public class date_generation {

  int dayno, year, dayadd, day;
  int arr[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };// array of months
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

  void input() { //inputing all the values
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Day no. ");
    dayno = sc.nextInt();
    System.out.println("Enter the year ");
    year = sc.nextInt();
    System.out.println("Enter the Day to be added ");
    dayadd = sc.nextInt();
    if(dayno<1 || dayno>366){
    System.out.println("INVALID DAY NUMBER.");
    System.exit(1);}
    else if(year<1000 || year >9999){
    System.out.println("INVALID YEAR");
    System.exit(1);}
    else if(dayadd<1 || dayadd>100){
    System.out.println("INVALID DATE AFTER VALUE.");
    System.exit(1);}
    if(year%400==0 || (year%100!=0 && year%4==0)){//check for leap year
     arr[1] = 29;
    }
  }

  int findmonth(int n) { //finding no of months
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

  void calc() { //calculation for the day
    display(findmonth(dayno));
    System.out.println("Days after "+dayadd);
    int nexday=dayno+dayadd;
    display(findmonth(nexday));
  }

  void display(int p){ // printing the day
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

  public static void main(String[] args) { // main method
    date_generation obj = new date_generation();
    obj.input();
    obj.calc();
  }
}
