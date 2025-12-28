////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     ExceptionDemo8.java
//  Description :   Demonstrates proper use of multiple catch blocks
//                  along with finally block during integer division.
//                  Handles both specific and generic exceptions.
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
//  Class Name : ExceptionDemo8
//  Description : Performs division using try, catch, and finally
//                blocks with correct exception handling sequence
//
/////////////////////////////////////////////////////////////////

class ExceptionDemo8
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
/////////////////////////
