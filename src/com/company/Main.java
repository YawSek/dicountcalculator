package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int percent = 100;

        Scanner input = new Scanner(System.in);

        System.out.print("Discount Rate: ");
        float discount1 = input.nextFloat();

        float discount = discount1 / percent;

        System.out.print("item price: ");
        float oriPrice = input.nextFloat();

        float newPrice = oriPrice * discount;

        double finalPrice = oriPrice - newPrice;
        System.out.println("Discount price: " + NumberFormat.getCurrencyInstance().format(finalPrice));


    }
}
