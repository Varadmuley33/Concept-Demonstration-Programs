////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     ExceptionDemo1.java
//  Description :   Demonstrates division of two user-entered numbers
//                  using basic input handling. The program performs
//                  integer division without exception handling.
//                  Original logic and structure are preserved.
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
//  Class Name : ExceptionDemo1
//  Description : Accepts two integers from user and displays
//                their division result
//
/////////////////////////////////////////////////////////////////

class ExceptionDemo1 
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

        // Perform division
        iAns = iNo1 / iNo2;

        // Display result
        System.out.println("Division is : " + iAns);
    }
}

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 10 2
//  Output : 5
//
//  Input : 20 4
//  Output : 5
//
//  Input : 9 3
//  Output : 3
//
/////////////////////////////////////////////////////////////////
