////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     ExceptionDemo7.java
//  Description :   Demonstrates improper placement of statements
//                  between catch blocks during exception handling.
//                  Highlights compilation error with try-catch-finally.
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
//  Class Name : ExceptionDemo7
//  Description : Shows compile-time error caused by inserting
//                executable statements between catch blocks
//
/////////////////////////////////////////////////////////////////

class ExceptionDemo7
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
            iAns = iNo1 / iNo2;              // Exception prone code
        }
        catch (ArithmeticException aobj)     // Specific catch
        {
            System.out.println("Inside catch block");
            System.out.println(aobj);
        }

        // Invalid statement placement between catch blocks
        System.out.println("Hello");

        catch (Exception eobj)               // Generic catch (Unreachable)
        {
            System.out.println("Inside Generic catch ");
        }
        finally
        {
            System.out.println("Inside finally block");
        }

        // Display result
        System.out.println("Division is : " + iAns);
    }
}

/////////////////////////////////////////////////////////////////
//
//  Testcases (Compilation error scenario)
//
//  Note : Program fails to compile due to executable statement
//         placed between catch blocks.
//
/////////////////////////////////////////////////////////////////
