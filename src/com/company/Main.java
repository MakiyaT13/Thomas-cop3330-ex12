/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Makiya Thomas
 */
package com.company;

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        int principal = input.nextInt();

        System.out.print("Enter the rate of interest: ");
        double rate = input.nextInt();

        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        double investment = principal * (years * (rate / 100)) + principal;

        System.out.printf("After %d years at %.1f, the investment will be worth $%.0f.\n", years, rate, investment);
    }
}