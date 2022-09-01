import java.util.*;
public class fill_matrix {
    int n;
    String c1,c2,c3;

    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the N");
        n=sc.nextInt();  // to get the number
        if (n>3&&n<10) {
            System.out.println("First character: ");
        c1=sc.next(); //first character
        System.out.println("Second character: ");
        c2=sc.next(); //second character
        System.out.println("Third character: ");
        c3=sc.next(); //third character
        }
        else{ // executes if the n is not in the range
        System.out.println("Invalid input ");
            System.exit(0);
        }
    }
    void display(){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if (i==0&&j==0||j==0&&i==n-1||i==0&&j==n-1||i==n-1&&j==n-1){ //condition for corners
                    System.out.print(c1+"\t");
                } else if(i==0||j==0||i==n-1||j==n-1) { //condition for boundry
                    System.out.print(c2+"\t");
                }
                else{ //condition for non-boundry elements
                    System.out.print(c3+"\t");
                }

            }
            System.out.println("");
        }
    }
    public static void main(String[] args) { //main method
        fill_matrix obj=new fill_matrix();
        obj.input();
        obj.display();
    }
}
