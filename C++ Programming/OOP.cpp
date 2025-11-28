////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     OOP.cpp
//  Description :   Demonstrates object-oriented programming by implementing
//                  a class to perform addition and subtraction using
//                  parameterized constructor in C++.
//  Author :        Varad Nitin Muley
//  Date :          17/10/2025
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
//  Class Name : Arithematic
//  Description : Performs arithmetic operations using class
//                and constructors.
//
/////////////////////////////////////////////////////////////////

class Arithematic
{
    public:
        int iNo1;
        int iNo2;

        Arithematic()                   // Default constructor
        {
            iNo1 = 0;
            iNo2 = 0;
        }

        Arithematic(int A, int B)        // Parameterized constructor
        {
            iNo1 = A;
            iNo2 = B;
        }

        int Addition()
        {
            int iAns = 0;
            iAns = iNo1 + iNo2;          // Addition logic
            return iAns;
        }

        int Substraction()
        {
            int iAns = 0;
            iAns = iNo1 - iNo2;          // Subtraction logic
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
    Arithematic aobj1(11, 10);           // Object creation

    int iRet = 0;

    iRet = aobj1.Addition();             // Function call
    cout<<"Addition is : "<<iRet<<"\n";

    iRet = aobj1.Substraction();         // Function call
    cout<<"Subtraction is : "<<iRet<<"\n";

    return 0;
}   // End of main

/////////////////////////////////////////////////////////////////
//
//  Testcase successfully handled by the application
//
//  Output : Addition is : 21
//           Subtraction is : 1
//
/////////////////////////////////////////////////////////////////
