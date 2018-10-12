/*
Joseph Camarena
Professor Mimi Rasky
Math 130-01
September 30, 2018
Lab #5
*/

/*
Program Description:
Simple 7-sided dice game between yourself and a computer; each player has
their own set of a normal 7-sided die and a loaded 7-sided die. Game plays
25 rounds with a result displayed after each round. When all 25 rounds have
been played the final results display, which include total number of computer 
and user wins, number of ties, and the grand champion.
*/

import java.util.*;

public class DiceGame
{
    public static void main( String [] args)
    {
        Random rand = new Random();
        int round, compDie1, compDie2, userDie1, userDie2;
        int compCount = 0, userCount = 0, tieCount = 0;
        int compDiff, userDiff;
        
        for(round = 0; round < 25; round++) //25 iterations of the game
        {
            //computer rolls 2 die
            //die calculations
            compDie1 = rand.nextInt(7) + 1;
            compDie2 = rand.nextInt(100) + 1;
            if( compDie2 < 80) //begin loaded die operation
                compDie2 = 7;
            else if( compDie2 < 84)
                compDie2 = 6;
            else if( compDie2 < 88)
                compDie2 = 5;
            else if( compDie2 < 92)
                compDie2 = 4;
            else if( compDie2 < 95)
                compDie2 = 3;
            else if( compDie2 < 98)
                compDie2 = 2;
            else
                compDie2 = 1; //end loaded die operation
            compDiff = Math.abs(compDie1 - compDie2);
            
            //user rolls 2 die
            //die calculations
            userDie1 = rand.nextInt(7) + 1;
            userDie2 = rand.nextInt(100) + 1;
            if( userDie2 < 80) //begin loaded die operation
                userDie2 = 7;
            else if( userDie2 < 84)
                userDie2 = 6;
            else if( userDie2 < 88)
                userDie2 = 5;
            else if( userDie2 < 92)
                userDie2 = 4;
            else if( userDie2 < 95)
                userDie2 = 3;
            else if( userDie2 < 98)
                userDie2 = 2;
            else
                userDie2 = 1; //end loaded die operation
            userDiff = Math.abs(userDie1 - userDie2);
            
            //print computer results
            System.out.println("Computer Turn Round #" + (round + 1));
            for( int i = 0; i < 16; i++) //spacing with -
                System.out.print("- ");
            System.out.println();
            System.out.println("Normal Die:   " + compDie1);
            System.out.println("Loaded Die:   " + compDie2);
            System.out.println("Difference:   " + compDiff);
            System.out.println();
            //print user results
            System.out.println("User Turn Round #" + (round + 1));
            for( int i = 0; i < 16; i++) //spacing with -
                System.out.print("- ");
            System.out.println();
            System.out.println("Normal Die:   " + userDie1);
            System.out.println("Loaded Die:   " + userDie2);
            System.out.println("Difference:   " + userDiff);
            System.out.println();
            //print result
            if( compDiff == userDiff)
            {
                System.out.println("Tie!!");
                tieCount++;
            }
            else if(compDiff > userDiff)
            {
                System.out.println("The Computer wins this round!");
                compCount++;
            }
            else
            {
                System.out.println("The User wins this round!!");
                userCount++;
            }
            System.out.println();
        }//end for loop
        //print final results
        System.out.println("Total Number of Computer Wins: " + compCount);
        System.out.println();
        System.out.println("    Total Number of User Wins: " + userCount);
        System.out.println();
        System.out.println("    Total number of tie games: " + tieCount);
        System.out.println();
        if( compCount == userCount)
            System.out.println("There was an overall Tie!");
        else if( compCount > userCount)
            System.out.println("The Computer is the GRAND CHAMPION!!");
        else
            System.out.println("The User is the GRAND CHAMPION!!");
    }//end main
}//end class

