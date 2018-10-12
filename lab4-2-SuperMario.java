/*
Joseph Camarena
Professor Mimi Rasky
Math 130-01
September 28, 2018
Lab #4-2
*/

/*
Program Description:
Program that recreates half-pyramids using hashes for blocks.
Prompts user for a positive integer height no greater than 23.
Input generates the desired half-pyramids.
*/

import java.util.*;

public class SuperMario
{
    public static void main (String [] args)
    {
        //define necessary data structures
        int row, height;
        Scanner scan = new Scanner(System.in);
        //priming read: loops until given integer between 1 and 23 inclusive
        System.out.print("Enter a height between 1 and 23 (inclusive): ");
        height = scan.nextInt();
        while(height < 1 || height > 23)
        {
            System.out.print("Height: ");
            height = scan.nextInt();
        }
        //pyramid display
        for(row = 1; row <= height; row++) //prints rows equal to value of height
        {
            for(int i = 1; i <= height - row; i++)
                System.out.print(" ");
            for(int i = row; i >= 1; i--) //prints left side of pyramid
                System.out.print("#");
            System.out.print("  "); //separator for left and right side
            for(int i = 1; i <= row; i++) //prints right-side of pyramid
                System.out.print("#");
            System.out.println();
        }
    }//end main
}//end class


/**
SAMPLE OUTPUT:
run:
Enter a height between 1 and 23 (inclusive): 4
   #  #
  ##  ##
 ###  ###
####  ####
BUILD SUCCESSFUL (total time: 3 seconds)

run:
Enter a height between 1 and 23 (inclusive): 0
Height: -5
Height: 40
Height: 24
Height: 5
    #  #
   ##  ##
  ###  ###
 ####  ####
#####  #####
BUILD SUCCESSFUL (total time: 11 seconds)

run:
Enter a height between 1 and 23 (inclusive): 0
Height: 24
Height: 15
              #  #
             ##  ##
            ###  ###
           ####  ####
          #####  #####
         ######  ######
        #######  #######
       ########  ########
      #########  #########
     ##########  ##########
    ###########  ###########
   ############  ############
  #############  #############
 ##############  ##############
###############  ###############
BUILD SUCCESSFUL (total time: 9 seconds)
*/
