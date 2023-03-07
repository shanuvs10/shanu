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
}
