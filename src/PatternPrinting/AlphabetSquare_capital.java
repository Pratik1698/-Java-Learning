package PatternPrinting;
import java.util.Scanner;
public class AlphabetSquare_capital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*  A B C D
            A B C D
            A B C D
            A B C D
         */
        System.out.print("Enter a number:");
        int n = sc.nextInt();

        for(int i = 1;i<= n; i++){
            for(int j=1;j<=n;j++){
                System.out.print((char)('A'+j-1)+" ");
            }
            System.out.println();
        }
    }
}