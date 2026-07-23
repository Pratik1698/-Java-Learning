package Loops;
import java.util.Scanner;
public class Factorialnum {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        // 8= 8*7*6*5*4*3*2*1
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int fact=1;
        int digit=0;

        while(n != 0){
            digit=n;
            fact=fact * digit;
            n=n-1;
        }

        System.out.println("factorial of number is:"+ fact);

    }
}
