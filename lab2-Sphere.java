/*
Joseph Camarena
Math 130-01
Instructor: Mimi Rasky
August 28, 2018
Lab #2
*/

/*
Program Description:
Program will ask user to input the radii (in inches) for 5 different spheres,
in 5 appropriately named int variables. Program will convert inches to
centimeters and calculate the volume and the surface area for each of the 5 
spheres. Finally, the program will calculate and display the average of 
all of these radii to one decimal place, with alignment.
*/

import java.util.*;

public class Sphere
{
    public static void main (String [] args)
    {
        //define necessary data structures
        Scanner scan = new Scanner(System.in);
        int rad1, rad2, rad3, rad4, rad5;
        double radcm1, radcm2, radcm3, radcm4, radcm5;
        double vol1, vol2, vol3, vol4, vol5;
        double sa1, sa2, sa3, sa4, sa5;
        double avg;
        
        //Prompt user for Radii, in inches
        System.out.print("Please enter an integer radius measurement (in inches): ");
        rad1 = scan.nextInt();
        
        System.out.print("Please enter an integer radius measurement (in inches): ");
        rad2 = scan.nextInt();
        
        System.out.print("Please enter an integer radius measurement (in inches): ");
        rad3 = scan.nextInt();
        
        System.out.print("Please enter an integer radius measurement (in inches): ");
        rad4 = scan.nextInt();
        
        System.out.print("Please enter an integer radius measurement (in inches): ");
        rad5 = scan.nextInt();
        
        //Calculations
        //Converting Rad inches to centimeters
        radcm1 = rad1 * 2.54;
        radcm2 = rad2 * 2.54;
        radcm3 = rad3 * 2.54;
        radcm4 = rad4 * 2.54;
        radcm5 = rad5 * 2.54;
        
        //Calculating Volume
        vol1 = (double)4 / 3 * Math.PI * Math.pow(radcm1, 3);
        vol2 = (double)4 / 3 * Math.PI * Math.pow(radcm2, 3);
        vol3 = (double)4 / 3 * Math.PI * Math.pow(radcm3, 3);
        vol4 = (double)4 / 3 * Math.PI * Math.pow(radcm4, 3);
        vol5 = (double)4 / 3 * Math.PI * Math.pow(radcm5, 3);
        
        //Calculating Surface Area
        sa1 = 4 * Math.PI * Math.pow(radcm1, 2);
        sa2 = 4 * Math.PI * Math.pow(radcm2, 2);
        sa3 = 4 * Math.PI * Math.pow(radcm3, 2);
        sa4 = 4 * Math.PI * Math.pow(radcm4, 2);
        sa5 = 4 * Math.PI * Math.pow(radcm5, 2);
        
        //Calculate Average Rad
        avg = (double)(rad1 + rad2 + rad3 + rad4 + rad5) / 5;
        
        //Print the table
        System.out.println();
        System.out.println("Radius (in.)       Radius (cm.)             Volume (cu. cm.)       Surface Area (sq. cm.)");
        System.out.println("_________________________________________________________________________________________");
        System.out.println();
        System.out.printf("%7d%20.1f%30.1f%20.1f \n", rad1, radcm1, vol1, sa1);
        System.out.printf("%7d%20.1f%30.1f%20.1f \n", rad2, radcm2, vol2, sa2);
        System.out.printf("%7d%20.1f%30.1f%20.1f \n", rad3, radcm3, vol3, sa3);
        System.out.printf("%7d%20.1f%30.1f%20.1f \n", rad4, radcm4, vol4, sa4);
        System.out.printf("%7d%20.1f%30.1f%20.1f \n", rad5, radcm5, vol5, sa5);
        System.out.println();
        System.out.printf("The average of all the radii is: %.1f inches.\n", avg);
    }
}

/*
SAMPLE OUTPUT:
run:
Please enter an integer radius measurement (in inches): 5
Please enter an integer radius measurement (in inches): 4
Please enter an integer radius measurement (in inches): 3
Please enter an integer radius measurement (in inches): 2
Please enter an integer radius measurement (in inches): 1

Radius (in.)       Radius (cm.)             Volume (cu. cm.)       Surface Area (sq. cm.)
_________________________________________________________________________________________

      5                12.7                        8580.2              2026.8 
      4                10.2                        4393.1              1297.2 
      3                 7.6                        1853.3               729.7 
      2                 5.1                         549.1               324.3 
      1                 2.5                          68.6                81.1 

The average of all the radii is: 3.0 inches.
BUILD SUCCESSFUL (total time: 15 seconds)
*/
