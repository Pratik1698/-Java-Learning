package PatternPrinting;
import java.util.Scanner;

public class AlphabetSquare_2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        /* if n=3
           A A A
           B B B
           C C C

         */
        System.out.println("Enter a number:");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print((char)('A'+i-1)+" ");
            }
            System.out.println();
        }

    }
}
