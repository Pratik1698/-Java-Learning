package ifelse;

import java.util.Scanner;

public class FourDigitNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a 4digit number:");
        int num=sc.nextInt();

        if(num>999 && num<10000)
        {
            System.out.println("number is of 4 digit");
        }
        else
        {
            System.out.println("not a 4 digit number");
        }

    }
}
