////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     ExceptionDemo6.java
//  Description :   Demonstrates incorrect ordering of catch blocks
//                  during division of two user-entered integers.
//                  Highlights error caused by generic catch before
//                  specific exception handling.
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
//  Class Name : ExceptionDemo6
//  Description : Shows exception handling error due to improper
//                catch block sequence
//
/////////////////////////////////////////////////////////////////

class ExceptionDemo6
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

        // Error due to incorrect catch sequence
        catch (Exception eobj)               // Generic catch
        {
            System.out.println("Inside Generic catch ");
        }
        catch (ArithmeticException aobj)     // Specific catch (Unreachable)
        {
            System.out.println("Inside catch block");
            System.out.println(aobj);
        }

        // Display result
        System.out.println("Division is : " + iAns);
    }
}

/////////////////////////////////////////////////////////////////
//
//  Testcases (Compilation error scenario)
//
//  Note : Program demonstrates compile-time error due to
//         unreachable catch block.
//
/////////////////////////////////////////////////////////////////
