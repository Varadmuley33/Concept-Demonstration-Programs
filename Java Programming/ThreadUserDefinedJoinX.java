////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     ThreadUserDefinedJoinX.java
//  Description :   Demonstrates concurrent execution of multiple
//                  user-defined threads and synchronization
//                  using join() method.
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
//  Class Name :    ThreadUserDefinedJoinX
//  Description :   Entry point class that starts multiple threads
//                  and waits for their completion using join().
//
/////////////////////////////////////////////////////////////////

class ThreadUserDefinedJoinX
{
    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : main
    //  Description   : Entry point of Java application.
    //  Input         : String array
    //  Output        : void
    //
    /////////////////////////////////////////////////////////////////

    public static void main (String A[]) throws InterruptedException
    {
        System.out.println("Inside Main thread");

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        dobj1.setName("First");
        dobj2.setName("Second");

        dobj1.start();
        dobj2.start();

        dobj1.join();
        dobj2.join();

        System.out.println("End of main thread");
    }
}
