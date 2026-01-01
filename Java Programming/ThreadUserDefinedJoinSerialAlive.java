////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     ThreadUserDefinedJoinSerialAlive.java
//  Description :   Demonstrates serial execution of user-defined
//                  threads along with checking thread alive
//                  status using isAlive() method.
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
//  Class Name :    ThreadUserDefinedJoinSerialAlive
//  Description :   Entry point class that executes threads
//                  serially and checks their alive status.
//
/////////////////////////////////////////////////////////////////

class ThreadUserDefinedJoinSerialAlive
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

        // Checked Exception
        try
        {
            dobj1.start();
            System.out.println("Is first thread alive ? :" + dobj1.isAlive());

            dobj1.join();
            System.out.println("End of first thread");

            System.out.println("Is first thread alive ? :" + dobj1.isAlive());

            dobj2.start();
            dobj2.join();
            System.out.println("End of Second thread");
        }
        catch(InterruptedException iobj)
        {
        }

        System.out.println("End of main thread");
    }
}
