package Loops;
import java.util.Scanner;
public class raiseto {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // 2^ 6 = 2 * 2 * 2 * 2 * 2 * 2
        System.out.print("Enter number a:");
        int a=sc.nextInt();
        System.out.print("Enter number b:");
        int b=sc.nextInt();

        int pow =1;

        for(int i=1 ; i<= b ; i++){
            pow *= a; // a is multiplied with itself b times (a^b)
        }

        System.out.println(" a raise to b is:"+ pow);


    }
}
