/*
Joseph Camarena
Math 130-01
Instructor: Mimi Rasky
August 30, 2018
Project #1
*/

/*
Program Description:
Processing payment on a loan using simplified formulas.
*/

import java.util.*;

public class Project1
{
    public static void main (String [] args)
    {
        //define necessary data structures
        Scanner scan = new Scanner(System.in);
        double currentBal, monthPay, apr;
        double monthDecR, numIn, principal, numPayIn, endBal;
        
        //prompt user for Current Balance, Monthly Payment, and APR
        System.out.print("Enter current balance in dollars and cents: ");
        currentBal = scan.nextDouble();
        
        System.out.print("Enter monthly payment in dollars and cents: ");
        monthPay = scan.nextDouble();
        
        System.out.print("Enter annual interest rate in percent form (ex: 8.75): ");
        apr = scan.nextDouble();
        System.out.println();
        
        //calculations
        //monthly decimal interest rate:
        monthDecR = apr / 100 / 12;
        
        //interest amount for this payment:
        numIn = currentBal * monthDecR;
        
        //amount to be applied to the principal:
        principal = monthPay - numIn;
        
        //ending balance
        endBal = currentBal - principal;
        
        //print table
        System.out.printf("             Annual interest rate: %12.2f%%\n", apr);
        System.out.printf("                Beginning Balance: $%11.2f\n", currentBal);
        System.out.printf("                Amount of payment: $%11.2f\n", monthPay);
        System.out.printf("      Amount applied to principal: $%11.2f\n", principal);
        System.out.printf("       Amount applied to interest: $%11.2f\n", numIn);
        System.out.printf("                   Ending balance: $%11.2f\n", endBal);
    } //end main
} //end class

/**
SAMPLE OUTPUT:
run:
Enter current balance in dollars and cents: 95000.00
Enter monthly payment in dollars and cents: 1583.33
Enter annual interest rate in percent form (ex: 8.75): 11.01

             Annual interest rate:        11.01%
                Beginning Balance: $   95000.00
                Amount of payment: $    1583.33
      Amount applied to principal: $     711.70
       Amount applied to interest: $     871.63
                   Ending balance: $   94288.30
BUILD SUCCESSFUL (total time: 8 seconds)
*/
