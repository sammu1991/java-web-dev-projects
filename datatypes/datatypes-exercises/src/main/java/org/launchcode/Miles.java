package org.launchcode;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Miles {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the distance in miles:");
        double miles= input.nextDouble();
        System.out.println("Enter the gas in gallons:");
        double gallons= input.nextDouble();
        double mpg= miles/gallons;
        System.out.println("Your vehicle's mileage is: " + mpg + " mpg");

    }
}
