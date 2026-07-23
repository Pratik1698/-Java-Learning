package Loops;
import java.util.Scanner;

public class forAP {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        // display this AP - 2,5,8,11.. upto 'n' terms
        // 2 + (n-1) * 3

        System.out.print("Enter number of terms:");
        int n=sc.nextInt();

        for(int i = 1; i <= n ;i++){
            System.out.print(2 + (i-1) *3+" ");
        }

        System.out.println();

        for(int i = 2; i <= 3*n-1 ; i+=3){
            System.out.print(i+" ");
        }

        // 3rd way

        int a = 2 , d = 3;
        for(int i = 0;i <= n ; i++){
            System.out.print(a+" ");
            a=a+d;
        }

        //
    }

}
