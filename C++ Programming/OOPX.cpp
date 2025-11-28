////////////////////////////////////////////////////////////////////////////////////////////////
//
//  File name :     OOPX.cpp
//  Description :   Demonstrates constructors in C++ by using both default
//                  and parameterized constructors within a class to perform
//                  arithmetic operations.
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
//  Description : Performs addition and subtraction using
//                class and constructor concepts.
//
/////////////////////////////////////////////////////////////////

class Arithematic
{
    public:
        int iNo1;
        int iNo2;

        Arithematic()                         // Default constructor
        {
            cout<<"Inside default constructor \n";
            iNo1 = 0;
            iNo2 = 0;
        }

        Arithematic(int A, int B)             // Parameterized constructor
        {
            cout<<"Inside Parameterized constructor \n";
            iNo1 = A;
            iNo2 = B;
        }

        int Addition()
        {
            int iAns = 0;
            iAns = iNo1 + iNo2;               // Addition logic
            return iAns;
        }

        int Substraction()
        {
            int iAns = 0;
            iAns = iNo1 - iNo2;               // Subtraction logic
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
    Arithematic aobj1(11, 10);                // Parameterized object
    Arithematic aobj2;                        // Default object

    int iRet = 0;

    iRet = aobj1.Addition();                  // Function call
    cout<<"Addition is : "<<iRet<<"\n";

    iRet = aobj1.Substraction();              // Function call
    cout<<"Subtraction is : "<<iRet<<"\n";

    return 0;
}   // End of main

/////////////////////////////////////////////////////////////////
//
//  Testcase successfully handled by the application
//
//  Output : Inside Parameterized constructor
//           Inside default constructor
//           Addition is : 21
//           Subtraction is : 1
//
/////////////////////////////////////////////////////////////////
