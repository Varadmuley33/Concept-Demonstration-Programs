////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     ThreadUserDefinedSynchronised.java
//  Description :   Demonstrates table printing logic and basic
//                  thread-related structure for synchronization
//                  concept illustration.
//  Author :        Varad Nitin Muley
//  Date :          30/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////
//
//  Class Name :    TablePrinter
//  Description :   Provides functionality to print multiplication
//                  table using current thread information.
//
/////////////////////////////////////////////////////////////////

class TablePrinter
{
    public void PrintTable(int n)
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
//  Description :   User-defined thread class with empty run method.
//
/////////////////////////////////////////////////////////////////

class Demo extends Thread
{
    public void run()  
    {
    }
}

/////////////////////////////////////////////////////////////////
//
//  Class Name :    ThreadUserDefinedSynchronised
//  Description :   Entry point class that invokes table printing
//                  methods sequentially.
//
/////////////////////////////////////////////////////////////////

class ThreadUserDefinedSynchronised
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
        TablePrinter tobj = new TablePrinter();

        tobj.PrintTable(5);
        tobj.PrintTable(4);
    }
}
