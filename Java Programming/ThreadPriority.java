////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     ThreadPriority.java
//  Description :   Demonstrates thread priority retrieval and
//                  modification using Thread class methods.
//  Author :        Varad Nitin Muley
//  Date :          29/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////
//
//  Class Name :    ThreadPriority
//  Description :   Displays and modifies priority of the
//                  currently executing thread.
//
/////////////////////////////////////////////////////////////////

class ThreadPriority
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

        int Priority = tobj.getPriority();
        System.out.println("Priority of current thread is : " + Priority);

        tobj.setPriority(10);

        Priority = tobj.getPriority();
        System.out.println("Priority of current thread is : " + Priority);
    }
}
