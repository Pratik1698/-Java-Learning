package IF_ELSE;
import java.util.Scanner;

public class ternary_OddEven {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter a positive number:");
        int a=sc.nextInt();

        System.out.println((a%2==0) ? "Even": "Odd" );

    }

}
