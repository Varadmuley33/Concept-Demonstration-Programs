////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     ThreadUserDefinedSynchronisedXX.java
//  Description :   Demonstrates method-level synchronization
//                  to ensure mutual exclusion while printing
//                  tables using shared object.
//  Author :        Varad Nitin Muley
//  Date :          30/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////
//
//  Class Name :    TablePrinter
//  Description :   Provides synchronized method to print
//                  multiplication table using current thread.
//
/////////////////////////////////////////////////////////////////

class TablePrinter
{
    synchronized public void PrintTable(int n)
    {
        int i = 0;
        
        for(i = 1 ; i <= 10 ; i++)
        {
            System.out.println("Name : " + Thread.currentThread().getName() + " : " + n * i);
        }
    }
}

/////////////////////////////////////////////////////////////////
//
//  Class Name :    Demo
//  Description :   User-defined thread class that invokes
//                  synchronized table printing method.
//
/////////////////////////////////////////////////////////////////

class Demo extends Thread
{
    public TablePrinter tobj;
    public int no;

    public Demo(TablePrinter t, int n, String name)
    {
        tobj = t;
        no = n;
        setName(name);
    }

    public void run()  
    {
        tobj.PrintTable(no);
    }
}

/////////////////////////////////////////////////////////////////
//
//  Class Name :    ThreadUserDefinedSynchronisedXX
//  Description :   Entry point class that creates multiple threads
//                  sharing the same synchronized object.
//
/////////////////////////////////////////////////////////////////

class ThreadUserDefinedSynchronisedXX
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
        TablePrinter obj = new TablePrinter();

        Demo dobj1 = new Demo(obj, 4, "First");
        Demo dobj2 = new Demo(obj, 5, "Second");

        dobj1.start();
        dobj2.start();

        try
        {
            dobj1.join();
            dobj2.join();
        }
        catch(InterruptedException eobj)
        {
        }
    }
}
