package com.java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double distance = 0;//as kilometer
        double pricePerKm = 0.10;
        int age;
        boolean oneWayTicket = true;

        Scanner input = new Scanner(System.in);

        System.out.print("Please type a distance as kilometer :");
        distance = input.nextDouble();

        System.out.print("Please type passenger's age :");
        age = input.nextInt();

        System.out.print("Type '1' for one-way, '2' return-ticket :");
        int selection = input.nextInt();
        oneWayTicket = selection == 1 ? true : false;

        if (distance < 0 || age < 0 || (selection != 1 && selection != 2)) {
            System.out.print("You provided improper data !");
        } else {
            double totalPrice = distance * pricePerKm;
            totalPrice = age < 12 ? totalPrice * 0.5 : totalPrice;
            totalPrice = age > 11 && age < 25 ? totalPrice - (totalPrice * 0.10) : totalPrice;
            totalPrice = age > 65 ? totalPrice - (totalPrice * 0.3) : totalPrice;
            totalPrice = oneWayTicket ? totalPrice : (totalPrice - (totalPrice * 0.2)) * 2;
            System.out.print("Total price is " + totalPrice);
        }
    }
}
