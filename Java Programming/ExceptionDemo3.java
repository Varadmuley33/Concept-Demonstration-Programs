////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     ExceptionDemo3.java
//  Description :   Demonstrates integer division of two user-entered
//                  numbers using basic input handling.
//                  Displays the quotient as an integer value.
//  Author :        Varad Nitin Muley
//  Date :          27/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////
//
//  Required Header files
//
/////////////////////////////////////////////////////////////////

import java.util.*;

/////////////////////////////////////////////////////////////////
//
//  Class Name : ExceptionDemo3
//  Description : Performs integer division and displays
//                the division result
//
/////////////////////////////////////////////////////////////////

class ExceptionDemo3 
{
    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function
    //
    /////////////////////////////////////////////////////////////////

    public static void main (String A[])
    {
        Scanner sobj = new Scanner (System.in);

        int iNo1 = 0;     // First number
        int iNo2 = 0;     // Second number
        int iAns = 0;     // Division result

        // Accept first number
        System.out.println("Enter First number ");
        iNo1 = sobj.nextInt();

        // Accept second number
        System.out.println("Enter Second number ");
        iNo2 = sobj.nextInt();

        // Perform integer division
        iAns = iNo1 / iNo2;

        // Display result
        System.out.println("Division is : " + iAns);
    }
}

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 20 5
//  Output : 4
//
//  Input : 9 2
//  Output : 4
//
//  Input : 15 3
//  Output : 5
//
/////////////////////////////////////////////////////////////////
