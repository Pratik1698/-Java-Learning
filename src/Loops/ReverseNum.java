package Loops;
import java.util.Scanner;
public class ReverseNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a num:");
        int n=sc.nextInt();
        int num=n;

        int reverse=0;
        int digit=0;

        while(num != 0){
            digit=num % 10;
            reverse=reverse * 10 + digit;
            num=num/10;

        }

        if(n == reverse){
            System.out.println("reverse number:"+ reverse +" "+ "and it is a pallindrome");
        }
        else{
            System.out.println("reverse number is:"+ reverse);
        }

        System.out.print("sum of reverse and number  is:"+ (n+reverse));

    }
}
