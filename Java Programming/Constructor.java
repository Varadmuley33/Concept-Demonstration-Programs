////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     ConstructorDemo.java
//  Description :   Demonstrates the use of default and parameterized
//                  constructors in Java.
//  Author :        Varad Nitin Muley
//  Date :          24/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////
//
//  Class Name :    Demo
//  Description :   Contains data members and constructors.
//
/////////////////////////////////////////////////////////////////

class Demo
{
    public int iNo1; 
    public int iNo2;

    /////////////////////////////////////////////////////////////////
    //
    //  Constructor Name : Demo
    //  Description      : Default constructor.
    //
    /////////////////////////////////////////////////////////////////

    public Demo()
    {
        System.out.println("Inside Default Constructor");
    }

    public Demo(int i,int j)
    {
        System.out.println("Inside Parameterized constructor");
    }
}

/////////////////////////////////////////////////////////////////
//
//  Class Name :    Constructor
//  Description :   Entry point class.
//
/////////////////////////////////////////////////////////////////

class Constructor
{

    public static void main(String Arr[])
    {
        Demo dobj1 = new Demo();                   // Demo dobj1(); in C++

        Demo dobj2 = new Demo(11,21);              // Demo dobj2(11,21); in C++
    }
}

/////////////////////////////////////////////////////////////////
//
//  Testcases:
//
//  Object Creation : new Demo()
//  Output          : Inside Default Constructor
//
//  Object Creation : new Demo(11,21)
//  Output          : Inside Parameterized constructor
//
/////////////////////////////////////////////////////////////////
