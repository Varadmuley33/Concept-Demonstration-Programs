////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     ThreadUserDefinedSleep.java
//  Description :   Demonstrates basic thread scheduling where
//                  multiple threads execute concurrently and
//                  main thread waits for completion.
//  Author :        Varad Nitin Muley
//  Date :          30/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////

// Code to demonstrate thread scheduling

/////////////////////////////////////////////////////////////////
//
//  Class Name :    Demo
//  Description :   User-defined thread class that executes
//                  repetitive tasks inside run method.
//
/////////////////////////////////////////////////////////////////

class Demo extends Thread
{
    public void run()
    {
        int i = 0;
        for (i = 1 ; i <= 5 ; i++)
        {
            System.out.println("Inside run method of : " + Thread.currentThread().getName());
        }
    }
}

/////////////////////////////////////////////////////////////////
//
//  Class Name :    ThreadUserDefinedSleep
//  Description :   Entry point class that starts multiple threads
//                  and waits for their completion.
//
/////////////////////////////////////////////////////////////////

class ThreadUserDefinedSleep
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

        try
        {
            dobj1.start();
            dobj2.start();

            dobj1.join();
            dobj2.join();
        }
        catch(InterruptedException iobj)
        {
        }

        System.out.println("End of main thread");
    }
}
