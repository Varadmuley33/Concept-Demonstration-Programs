////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     ExceptionDemo9.java
//  Description :   Demonstrates direct access of array elements
//                  using a user-provided index without exception
//                  handling, leading to possible runtime errors.
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
//  Class Name : ExceptionDemo9
//  Description : Accesses array elements directly based on
//                user input index value
//
/////////////////////////////////////////////////////////////////

class ExceptionDemo9
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

        // Direct array access (exception prone)
        iData = Arr[iIndex];

        // Display array element
        System.out.println("Element at that index is  : " + iData);
    }
}

/////////////////////////////////////////////////////////////////
//
//  Testcases (Runtime exception possible)
//
//  Input : 2
//  Output : 30
//
//  Input : 0
//  Output : 10
//
//  Input : 10
//  Output : ArrayIndexOutOfBoundsException
//
/////////////////////////////////////////////////////////////////
