package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
       // double a;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radius = input.nextDouble();
        input.close();
        double a =  Circle.getArea(radius) ;
        System.out.println("Area of Circle is: " + a);


    }
}


