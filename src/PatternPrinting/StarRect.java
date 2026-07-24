package PatternPrinting;

public class StarRect {
    public static void main(String[] args){
        /*
        Outer loop (i) → controls rows.
        Inner loop (j) → controls columns.
         */
        for(int i=1; i<=3;i++){
            for(int j=1;j<=5;j++){
                System.out.print( '*' +" ");
            }
            System.out.println(" ");
        }
    }
}
