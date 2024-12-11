package org.launchcode;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the length:");
        double length = input.nextDouble();
        System.out.println("Enter the width:");
        double width = input.nextDouble();
        double area = length*width;
        System.out.println("Area of the rectangle is:"  + area);

    }

}
