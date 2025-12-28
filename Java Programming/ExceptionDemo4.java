////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     ExceptionDemo4.java
//  Description :   Demonstrates handling of arithmetic exception
//                  during division of two user-entered integers.
//                  Uses try and catch blocks to prevent abnormal termination.
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
//  Class Name : ExceptionDemo4
//  Description : Performs integer division with exception handling
//                for divide-by-zero condition
//
/////////////////////////////////////////////////////////////////

class ExceptionDemo4
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

        try
        {
            System.out.println("Inside Try block");
            iAns = iNo1 / iNo2;          // Exception prone code
        }
        catch (ArithmeticException aobj)
        {
            System.out.println("Inside catch block");
            System.out.println(aobj);    // Display exception details
        }

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
//  Input : 8 0
//  Output : ArithmeticException
//
//  Input : 20 4
//  Output : 5
//
/////////////////////////////////////////////////////////////////
