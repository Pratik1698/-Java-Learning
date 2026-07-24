package PatternPrinting;
import java.util.Scanner;

public class AlphabetSquare_small {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n= sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print((char)('a'+j-1)+" ");
            }
            System.out.println();
        }
    }
}
