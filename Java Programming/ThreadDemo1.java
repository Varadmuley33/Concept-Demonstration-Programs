////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     ThreadDemo1.java
//  Description :   Demonstrates basic thread execution by
//                  accessing the current thread and displaying
//                  its name.
//  Author :        Varad Nitin Muley
//  Date :          29/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////
//
//  Class Name :    ThreadDemo1
//  Description :   Displays the name of the currently executing
//                  thread from the main method.
//
/////////////////////////////////////////////////////////////////

class ThreadDemo1
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
        System.out.println("Inside Main method");

        String name = Thread.currentThread().getName();
        System.out.println("Name of current thread is : " + name);
    }
}
