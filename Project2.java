/*
Joseph Camarena
Math 130-01
Instructor: Mimi Rasky
September 20, 2018
Project #2
*/

/*
Program Description:
Continuation of Project 1. Program lets user enter data for a series of
borrowers. Program will accept all data and display the result. When
user is finished, they should enter 0 for current balance to quit. Program
will then display total number of loan payments processed and terminate.
*/

import java.util.*;

public class Project2
{
    public static void main(String [] args)
    {
        //define necessary data structures
        Scanner scan = new Scanner(System.in);
        int count = 0;
        double currentBal, monthPay, apr;
        double monthDecR, numIn, principal, endBal;
        //new permanent named constants
        final int ZERO = 0;
        final int MONTHS = 12;
        final int CONVERT = 100;
        
        //priming read of current balance
        System.out.print("Enter current balance in dollars and cents: ");
        currentBal = scan.nextDouble();
        
        while(currentBal > ZERO)
        {
            //prompt user for Monthly Payment and APR
            System.out.print("Enter monthly payment in dollars and cents: ");
            monthPay = scan.nextDouble();
            
            System.out.print("Enter annual interest rate in percent form (ex: 8.75): ");
            apr = scan.nextDouble();

            count++; //number of payments processed
            
            //calculations
            //monthly decimal interest rate:
            monthDecR = apr / CONVERT / MONTHS;
            //interest amount for this payment:
            numIn = currentBal * monthDecR;
            
            //condition: if borrower's payment more than amount needed to pay off loan
            if(monthPay > currentBal)
            {
                monthPay = currentBal + numIn; //monthly payment adjusted to exactly pay off loan
                principal = currentBal; //recalculate amount applied to principal
                endBal = ZERO; //ending balance should equal zero
            }
            else
            {
                principal = monthPay - numIn; //amount to be applied to the principal:
                endBal = currentBal - principal; //ending balance
            }
            //print table
            System.out.println();
            System.out.printf("             Annual interest rate: %12.2f%%\n", apr);
            System.out.printf("                Beginning Balance: $%11.2f\n", currentBal);
            System.out.printf("                Amount of payment: $%11.2f\n", monthPay);
            System.out.printf("      Amount applied to principal: $%11.2f\n", principal);
            System.out.printf("       Amount applied to interest: $%11.2f\n", numIn);
            System.out.printf("                   Ending balance: $%11.2f\n", endBal);
            System.out.println();
            //next line either terminates or continues while loop
            System.out.print("Enter current balance in dollars and cents: ");
            currentBal = scan.nextDouble();
        } //end while
        System.out.println();
        System.out.println("Number of payments processed:               " + count);
    } //end main
} //end class


/**
SAMPLE OUTPUT:
run:
Enter current balance in dollars and cents: 461.19
Enter monthly payment in dollars and cents: 741.27
Enter annual interest rate in percent form (ex: 8.75): 11.18

             Annual interest rate:        11.18%
                Beginning Balance: $     461.19
                Amount of payment: $     465.49
      Amount applied to principal: $     461.19
       Amount applied to interest: $       4.30
                   Ending balance: $       0.00

Enter current balance in dollars and cents: 83485.94
Enter monthly payment in dollars and cents: 524.67
Enter annual interest rate in percent form (ex: 8.75): 7.21

             Annual interest rate:         7.21%
                Beginning Balance: $   83485.94
                Amount of payment: $     524.67
      Amount applied to principal: $      23.06
       Amount applied to interest: $     501.61
                   Ending balance: $   83462.88

Enter current balance in dollars and cents: 49.78
Enter monthly payment in dollars and cents: 204.05
Enter annual interest rate in percent form (ex: 8.75): 9.98

             Annual interest rate:         9.98%
                Beginning Balance: $      49.78
                Amount of payment: $      50.19
      Amount applied to principal: $      49.78
       Amount applied to interest: $       0.41
                   Ending balance: $       0.00

Enter current balance in dollars and cents: 89335.56
Enter monthly payment in dollars and cents: 19500.00
Enter annual interest rate in percent form (ex: 8.75): 9.94

             Annual interest rate:         9.94%
                Beginning Balance: $   89335.56
                Amount of payment: $   19500.00
      Amount applied to principal: $   18760.00
       Amount applied to interest: $     740.00
                   Ending balance: $   70575.56

Enter current balance in dollars and cents: 20998.63
Enter monthly payment in dollars and cents: 238.75
Enter annual interest rate in percent form (ex: 8.75): 8.30

             Annual interest rate:         8.30%
                Beginning Balance: $   20998.63
                Amount of payment: $     238.75
      Amount applied to principal: $      93.51
       Amount applied to interest: $     145.24
                   Ending balance: $   20905.12

Enter current balance in dollars and cents: 0

Number of payments processed:               5
BUILD SUCCESSFUL (total time: 55 seconds)
*/
