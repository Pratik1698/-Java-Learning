package IF_ELSE;

import java.util.Scanner;

public class magnitude {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a number:");
        int n=sc.nextInt();
        if(n < 0)
        {
            n = -n;
        }
        if(n > 69){
            System.out.println("number is greater than 69");
        }
        else{
            System.out.println("Number is less than 69");
        }

    }
}