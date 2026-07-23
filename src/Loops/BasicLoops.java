package Loops;
import java.util.Scanner;

public class BasicLoops {
    public static void main(String[] args){

        Scanner sc=new Scanner (System.in);

       for(int i=0;i<=10;i++){
           System.out.println("Pratik");
       }

       // Print numbers from 1 to 10

        for(int i=1; i<=10 ; i++){
            System.out.println(i);
        }

        // print Pratik 'n' times. Take 'n' input from user

        System.out.print("Input a Number:");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println("Pratik");
        }

        // print numbers from n to 1
        System.out.print("Input a Number:");
        n = sc.nextInt();

        for(int i = n; i>=1 ; i--){ // decreasing loop
            System.out.println(i);
        }
    }
}
