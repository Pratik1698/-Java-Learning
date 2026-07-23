package ifelse;

import java.util.Scanner;

public class AreaPeriRect {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length:");
        int length=sc.nextInt();

        System.out.print("Enter Breadth:");
        int breadth=sc.nextInt();

        int area = length * breadth ;
        int perimeter = 2*(length + breadth);

        if(area > perimeter){
            System.out.println("Area of rectangle is greater than perimeter of rectangle");
        }
        else{
            System.out.println("Area of rectangle is not greater than perimeter of rectangle");
        }

    }
}
