package Loops;
import java.util.Scanner;

public class forComposite {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // check whether the number is composite or not
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int count=0;
        for(int i=1; i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count>2){
            System.out.println("given number is a composite number");
        }
        else{
            System.out.println("not composite");
        }

        //2nd method

        for(int i = 2;i<= n-1;i++){
            if(n%i==0){
                System.out.println("composite number");
                break;
            }

        }

        //3rd method

        boolean flag= true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0)
            {
                flag= false;
                break;
            }
        }

        if(n==1){
            System.out.println("neither prime nor composite.");
        }
        else if(flag == false){
            System.out.println("Composite number");
        }
        else{
            System.out.println("prime number");

        }

        //4th method (This is the approach commonly expected in coding interviews.) less time complexity
        flag=true;
        for(int i=2;i<= Math.sqrt(n);i++){ //Math.sqrt(n)
            if(n%i==0){
                flag=false;
                break;
            }
        }
        if(n==1){
            System.out.println("neither prime nor composite.");
        }
        else if(flag == false){
            System.out.println("Composite number");
        }
        else {
            System.out.println("prime number");
        }

    }
}
