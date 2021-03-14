package com.vinapplications;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Cafe {
    public static void main(String[] args) {
        // creating object for Scanner class to get inputs from keyboard
        Scanner keyBoardScanner = new Scanner(System.in);
        //inputting customer name from keyboard
        System.out.print("Customer name: ");
        //inputting customer choice from keyboard
        String customer_name = keyBoardScanner.nextLine();
        System.out.print("Type of beverage you want to order (Coffee / Tea / T / C)");
        String type = keyBoardScanner.nextLine();
        //  The word “coffee” or ANY combination of upper- and lower-case letters that correctly spells coffee it will take
        if (type.equalsIgnoreCase("coffee") || type.equalsIgnoreCase("c")) {
            type = "coffee"; // if the condition is true and matches the input as well it will take input for coffee.
        }
       // The word “tea” or ANY combination of upper- and lower-case letters that correctly spells tea it will take
        else if (type.equalsIgnoreCase("tea") || type.equalsIgnoreCase("t")) {
            type = "tea";  // else the condition is false and matches the input as well it will take input for tea.
        } else {
            System.exit(0); // otherwise it will exit
        }
        double sizePrice = 0.00; // initialize variable for checking the size of cup.
        System.out.print("Size of " + type + " you want to order (Small / Medium / Large / S / M / L)");
        String size = keyBoardScanner.nextLine();
        if (size.equalsIgnoreCase("s") || size.equalsIgnoreCase("small")) {
            size = "small";
            sizePrice = 1.50;
        } else if (size.equalsIgnoreCase("m") || size.equalsIgnoreCase("medium")) {
            size = "medium";
            sizePrice = 2.50;
        } else if (size.equalsIgnoreCase("l") || size.equalsIgnoreCase("large")) {
            size = "large";
            sizePrice = 3.25;
        } else {
            System.exit(0);
        }
        double flavourPrice = 0.00;
        String flavour = "";
        if(type.equalsIgnoreCase("coffee") ){
            System.out.print("Flavor of " + type + " you want to order (None / Vanilla / Chocolate / v / c)");
            flavour = keyBoardScanner.nextLine(); // for taking reading flavour
            if (flavour.equalsIgnoreCase("none")) {
                flavour = "no"; // if they say no this one will run
                flavourPrice = 0.00;
            } else if (flavour.equalsIgnoreCase("vanilla") || flavour.equalsIgnoreCase("v")) {
                flavour = "vanilla"; // if they say vanilla this one will run and print this flavourprice
                flavourPrice = 0.25;
            } else if (flavour.equalsIgnoreCase("chocolate") || flavour.equalsIgnoreCase("c")) {
                flavour = "chocolate";// if they say chocolate this one will run and print this flavourprice
                flavourPrice = 0.75;
            } else {
                System.exit(0);// otherwise it will exit
            }

            // if they order tea then this falvours will show and print with their price.
        } else if (type.equalsIgnoreCase("tea")) {
            System.out.print("Flavor of " + type + " you want to order (None / Lemon / Mint / l / m)");
            flavour = keyBoardScanner.nextLine();
            if (flavour.equalsIgnoreCase("none")) {
                flavour = "no";
                flavourPrice = 0.00;
            } else if (flavour.equalsIgnoreCase("lemon") || flavour.equalsIgnoreCase("l")) {
                flavour = "vanilla";
                flavourPrice = 0.25;
            } else if (flavour.equalsIgnoreCase("mint") || flavour.equalsIgnoreCase("m")) {
                flavour = "mint";
                flavourPrice = 0.50;
            } else {
                System.exit(0);
            }
        }
        DecimalFormat decFormat = new DecimalFormat("##.00"); // for finding round figure.
        double total = sizePrice + flavourPrice ; // calculating total
        double tax = (total*13)/100; // calculating tax
        double grandTotal = total +tax; // calculating grandtotal
// It is our output line that will print our result.
        System.out.println("For " + customer_name + ", a "+size+" "+type+", "+flavour+" flavouring. Cost: $" + decFormat.format(grandTotal));
    }
}

