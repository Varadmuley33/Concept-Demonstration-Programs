////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     FinalData4.java
//  Description :   Demonstrates initialization of final data member
//                  using a parameterized constructor in Java.
//  Author :        Varad Nitin Muley
//  Date :          24/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////
//
//  Class Name :    Demo
//  Description :   Contains normal and final data members initialized
//                  through a parameterized constructor.
//
/////////////////////////////////////////////////////////////////

class Demo
{
    public int i;                          // Normal data member
    final public int j;                   // Final data member

    /////////////////////////////////////////////////////////////////
    //
    //  Constructor Name : Demo
    //  Description      : Initializes data members using parameters.
    //  Input            : Integer, Integer
    //
    /////////////////////////////////////////////////////////////////

    public Demo(int a, int b)
    {
        this.i = a;
        this.j = b;
    }
}

/////////////////////////////////////////////////////////////////
//
//  Class Name :    FinalData4
//  Description :   Entry point class to demonstrate final data
//                  member initialization via constructor.
//
/////////////////////////////////////////////////////////////////

class FinalData4
{
    public static void main(String A[])
    {
        Demo dobj = new Demo(11,21);

        System.out.println(dobj.i);
        System.out.println(dobj.j);
        
        dobj.i++;
        // dobj.j++;   // Error
    }
}

/////////////////////////////////////////////////////////////////
//
//  Testcases:
//
//  Object Creation : Demo dobj = new Demo(11,21);
//  Output          : 11
//                    21
//
//  Operation       : dobj.i++
//  Result          : Allowed
//
//  Operation       : dobj.j++
//  Result          : Compilation Error
//
/////////////////////////////////////////////////////////////////
