package IF_ELSE;

import java.util.Scanner;

public class coordinateifelse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter point (X):");
        int X = sc.nextInt();

        System.out.print("Enter point (Y):");
        int Y=sc.nextInt();

        if(X == 0 && Y == 0){
            System.out.println("Lies on origin");
        }
        else if(X == 0 ){
            System.out.println("Lies on Y Axis");
        }
        else if(Y == 0 ){
            System.out.println("Lies on X Axis");
        }
        else if(X > 0 && Y > 0){
            System.out.println("Lies in 1st quadrant");
        }
        else if(X < 0 && Y > 0){
            System.out.println("Lies in 2nd quadrant");
        }
        else if(X < 0 && Y < 0){
            System.out.println("Lies in 3rd quadrant");
        }
        else{
            System.out.println("Lies in 4th quadrant");
        }


    }
}
