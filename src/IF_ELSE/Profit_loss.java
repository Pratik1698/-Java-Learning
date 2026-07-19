package IF_ELSE;

import java.util.Scanner;

public class Profit_loss {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        double profit;
        double loss;

        System.out.print("Enter cost price of product:");
        double costPrice=sc.nextDouble();

        System.out.print("Enter Selling price of product:");
        double sellingPrice=sc.nextDouble();

        if(sellingPrice>costPrice){
            System.out.println("Seller has made the profit.");
            profit=sellingPrice-costPrice;
            System.out.println("Profit of seller is:" +profit);
        }
        else if(sellingPrice<costPrice){
            System.out.println("Seller has made the loss.");
            loss=costPrice-sellingPrice;
            System.out.println("loss of seller is:" +loss);
        }
        else if(sellingPrice==costPrice){
            System.out.println("Seller has no profit and no loss.");
            System.out.println("seller have soled at:" +costPrice);
        }
    }
}
