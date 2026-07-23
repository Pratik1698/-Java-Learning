package Loops;
import java.sql.SQLOutput;
import java.util.Scanner;

public class forFactors {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number:");
        int n= sc.nextInt();

        for(int i = 1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.print(i+" ");
                System.out.print(n/i+" ");
            }
        }
    }
}
