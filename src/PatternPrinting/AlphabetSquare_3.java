package PatternPrinting;
import java.util.Scanner;
public class AlphabetSquare_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    /*  if n=4
       a a a a
       B B B B
       c c c c
       D D D D
    */
        /*
        Logic
If the row number is odd → print lowercase.
If the row number is even → print uppercase.
         */

        System.out.print("Enter a number:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i%2==0){

                    System.out.print((char) ('A' + i - 1) + " ");
                }
                else{
                    System.out.print((char) ('a' + i - 1) + " ");
                }

            }
            System.out.println();
        }
    }
}
