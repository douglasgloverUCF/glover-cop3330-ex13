/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Douglas Glover
 */
package base;

import java.util.Scanner;

/*
Simple interest is something you use only when making a quick guess. Most investments use a compound interest formula,
which will be much more accurate. And this formula requires you to incorporate exponents into your programs.

Write a program to compute the value of an investment compounded over time. The program should ask for the starting amount,
the number of years to invest, the interest rate, and the number of periods per year to compound.

The formula you’ll use for this is A = P(1 + r/n)^(n*t) where

P is the principal amount.
r is the annual rate of interest.
t is the number of years the amount is invested.
n is the number of times the interest is compounded per year.
A is the amount at the end of the investment.

Example Output

What is the principal amount? 1500
What is the rate? 4.3
What is the number of years? 6
What is the number of times the interest is compounded per year? 4
$1500 invested at 4.3% for 6 years compounded 4 times per year is $1938.84.
 */
public class App {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        App myApp = new App();
        int principal = myApp.getPrincipal();
        double rate = myApp.getRate();
        int years = myApp.getYears();
        int compound = myApp.getCompound();
        myApp.findInvestment(principal, rate, years, compound);
    }
    int getPrincipal()
    {
        System.out.print("What is the principal amount? ");
        return in.nextInt();
    }
    double getRate()
    {
        System.out.print("What is the rate? ");
        return in.nextDouble() / 100;
    }
    int getYears()
    {
        System.out.print("What is the number of years? ");
        return in.nextInt();
    }
    int getCompound()
    {
        System.out.print("What is the number of times the interest is compounded per year? ");
        return in.nextInt();
    }
    void findInvestment(int principal, double rate, int years, int compound)
    {
        double worth = principal * Math.pow((1 + rate / compound), (compound * years));
        System.out.printf("$%d invested at %.1f%% for %d years compounded %d times per year is $%.2f.", principal, rate * 100, years, compound, worth);
    }
}
