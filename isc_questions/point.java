package isc_questions;

import java.util.*;
public class point {
    double x,y;
    point(){
        x=0.0;
        y=0.0;
    }
    void readpoint(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  X :");
        x=sc.nextDouble();
        System.out.println("Enter  Y :");
        y=sc.nextDouble();

    }
    point midpoint(point a,point b){
        a.x=(a.x+b.x)/2;
        a.y=(a.y+b.y)/2;
        return b;
    }
    void displaypoint(){
        System.out.println("X = "+x);
        System.out.println("Y = "+y);
    }
    public static void main(){
        point obj1=new point();
        obj1.readpoint();
        point obj2=new point();
        obj2.readpoint();
        point obj3=new point();
        obj3.midpoint(obj1,obj2);
        obj3.displaypoint();

    }
}
