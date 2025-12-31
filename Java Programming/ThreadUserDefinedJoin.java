////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     ThreadUserDefinedJoin.java
//  Description :   Demonstrates creation of multiple user-defined
//                  threads and assigning custom names to them.
//  Author :        Varad Nitin Muley
//  Date :          29/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////
//
//  Class Name :    Demo
//  Description :   User-defined thread class that prints
//                  the name of the currently executing thread.
//
/////////////////////////////////////////////////////////////////

class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside run method of : " + Thread.currentThread().getName());
    }
}

/////////////////////////////////////////////////////////////////
//
//  Class Name :    ThreadUserDefinedJoin
//  Description :   Entry point class that creates threads,
//                  assigns names, and starts execution.
//
/////////////////////////////////////////////////////////////////

class ThreadUserDefinedJoin
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

        dobj1.setName("First");
        dobj2.setName("Second");

        dobj1.start();
        dobj2.start();

        System.out.println("End of main thread");
    }
}
