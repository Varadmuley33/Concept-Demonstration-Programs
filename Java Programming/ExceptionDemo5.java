////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     ExceptionDemo5.java
//  Description :   Demonstrates handling of multiple exceptions
//                  during division of two user-entered integers.
//                  Uses both specific and generic catch blocks.
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
//  Class Name : ExceptionDemo5
//  Description : Performs integer division using multiple
//                catch blocks for exception handling
//
/////////////////////////////////////////////////////////////////

class ExceptionDemo5
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
        catch (Exception eobj)               // Generic catch
        {
            System.out.println("Inside Generic catch ");
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
