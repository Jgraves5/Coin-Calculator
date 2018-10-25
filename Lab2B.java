package lab2b;

import java.util.Scanner;

public class Lab2B {
   
    public static void main(String[] args) {
       int dollar;
       int halfdollar;
       int quarter;
       int dime;
       int nickle;
       int penny;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the total in dollars and cents (example: 1.25): ");
        
        double money = input.nextDouble();
        
        int totalmoney = (int) (money * 100);
    
        dollar = (totalmoney /100);
        
        totalmoney = totalmoney % 100;
        
        halfdollar = (totalmoney / 50);
        
        totalmoney = (totalmoney % 50);
               
        quarter = (totalmoney/25);
        
        totalmoney = (totalmoney % 25);
        
        dime = (totalmoney / 10);
        
        totalmoney = totalmoney % 10;
        
        nickle = (totalmoney / 5);
        
        totalmoney = totalmoney % 5;
        
        penny = (totalmoney / 1);
        
        System.out.println("Dollars: " + dollar);
        System.out.println("Half-Dollars: " + halfdollar);
        System.out.println("Quarters: " + quarter);
        System.out.println("Dimes: " + dime);
        System.out.println("Nickles: " + nickle);
        System.out.println("Pennies: " + penny);
             
    }
    
}
