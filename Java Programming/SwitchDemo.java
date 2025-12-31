////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     SwitchDemo.java
//  Description :   Demonstrates use of switch-case statement
//                  to display exam timing based on standard.
//  Author :        Varad Nitin Muley
//  Date :          29/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////
//
//  Class Name :    SwitchDemo
//  Description :   Accepts standard from user and displays
//                  corresponding exam time using switch-case.
//
/////////////////////////////////////////////////////////////////

import java.util.Scanner;

class SwitchDemo
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
        Scanner sobj = new Scanner(System.in);

        int iStd = 0;

        System.out.println("Enter your Standard   : ");
        iStd = sobj.nextInt();
        
        switch (iStd)
        {
            case 1:
                System.out.println ("Exam is at 9 AM");
                break;
                
            case 2:
                System.out.println ("Exam is at 10 AM");
                break;

            case 3:
                System.out.println ("Exam is at 11 AM");
                break;

            case 4:
                System.out.println ("Exam is at 12 AM");
                break;

            default:
                System.out.println("Invalid input");
        }
    }
}
