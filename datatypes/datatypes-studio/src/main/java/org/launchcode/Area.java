package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double radius;
        System.out.println("Enter a radius: ");
        do {
            if (input.hasNextDouble()) {
                 radius= input.nextDouble();
                if (radius > 0) {
                    break;
                } else {
                    System.out.println("Number must be positive. Enter a valid number: ");
                }
            } else {
                System.out.println("Not a number. Enter a valid number: ");
                input.next();
            }
        } while (true);


        double a = Circle.getArea(radius);
        System.out.println("Area of Circle is: " + a);

    }


    }


