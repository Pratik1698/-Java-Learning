package Loops;

public class forTableof17 {
    public static void main(String[] args){
        System.out.println("Table of 17:");

        for(int i = 1; i <= 10; i++ ){

            System.out.println(17*i);

        }

        System.out.println();

        // requires 154 iterations of loop
        for(int i = 17 ; i <= 170 ; i++){
            if(i%17==0){
                System.out.println(i);
            }
        }
    }
}
