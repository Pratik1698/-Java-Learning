package Loops;
import java.sql.SQLOutput;
import java.util.Scanner;

public class forSequence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        // 1,5,2,4,3,3,4,2,5,1
        int j = n;

        for(int i=1;i<=j;i++){
            System.out.println(i);
            System.out.println(j);
            j--;
        }
    }
}
