////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     ThreadUserDefined1.java
//  Description :   Demonstrates creation of user-defined thread
//                  by extending Thread class and overriding
//                  run method.
//  Author :        Varad Nitin Muley
//  Date :          29/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////
//
//  Class Name :    Demo
//  Description :   User-defined thread class that extends
//                  Thread and provides run method implementation.
//
/////////////////////////////////////////////////////////////////

class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside run method ");
    }
}

/////////////////////////////////////////////////////////////////
//
//  Class Name :    ThreadUserDefined1
//  Description :   Entry point class that creates and starts
//                  a user-defined thread.
//
/////////////////////////////////////////////////////////////////

class ThreadUserDefined1
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
        Demo dobj1 = new Demo();
        dobj1.start();
    }
}
