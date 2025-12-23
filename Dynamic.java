////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     Dynamic.java
//  Description :   Demonstrates dynamic memory allocation for an
//                  integer array using user input in Java.
//  Author :        Varad Nitin Muley
//  Date :          24/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////
//
//  Required Header files
//
/////////////////////////////////////////////////////////////////

import java.util.Scanner;

/////////////////////////////////////////////////////////////////
//
//  Class Name :    Dynamic
//  Description :   Allocates memory dynamically for an array and
//                  checks allocation status.
//
/////////////////////////////////////////////////////////////////

class Dynamic 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int length = 0;
        int Arr[];

        System.out.println("Enter the number of elements : ");
        length = sobj.nextInt();

        Arr = new int[length];

        if(Arr == null)
        {
            System.out.println("Unable to allocate memory");
        }
        else
        {
            System.out.println("Memory gets successfully allocated");
        }

        Arr = null;
        System.gc();
    }
}

/////////////////////////////////////////////////////////////////
//
//  Testcases:
//
//  Input  : 5
//  Output : Memory gets successfully allocated
//
/////////////////////////////////////////////////////////////////
