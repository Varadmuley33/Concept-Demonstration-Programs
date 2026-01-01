////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     ThrowDemo.java
//  Description :   Demonstrates user-defined exception handling
//                  using throw and custom exception class.
//  Author :        Varad Nitin Muley
//  Date :          30/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

/////////////////////////////////////////////////////////////////
//
//  Class Name :    AgeInvalidException
//  Description :   Custom exception class to handle invalid
//                  age condition.
//
/////////////////////////////////////////////////////////////////

class AgeInvalidException extends Exception
{
    public AgeInvalidException(String str)
    {
        super(str);
    }
}

/////////////////////////////////////////////////////////////////
//
//  Class Name :    ThrowDemo
//  Description :   Entry point class that validates age and
//                  throws custom exception if invalid.
//
/////////////////////////////////////////////////////////////////

class ThrowDemo
{
    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : main
    //  Description   : Entry point of Java application.
    //  Input         : String array
    //  Output        : void
    //
    /////////////////////////////////////////////////////////////////

    public static void main (String A[]) 
    {
        Scanner sobj = new Scanner (System.in);

        System.out.println("Enter your age : ");
        int iAge = sobj.nextInt();

        try
        {
            if(iAge < 18)
            {
                throw new AgeInvalidException("Your age is below 18");
            }
        }
        catch (AgeInvalidException aobj)
        {
            System.out.println(aobj);
        }
    }
}
