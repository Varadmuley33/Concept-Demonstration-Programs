////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     ThreadUserDefinedJoinXX.java
//  Description :   Demonstrates synchronization of multiple
//                  user-defined threads using join() method
//                  with exception handling.
//  Author :        Varad Nitin Muley
//  Date :          30/11/2025
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
//  Class Name :    ThreadUserDefinedJoinXX
//  Description :   Entry point class that starts multiple threads
//                  and waits for their completion using join()
//                  inside try-catch block.
//
/////////////////////////////////////////////////////////////////

class ThreadUserDefinedJoinXX
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

        // Checked Exception
        try
        {
            dobj1.join();
            dobj2.join();
        }
        catch(InterruptedException iobj)
        {
        }

        System.out.println("End of main thread");
    }
}
