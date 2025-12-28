////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     ExceptionDemo10.java
//  Description :   Demonstrates exception handling while accessing
//                  array elements using user-provided index value.
//                  Shows the use of try, catch, and finally blocks.
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
//  Class Name : ExceptionDemo10
//  Description : Handles runtime exceptions occurring due to
//                invalid array index access
//
/////////////////////////////////////////////////////////////////

class ExceptionDemo10
{
    /////////////////////////////////////////////////////////////////
    //
    //  Entry point function
    //
    /////////////////////////////////////////////////////////////////

    public static void main (String A[])
    {
        Scanner sobj = new Scanner (System.in);

        int Arr[] = {10, 20, 30, 40, 50};   // Integer array
        int iIndex = 0;                    // Index value
        int iData = 0;                     // Element at index

        // Accept index from user
        System.out.println("Enter the index  number ");
        iIndex = sobj.nextInt();

        try
        {
            System.out.println("Inside try");
            iData = Arr[iIndex];            // Exception prone code
        }
        catch(Exception eobj)
        {
            System.out.println("Inside catch");
            System.out.println(eobj);       // Display exception details
        }
        finally
        {
            System.out.println("Inside finally");
        }

        // Display array element
        System.out.println("Element at that index is  : " + iData);
    }       
}

/////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 2
//  Output : 30
//
//  Input : 0
//  Output : 10
//
//  Input : 4
//  Output : 50
//
/////////////////////////////////////////////////////////////////
