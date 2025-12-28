////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     ExceptionDemo2.java
//  Description :   Demonstrates division of two user-entered integers
//                  by performing explicit type casting to obtain
//                  a floating-point division result.
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
//  Class Name : ExceptionDemo2
//  Description : Performs floating-point division of two integers
//                using explicit type conversion
//
/////////////////////////////////////////////////////////////////

class ExceptionDemo2 
{
    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function
    //
    /////////////////////////////////////////////////////////////////

    public static void main (String A[])
    {
        Scanner sobj = new Scanner (System.in);

        int iNo1 = 0;        // First number
        int iNo2 = 0;        // Second number
        float fAns = 0;      // Division result

        // Accept first number
        System.out.println("Enter First number ");
        iNo1 = sobj.nextInt();

        // Accept second number
        System.out.println("Enter Second number ");
        iNo2 = sobj.nextInt();

        // Perform floating-point division
        fAns = (float)iNo1 / (float)iNo2;

        // Display result
        System.out.println("Division is : " + fAns);
    }
}

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 10 4
//  Output : 2.5
//
//  Input : 7 2
//  Output : 3.5
//
//  Input : 9 3
//  Output : 3.0
//
/////////////////////////////////////////////////////////////////
