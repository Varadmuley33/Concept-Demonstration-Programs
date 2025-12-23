////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     FinalData2.java
//  Description :   Demonstrates initialization of final data members
//                  at the time of declaration in Java.
//  Author :        Varad Nitin Muley
//  Date :          24/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////
//
//  Class Name :    Demo
//  Description :   Contains normal and final data members initialized
//                  during declaration.
//
/////////////////////////////////////////////////////////////////

class Demo
{
    public int i = 11;                     // Normal data member
    final public int j = 21;               // Final data member
}

/////////////////////////////////////////////////////////////////
//
//  Class Name :    FinalData2
//  Description :   Entry point class to demonstrate final data
//                  member behavior.
//
/////////////////////////////////////////////////////////////////

class FinalData2
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
