////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     OOPX.java
//  Description :   Demonstrates object-oriented programming concepts
//                  using a class that performs arithmetic operations.
//  Author :        Varad Nitin Muley
//  Date :          24/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////
//
//  Class Name :    Arithematic
//  Description :   Performs basic arithmetic operations such as
//                  addition and subtraction using instance data.
//
/////////////////////////////////////////////////////////////////

class Arithematic
{
    public int iNo1; 
    public int iNo2;

    /////////////////////////////////////////////////////////////////
    //
    //  Constructor Name : Arithematic
    //  Description      : Default constructor initializes values to zero.
    //
    /////////////////////////////////////////////////////////////////

    public Arithematic()
    {
        this.iNo1 = 0;
        this.iNo2 = 0;
    }

    /////////////////////////////////////////////////////////////////
    //
    //  Constructor Name : Arithematic
    //  Description      : Parameterized constructor initializes values.
    //  Input            : Integer, Integer
    //
    /////////////////////////////////////////////////////////////////

    public Arithematic(int i, int j)
    {
        this.iNo1 = i;
        this.iNo2 = j;
    }

    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : Addition
    //  Description   : Returns addition of two numbers.
    //  Input         : void
    //  Output        : Integer
    //
    /////////////////////////////////////////////////////////////////

    public int Addition()
    {
        int iAns = 0;
        iAns = this.iNo1 + this.iNo2;
        return iAns;
    }

    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : Substraction
    //  Description   : Returns subtraction of two numbers.
    //  Input         : void
    //  Output        : Integer
    //
    /////////////////////////////////////////////////////////////////

    public int Substraction()
    {
        int iAns = 0;
        iAns = this.iNo1 - this.iNo2;
        return iAns;
    }
}

/////////////////////////////////////////////////////////////////
//
//  Class Name :    OOPX
//  Description :   Entry point class to demonstrate usage of
//                  Arithematic class.
//
/////////////////////////////////////////////////////////////////

class OOPX
{
    /////////////////////////////////////////////////////////////////
    //
    //  Function Name : main
    //  Description   : Entry point of Java application
    //  Input         : String array
    //  Output        : void
    //
    /////////////////////////////////////////////////////////////////

    public static void main(String Arr[])
    {
        Arithematic aobj1 = new Arithematic(11, 10);

        int iRet = 0;

        iRet = aobj1.Addition();
        System.out.println("Addition is : " + iRet); 

        iRet = aobj1.Substraction();
        System.out.println("Substraction is : " + iRet); 

        aobj1 = null;
    }
}

/////////////////////////////////////////////////////////////////
//
//  Testcases:
//
//  Object Creation : Arithematic aobj1 = new Arithematic(11,10);
//
//  Function Call   : Addition()
//  Output          : Addition is : 21
//
//  Function Call   : Substraction()
//  Output          : Substraction is : 1
//
/////////////////////////////////////////////////////////////////
