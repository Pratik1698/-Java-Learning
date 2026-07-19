package IF_ELSE;

import java.util.Scanner;

public class divsibleby5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a + ve number:");
        int n= sc.nextInt();

        if(n%5==0){
            System.out.println("Number is divisible by 5");
        }
        else{
            System.out.println("number is not divsible by 5");
        }
    }
}
