#include<iostream>
using namespace std;

class Arithematic////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     OOPArithmetic.cpp
//  Description :   Demonstrates object-oriented programming in C++
//                  using a class that performs arithmetic operations.
//  Author :        Varad Nitin Muley
//  Date :          24/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////
//
//  Required Header files
//
/////////////////////////////////////////////////////////////////

#include<iostream>
using namespace std;

/////////////////////////////////////////////////////////////////
//
//  Class Name :    Arithematic
//  Description :   Performs basic arithmetic operations such as
//                  addition and subtraction.
//
/////////////////////////////////////////////////////////////////

class Arithematic
{
    public:
        int iNo1;
        int iNo2;

        /////////////////////////////////////////////////////////////////
        //
        //  Constructor Name : Arithematic
        //  Description      : Default constructor initializes values
        //                     to zero.
        //
        /////////////////////////////////////////////////////////////////

        Arithematic()
        {
            this->iNo1 = 0;
            this->iNo2 = 0;
        }

        /////////////////////////////////////////////////////////////////
        //
        //  Constructor Name : Arithematic
        //  Description      : Parameterized constructor initializes
        //                     values using arguments.
        //  Input            : Integer, Integer
        //
        /////////////////////////////////////////////////////////////////

        Arithematic(int A, int B)
        {
            iNo1 = A;
            iNo2 = B;
        }

        /////////////////////////////////////////////////////////////////
        //
        //  Function Name : Addition
        //  Description   : Returns addition of two numbers.
        //  Input         : void
        //  Output        : Integer
        //
        /////////////////////////////////////////////////////////////////

        int Addition()
        {
            int iAns = 0;
            iAns = iNo1 + iNo2;
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

        int Substraction()
        {
            int iAns = 0;
            iAns = iNo1 - iNo2;
            return iAns;
        }
};

/////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
/////////////////////////////////////////////////////////////////

int main()
{
    Arithematic aobj1(11,10);
    Arithematic aobj2(21,20);

    int iRet = 0;

    iRet = aobj1.Addition();
    cout << "Addition is : " << iRet << "\n";

    iRet = aobj1.Substraction();
    cout << "Subtraction is : " << iRet << "\n";

    iRet = aobj2.Addition();
    cout << "Addition is : " << iRet << "\n";

    iRet = aobj2.Substraction();
    cout << "Subtraction is : " << iRet << "\n";

    return 0;
}

/////////////////////////////////////////////////////////////////
//
//  Testcases:
//
//  Object Creation : Arithematic aobj1(11,10)
//  Output          : Addition is : 21
//                    Subtraction is : 1
//
//  Object Creation : Arithematic aobj2(21,20)
//  Output          : Addition is : 41
//                    Subtraction is : 1
//
/////////////////////////////////////////////////////////////////

{
    public:
        int iNo1 ;
        int iNo2 ;

        Arithematic()
        {
            this->iNo1 = 0;
            this->iNo2 = 0;

        }

        Arithematic(int A,int B)
        {
            iNo1 = A;
            iNo2 = B;
            
        }

        int Addition()
        {
            int iAns = 0;
            iAns = iNo1 + iNo2 ;
            return iAns;
        }

        int Substraction()
        {
            int iAns = 0;
            iAns = iNo1 - iNo2 ;
            return iAns;
        }



};

int main ()
{

    Arithematic aobj1(11,10);
    Arithematic aobj2(21,20);

    int iRet = 0;

    iRet = aobj1.Addition();
    cout<<"Addition is : "<<iRet<<"\n";

    iRet = aobj1.Substraction();
    cout<<"Subtraction is : "<<iRet<<"\n";


    iRet = aobj2.Addition();
    cout<<"Addition is : "<<iRet<<"\n";

    iRet = aobj2.Substraction();
    cout<<"Subtraction is : "<<iRet<<"\n";

    return 0;

}
