import java.util.Scanner;

public class Main {

    public static double calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate){
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        System.out.println("Your total meal price is: " + result);
        return  result;
    }
    public static void main(String[] args) {
       // calculateTotalMealPrice(25.90,.10,.10);
       // calculateTotalMealPrice(25,.18,.08);
        double totalPrice  = calculateTotalMealPrice(100,.2,.08);
        System.out.println("Total per person: " + totalPrice/5 );

    }
}
