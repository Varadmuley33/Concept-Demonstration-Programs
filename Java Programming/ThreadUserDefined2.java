////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     ThreadUserDefined2.java
//  Description :   Demonstrates execution of multiple user-defined
//                  threads by creating more than one Thread object.
//  Author :        Varad Nitin Muley
//  Date :          29/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////
//
//  Class Name :    Demo
//  Description :   User-defined thread class extending Thread
//                  with overridden run method.
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
//  Class Name :    ThreadUserDefined2
//  Description :   Entry point class that creates and starts
//                  multiple user-defined threads.
//
/////////////////////////////////////////////////////////////////

class ThreadUserDefined2
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
        System.out.println("Inside Main thread");

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        dobj1.start();
        dobj2.start();

        System.out.println("End of main thread");
    }
}
