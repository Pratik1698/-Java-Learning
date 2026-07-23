package ifelse;
import java.util.Scanner;

public class Greatestof3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter 1st number:");
        int num1= sc.nextInt();
        System.out.print("Enter 2nd number:");
        int num2= sc.nextInt();
        System.out.print("Enter 3rd number:");
        int num3= sc.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("Greatest number is num1:"+ num1);
        }
        else if(num2>num3){
            System.out.println("Greatest number is num2:"+ num2);
        }
        else{
            System.out.println("Greatest number is num3:"+ num3);
        }
    }
}
