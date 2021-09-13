/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kaylee Laughner
 */
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        System.out.println("What is the order amount?");
        Scanner input = new Scanner(System.in);
        int subtotal = input.nextInt();

        System.out.println("What is the state?");
        Scanner input2 = new Scanner(System.in);
        String state = input2.nextLine();

        double rate = 0;

        if(state.equals("WI")) {
            rate = 0.055;
        }
        double tax = rate*subtotal;
        double total = tax+subtotal;

        System.out.println("The subtotal is $" + subtotal + ".");
        System.out.printf("The tax is $%.2f \n", tax);
        System.out.printf("The total is $%.2f", total);
    }
}