/**
SAMPLE OUTPUT:
run:
Computer Turn Round #1
- - - - - - - - - - - - - - - - 
Normal Die:   1
Loaded Die:   7
Difference:   6

User Turn Round #1
- - - - - - - - - - - - - - - - 
Normal Die:   6
Loaded Die:   7
Difference:   1

The Computer wins this round!

Computer Turn Round #2
- - - - - - - - - - - - - - - - 
Normal Die:   6
Loaded Die:   7
Difference:   1

User Turn Round #2
- - - - - - - - - - - - - - - - 
Normal Die:   7
Loaded Die:   7
Difference:   0

The Computer wins this round!

Computer Turn Round #3
- - - - - - - - - - - - - - - - 
Normal Die:   4
Loaded Die:   5
Difference:   1

User Turn Round #3
- - - - - - - - - - - - - - - - 
Normal Die:   2
Loaded Die:   7
Difference:   5

The User wins this round!!

Computer Turn Round #4
- - - - - - - - - - - - - - - - 
Normal Die:   5
Loaded Die:   7
Difference:   2

User Turn Round #4
- - - - - - - - - - - - - - - - 
Normal Die:   5
Loaded Die:   7
Difference:   2

Tie!!

Computer Turn Round #5
- - - - - - - - - - - - - - - - 
Normal Die:   2
Loaded Die:   7
Difference:   5

User Turn Round #5
- - - - - - - - - - - - - - - - 
Normal Die:   4
Loaded Die:   4
Difference:   0

The Computer wins this round!

Computer Turn Round #6
- - - - - - - - - - - - - - - - 
Normal Die:   4
Loaded Die:   7
Difference:   3

User Turn Round #6
- - - - - - - - - - - - - - - - 
Normal Die:   4
Loaded Die:   7
Difference:   3

Tie!!

Computer Turn Round #7
- - - - - - - - - - - - - - - - 
Normal Die:   5
Loaded Die:   7
Difference:   2

User Turn Round #7
- - - - - - - - - - - - - - - - 
Normal Die:   6
Loaded Die:   7
Difference:   1

The Computer wins this round!

Computer Turn Round #8
- - - - - - - - - - - - - - - - 
Normal Die:   1
Loaded Die:   7
Difference:   6

User Turn Round #8
- - - - - - - - - - - - - - - - 
Normal Die:   6
Loaded Die:   7
Difference:   1

The Computer wins this round!

Computer Turn Round #9
- - - - - - - - - - - - - - - - 
Normal Die:   3
Loaded Die:   7
Difference:   4

User Turn Round #9
- - - - - - - - - - - - - - - - 
Normal Die:   2
Loaded Die:   7
Difference:   5

The User wins this round!!

Computer Turn Round #10
- - - - - - - - - - - - - - - - 
Normal Die:   1
Loaded Die:   7
Difference:   6

User Turn Round #10
- - - - - - - - - - - - - - - - 
Normal Die:   2
Loaded Die:   7
Difference:   5

The Computer wins this round!

Computer Turn Round #11
- - - - - - - - - - - - - - - - 
Normal Die:   3
Loaded Die:   3
Difference:   0

User Turn Round #11
- - - - - - - - - - - - - - - - 
Normal Die:   7
Loaded Die:   7
Difference:   0

Tie!!

Computer Turn Round #12
- - - - - - - - - - - - - - - - 
Normal Die:   6
Loaded Die:   4
Difference:   2

User Turn Round #12
- - - - - - - - - - - - - - - - 
Normal Die:   2
Loaded Die:   7
Difference:   5

The User wins this round!!

Computer Turn Round #13
- - - - - - - - - - - - - - - - 
Normal Die:   7
Loaded Die:   7
Difference:   0

User Turn Round #13
- - - - - - - - - - - - - - - - 
Normal Die:   2
Loaded Die:   7
Difference:   5

The User wins this round!!

Computer Turn Round #14
- - - - - - - - - - - - - - - - 
Normal Die:   2
Loaded Die:   7
Difference:   5

User Turn Round #14
- - - - - - - - - - - - - - - - 
Normal Die:   1
Loaded Die:   1
Difference:   0

The Computer wins this round!

Computer Turn Round #15
- - - - - - - - - - - - - - - - 
Normal Die:   5
Loaded Die:   7
Difference:   2

User Turn Round #15
- - - - - - - - - - - - - - - - 
Normal Die:   3
Loaded Die:   7
Difference:   4

The User wins this round!!

Computer Turn Round #16
- - - - - - - - - - - - - - - - 
Normal Die:   7
Loaded Die:   7
Difference:   0

User Turn Round #16
- - - - - - - - - - - - - - - - 
Normal Die:   1
Loaded Die:   7
Difference:   6

The User wins this round!!

Computer Turn Round #17
- - - - - - - - - - - - - - - - 
Normal Die:   6
Loaded Die:   7
Difference:   1

User Turn Round #17
- - - - - - - - - - - - - - - - 
Normal Die:   1
Loaded Die:   5
Difference:   4

The User wins this round!!

Computer Turn Round #18
- - - - - - - - - - - - - - - - 
Normal Die:   5
Loaded Die:   7
Difference:   2

User Turn Round #18
- - - - - - - - - - - - - - - - 
Normal Die:   7
Loaded Die:   7
Difference:   0

The Computer wins this round!

Computer Turn Round #19
- - - - - - - - - - - - - - - - 
Normal Die:   4
Loaded Die:   7
Difference:   3

User Turn Round #19
- - - - - - - - - - - - - - - - 
Normal Die:   6
Loaded Die:   7
Difference:   1

The Computer wins this round!

Computer Turn Round #20
- - - - - - - - - - - - - - - - 
Normal Die:   4
Loaded Die:   7
Difference:   3

User Turn Round #20
- - - - - - - - - - - - - - - - 
Normal Die:   1
Loaded Die:   7
Difference:   6

The User wins this round!!

Computer Turn Round #21
- - - - - - - - - - - - - - - - 
Normal Die:   2
Loaded Die:   6
Difference:   4

User Turn Round #21
- - - - - - - - - - - - - - - - 
Normal Die:   1
Loaded Die:   7
Difference:   6

The User wins this round!!

Computer Turn Round #22
- - - - - - - - - - - - - - - - 
Normal Die:   3
Loaded Die:   7
Difference:   4

User Turn Round #22
- - - - - - - - - - - - - - - - 
Normal Die:   6
Loaded Die:   7
Difference:   1

The Computer wins this round!

Computer Turn Round #23
- - - - - - - - - - - - - - - - 
Normal Die:   7
Loaded Die:   6
Difference:   1

User Turn Round #23
- - - - - - - - - - - - - - - - 
Normal Die:   5
Loaded Die:   7
Difference:   2

The User wins this round!!

Computer Turn Round #24
- - - - - - - - - - - - - - - - 
Normal Die:   4
Loaded Die:   5
Difference:   1

User Turn Round #24
- - - - - - - - - - - - - - - - 
Normal Die:   2
Loaded Die:   7
Difference:   5

The User wins this round!!

Computer Turn Round #25
- - - - - - - - - - - - - - - - 
Normal Die:   3
Loaded Die:   7
Difference:   4

User Turn Round #25
- - - - - - - - - - - - - - - - 
Normal Die:   1
Loaded Die:   7
Difference:   6

The User wins this round!!

Total Number of Computer Wins: 10

    Total Number of User Wins: 12

    Total number of tie games: 3

The User is the GRAND CHAMPION!!
BUILD SUCCESSFUL (total time: 0 seconds)
*/
