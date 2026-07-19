package Basics_java;
import java.util.Scanner;

public class practice_of_basics {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);

         /*
        System.out.println("Pratik Vijay Patil");
        System.out.print("enter 1st number:");
        double x = sc.nextDouble();
        System.out.print("enter 2nd number:");
        double y = sc.nextDouble();

        System.out.println("Addition of two numbers:" + (x + y));
        System.out.println("Substraction of two number is: " + ( x - y));
        System.out.println("Multiplication of two number is:" +( x * y));
        System.out.println("Division of two numbers is: " + (y / x));
        System.out.println("Modulo of two numbers is: " + (y % x));


        System.out.print("Enter radius:");
        int r= sc.nextInt();
        double pi= 3.141592;
        double area= pi*r*r;
        double circumference = 2* pi* r;

        System.out.println("Area of circle is:" + area);
        System.out.println("Circumference of circle is:" + circumference);


        System.out.print("Enter number to find square:");
        double num=sc.nextInt();

        double square= num* num;

        System.out.println("square of the numbers is:" + square);



        System.out.print("Enter 1st number:");
        double num1=sc.nextDouble();
        System.out.print("Enter 2nd number:");
        double num2=sc.nextDouble();
        System.out.print("Enter 3rd number:");
        double num3= sc.nextDouble();

        double sum= num1 + num2 + num3 ;

        double avg= sum/3;

        System.out.println("sum of Three number is:" + sum);

        System.out.println("Avg of Three number is:"+ avg);
        */
        System.out.print("Enter principle amount:");
        double p = sc.nextDouble();
        System.out.print("Enter rate:");
        double r = sc.nextDouble();
        System.out.print("Enter Time period(in years):");
        double t = sc.nextDouble();

        double SimpleInterest= p * r * t / 100 ;

        System.out.println("Simple interest is:" + SimpleInterest);

        System.out.print("Enter length:");
        double l = sc.nextDouble();
        System.out.print("Enter breadth:");
        double b = sc.nextDouble();

        double areaofrect= l * b ;

        System.out.println("Area of rectangle is:"+ areaofrect);
        sc.close();










    }
}
