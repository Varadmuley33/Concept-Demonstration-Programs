////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     ThreadDemo2.java
//  Description :   Demonstrates retrieval of current thread
//                  using Thread object and displays its name.
//  Author :        Varad Nitin Muley
//  Date :          29/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////
//
//  Class Name :    ThreadDemo2
//  Description :   Obtains current thread reference and
//                  prints its name from main method.
//
/////////////////////////////////////////////////////////////////

class ThreadDemo2
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

        Thread tobj = Thread.currentThread();
        String name = tobj.getName();
        
        System.out.println("Name of current thread is : " + name);
    }
}
