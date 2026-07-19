package IF_ELSE;
import java.util.Scanner;

public class isInteger {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        double n=sc.nextDouble();

        int x= (int) n;
        if(n-x>0){
            System.out.println("Not an Integer");
        }
        else{
            System.out.println("it is a integer");
        }
    }
}
