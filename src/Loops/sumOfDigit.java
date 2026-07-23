package Loops;
import java.util.Scanner;

public class sumOfDigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");

        int n=sc.nextInt();
        int num=n;
        int dig=0;

        int sum=0;

        while(num != 0){
            dig = num%10;
            sum += dig;
            num=num/10;
        }

        System.out.println("Sum of digits is:"+ sum);

    }

}
