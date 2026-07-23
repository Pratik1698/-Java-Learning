package Loops;
import java.util.Scanner;
public class countDigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();

        int num = n;
        int count=0;

        while(num>0){
            num=num/10;
            count ++;
        }
        System.out.println("Number of digits in a number:"+ count);
    }
}
