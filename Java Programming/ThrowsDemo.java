////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     ThrowsDemo.java
//  Description :   Demonstrates exception propagation using
//                  throws keyword and handling ArithmeticException.
//  Author :        Varad Nitin Muley
//  Date :          30/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////
//
//  Class Name :    Demo
//  Description :   Provides division operation which propagates
//                  exception using throws keyword.
//
/////////////////////////////////////////////////////////////////

class Demo 
{
    public int Division(int No1 , int No2 ) throws ArithematicException
    {
        int iAns = 0 ;
        iAns = No1 / No2 ;
        return iAns ; 
    }
}

/////////////////////////////////////////////////////////////////
//
//  Class Name :    ThrowsDemo
//  Description :   Entry point class that calls division method
//                  and handles exception using try-catch.
//
/////////////////////////////////////////////////////////////////

class ThrowsDemo
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
        Demo obj = new Demo ();

        int Ret = 0 ;

        try
        {
            Ret = obj.Division(11, 0);
        }
        catch (ArithmeticException aobj)
        {
            System.out.println("Inside catch " + aobj);
        }

        System.out.println("Division is : " + Ret);
    }
}
