////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     FinalData3.java
//  Description :   Demonstrates behavior of final data members when
//                  initialization is attempted inside constructor
//                  after declaration.
//  Author :        Varad Nitin Muley
//  Date :          24/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////
//
//  Class Name :    Demo
//  Description :   Contains normal and final data members with
//                  constructor-based initialization.
//
/////////////////////////////////////////////////////////////////

class Demo
{
    public int i = 11;                     // Normal data member
    final public int j = 21;               // Final data member

    /////////////////////////////////////////////////////////////////
    //
    //  Constructor Name : Demo
    //  Description      : Attempts to reassign data members.
    //
    /////////////////////////////////////////////////////////////////

    public Demo()
    {
        this.i = 12;
        this.j = 22;
    }
}

/////////////////////////////////////////////////////////////////
//
//  Class Name :    FinalData3
//  Description :   Entry point class to demonstrate final keyword
//                  behavior.
//
/////////////////////////////////////////////////////////////////

class FinalData3
{
    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : main
    //  Description   : Entry point of Java application
    //  Input         : String array
    //  Output        : void
    //
    /////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        Demo dobj = new Demo();

        System.out.println(dobj.i);
        System.out.println(dobj.j);

        dobj.i++;
        // dobj.j++;     // Error
    }
}

/////////////////////////////////////////////////////////////////
//
//  Testcases:
//
//  Object Creation : Demo dobj = new Demo();
//  Output          : Compilation Error due to reassignment of
//                    final data member inside constructor.
//
/////////////////////////////////////////////////////////////////
