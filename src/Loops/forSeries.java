package Loops;

public class forSeries {
    public static void main(String[] args){
        // 99,95,91,87..

        int a=99 , d=-4;

        for(int i=99;i > 0;i-=4){
            System.out.print(a+" ");
            a += d;
        }

    }
}
