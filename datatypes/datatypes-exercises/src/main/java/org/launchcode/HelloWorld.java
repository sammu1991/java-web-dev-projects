package org.launchcode;

import java.util.Scanner;


public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name here:");
        String name = input.nextLine();
        input.close();
    }
}
