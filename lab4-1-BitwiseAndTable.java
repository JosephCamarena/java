/*
Joseph Camarena
Professor Mimi Rasky
Math 130-01
September 28, 2018
Lab #4-1
*/

/*
Program Description:
bitwise-AND table for all combinations of values 0 through 15.
*/

public class BitwiseAndTable
{
    public static void main(String [] args)
    {
        int row, column;
        //          --START OUTER TABLE--
        System.out.println("\t\t\t Bitwise-AND Table");
        System.out.print("     ");
        for(int i = 0; i <= 15; i++) //displays top numbers 0-15 with spacing
            System.out.printf("%4d", i);
        System.out.println();
        for(int i = 0; i <= 70; i++) //spacing with -
            System.out.print("-");
        System.out.println();
        //          --END OUTER TABLE--
        //          --START INNER TABLE--
        for(row = 0; row <= 15; row++) //prints rows 0-15
        {
            System.out.printf("%3d |", row); //displays row # on left
            for(int i = 0; i < row; i++) //adds correct spaces for row alignment
                System.out.print("    ");
            for(column = row; column <= 15; column++) //performs bitwise-AND operations with correct spacing
                System.out.printf("%4d", row & column);
            System.out.println();
        }
        //          --END INNER TABLE--
    }//end main
}//end class

/*
OUTPUT:
run:
			 Bitwise-AND Table
        0   1   2   3   4   5   6   7   8   9  10  11  12  13  14  15
-----------------------------------------------------------------------
  0 |   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0
  1 |       1   0   1   0   1   0   1   0   1   0   1   0   1   0   1
  2 |           2   2   0   0   2   2   0   0   2   2   0   0   2   2
  3 |               3   0   1   2   3   0   1   2   3   0   1   2   3
  4 |                   4   4   4   4   0   0   0   0   4   4   4   4
  5 |                       5   4   5   0   1   0   1   4   5   4   5
  6 |                           6   6   0   0   2   2   4   4   6   6
  7 |                               7   0   1   2   3   4   5   6   7
  8 |                                   8   8   8   8   8   8   8   8
  9 |                                       9   8   9   8   9   8   9
 10 |                                          10  10   8   8  10  10
 11 |                                              11   8   9  10  11
 12 |                                                  12  12  12  12
 13 |                                                      13  12  13
 14 |                                                          14  14
 15 |                                                              15
BUILD SUCCESSFUL (total time: 0 seconds)
*/
