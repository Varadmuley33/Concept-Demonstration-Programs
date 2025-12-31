////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     ThisDemo.java
//  Description :   Demonstrates use of static block, constructor
//                  chaining using this keyword, and instance
//                  variable initialization in Java.
//  Author :        Varad Nitin Muley
//  Date :          29/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////
//
//  Class Name :    Demo
//  Description :   Contains static and instance variables,
//                  constructors, and a display method.
//
/////////////////////////////////////////////////////////////////

class Demo 
{
    public int i ;
    public static int j ;

    static 
    {
        j = 21;
    }

    Demo ()
    {
        System.out.println("Inside Demo ");
        this.i = 11;
    }

    public Demo(int a )
    {
        this();
        System.out.println("Inside Parameterized ");
    }

    public void Display()
    {
        System.out.println("Inside display"+ this.i);
    }
}

/////////////////////////////////////////////////////////////////
//
//  Class Name :    ThisDemo
//  Description :   Entry point class of the application.
//
/////////////////////////////////////////////////////////////////

class ThisDemo
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
        Demo dobj = new Demo();
        dobj.Display();
    }
}
