////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     ThreadUserDefinedSleepX.java
//  Description :   Demonstrates thread scheduling using sleep()
//                  method where execution pauses for a fixed
//                  time interval between iterations.
//  Author :        Varad Nitin Muley
//  Date :          30/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////

// Code to demonstrate thread scheduling

/////////////////////////////////////////////////////////////////
//
//  Class Name :    Demo
//  Description :   User-defined thread class that pauses execution
//                  using sleep() method inside run method.
//
/////////////////////////////////////////////////////////////////

class Demo extends Thread
{
    public void run()  
    {
        int i = 0;

        try
        {
            for (i = 1 ; i <= 5 ; i++)
            {
                Thread.sleep(1000);
                System.out.println("Inside run method of : " + Thread.currentThread().getName());
            }
        }
        catch(InterruptedException iobj)
        {
        }
    }
}

/////////////////////////////////////////////////////////////////
//
//  Class Name :    ThreadUserDefinedSleepX
//  Description :   Entry point class that starts multiple threads
//                  and waits for their completion.
//
/////////////////////////////////////////////////////////////////

class ThreadUserDefinedSleepX
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
