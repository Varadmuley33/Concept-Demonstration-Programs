////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     SuperDemo.java
//  Description :   Demonstrates usage of super keyword in Java
//                  for constructor calling, variable access,
//                  and method invocation in inheritance.
//  Author :        Varad Nitin Muley
//  Date :          29/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////
//
//  Class Name :    Hello
//  Description :   Base class containing a data member and
//                  a display method.
//
/////////////////////////////////////////////////////////////////

class Hello
{
    public int i ;

    public Hello(int no )
    {
        System.out.println("Inside Hello Constructor");
        this.i = no + 1 ;
    }

    public void Display()
    {
        System.out.println("Inside Hello display");
    }
}

/////////////////////////////////////////////////////////////////
//
//  Class Name :    Demo
//  Description :   Derived class that extends Hello and uses
//                  super keyword for constructor, variable,
//                  and method access.
//
/////////////////////////////////////////////////////////////////

class Demo extends Hello
{
    public int i ;

    Demo(int a)
    {
        super(a);                            
        System.out.println("Inside Demo constructor");
        this.i = a;
    }

    public void Display()
    {
        int i = 0;
        System.out.println("Inside display : "+ i);       
        System.out.println("Inside display : "+ this.i);  
        System.out.println("Inside display : "+ super.i); 
        super.Display();     
    }
}

/////////////////////////////////////////////////////////////////
//
//  Class Name :    SuperDemo
//  Description :   Entry point class of the application.
//
/////////////////////////////////////////////////////////////////

class SuperDemo
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
        Demo dobj = new Demo(51);
        dobj.Display();
    }
}
