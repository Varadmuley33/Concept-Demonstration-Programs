////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     FinalData1.java
//  Description :   Demonstrates the use of final data members in Java
//                  and their behavior after object creation.
//  Author :        Varad Nitin Muley
//  Date :          24/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////
//
//  Class Name :    Demo
//  Description :   Contains normal and final data members initialized
//                  inside the constructor.
//
/////////////////////////////////////////////////////////////////

class Demo
{
    public int i;                          // Normal data member
    final public int j;                   // Final data member

    /////////////////////////////////////////////////////////////////
    //
    //  Constructor Name : Demo
    //  Description      : Initializes data members of the class.
    //
    /////////////////////////////////////////////////////////////////

    public Demo()
    {
        this.i = 11;
        this.j = 21;
    }
}

/////////////////////////////////////////////////////////////////
//
//  Class Name :    FinalData1
//  Description :   Entry point class to demonstrate final keyword.
//
/////////////////////////////////////////////////////////////////

class FinalData1
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
        dobj.j++;       // Error
    }
}

/////////////////////////////////////////////////////////////////
//
//  Testcases:
//
//  Object Creation : Demo dobj = new Demo();
//  Initial Output  : 11
//                    21
//
//  Operation       : dobj.i++
//  Result          : Allowed
//
//  Operation       : dobj.j++
//  Result          : Compilation Error
//
/////////////////////////////////////////////////////////////////
