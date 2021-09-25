/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Conroy Ricketts
 */

package ex26;

import java.util.Scanner;
import java.lang.Math;

public class PaymentCalculator
{
    public static void main(String[] args)
    {
        Scanner scan;
        double balance, APR, monthlyPay;
        int months;
        String output;

        System.out.println("What is your balance?");
        scan = new Scanner(System.in);
        balance = Double.parseDouble(scan.next());

        System.out.println("What is the APR on the card (as a percent)?");
        scan = new Scanner(System.in);
        APR = Double.parseDouble(scan.next());

        System.out.println("What is the monthly payment you can make?");
        scan = new Scanner(System.in);
        monthlyPay = Double.parseDouble(scan.next());

        months = calculateMonthsUntilPaidOff(balance, APR, monthlyPay);
        output = String.format("It will take you %d months to pay off this card.", months);

        System.out.println(output);
    }

    public static int calculateMonthsUntilPaidOff(double balance, double APR, double monthlyPay)
    {
        //n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        APR /= 100;
        return (int)( ( -1.0 * (1.0/30.0) ) * Math.log( 1.0 + balance / monthlyPay * ( 1.0 - Math.pow(1.0+(APR/365.0),30.0) ) ) / Math.log(1.0 + (APR/365.0) ) );
    }
}
