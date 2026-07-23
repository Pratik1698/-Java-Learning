package Loops;

public class forEven {
    public static void main(String[] args){

        // print all even numbers from 1 to 100

        for(int i=2; i<=100 ;i++){
            System.out.print(i+" ");
            i++;
        }

        System.out.println();

        for(int i=1;i<=100;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }

        // print all odd numbers divisble by 3 from 1 to 100

        for(int i = 1; i <= 100 ; i++){
            if(i % 3 == 0 && i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
